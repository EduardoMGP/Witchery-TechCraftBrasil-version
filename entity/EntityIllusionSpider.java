package com.emoniph.witchery.entity;

import com.emoniph.witchery.entity.EntityIllusion;
import com.emoniph.witchery.util.SoundEffect;
import net.minecraft.world.World;

public class EntityIllusionSpider extends EntityIllusion {

   public EntityIllusionSpider(World world) {
      super(world);
   }

   protected SoundEffect getFakeLivingSound() {
      return SoundEffect.MOB_SPIDER_SAY;
   }
}
