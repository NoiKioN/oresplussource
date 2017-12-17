package com.noikion.noresplus.eventHandlers;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.items.specific_items.tools.RefinerItem;
import com.noikion.noresplus.lists.gem.GemBlockNamesListedInTypes;

import net.minecraft.block.Block;
import net.minecraft.util.EnumActionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class playerEventHandler {

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onBlockActivated(PlayerInteractEvent.RightClickBlock event) throws InterruptedException {
        if (event.getEntityPlayer().getHeldItemMainhand() != null) {
            if (event.getEntityPlayer().getHeldItemMainhand().getItem() instanceof RefinerItem) {
                boolean done = false;
                if (event.getEntityPlayer().getHeldItemMainhand().getItem().onItemUse(event.getEntityPlayer().getHeldItemMainhand(),
                    event.getEntityPlayer(), event.getWorld(), event.getPos(), event.getHand(), event.getFace(),
                    (float) event.getHitVec().xCoord, (float) event.getHitVec().yCoord, (float) event.getHitVec().zCoord) == EnumActionResult.SUCCESS) {

                    final String[][] blockPairs = GemBlockNamesListedInTypes.GEM_BLOCKS_TO_BE_SWITCHED.getBlockNamePairs();

                    boolean success = false;

                    if (!done) {
                        for (String[] blockPair : blockPairs) {
                            if (checkBlockAtPosition(event, BlockNameToBlock.getRegisteredBlockByName(blockPair[0]))) {
                                event.getWorld().setBlockState(event.getPos(), BlockNameToBlock.getRegisteredBlockByName(blockPair[1]).getDefaultState());
                                success = true;
                                done = true;
                                break;
                            }
                        }
                    }

                    if (success) {
                        event.getEntityPlayer().getHeldItemMainhand().damageItem(3, event.getEntityPlayer());
                        event.getEntityPlayer().resetCooldown();
                    }
                }
            }
        }
    }

    private boolean checkBlockAtPosition(PlayerInteractEvent.RightClickBlock event, Block block) {
        if (event.getWorld().getBlockState(event.getPos()).getBlock() == block) {
            return true;
        }
        return false;
    }
}
