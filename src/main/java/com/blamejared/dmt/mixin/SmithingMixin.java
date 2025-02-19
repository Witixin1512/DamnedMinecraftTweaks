package com.blamejared.dmt.mixin;

import com.bettersmithing.init.ModTags;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ModTags.Items.class)
public class SmithingMixin {
    /**
     * @author Witixin
     */
    @Overwrite(aliases = "tag", remap = false)
    private static ITag.INamedTag<Item> tag(String name) {
        return tag("bettersmithing" , name);
    }

    /**
     * @author Witixin
     */
    @Overwrite(aliases = "tag", remap = false)
    private static ITag.INamedTag<Item> tag(String namespace, String path) {
        return ItemTags.bind(namespace + ":" + path);
    }
}
