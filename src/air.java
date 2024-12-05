import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class air {
   private static Map a = new HashMap();
   private static Map new = new HashMap();
   private static Map int = new HashMap();
   private static Map for = new HashMap();
   private static Map do = new HashMap();
   public static HashMap if = new LinkedHashMap();

   private static void a(Class var0, String var1, int var2) {
      a.put(var1, var0);
      new.put(var0, var1);
      int.put(var2, var0);
      for.put(var0, var2);
      do.put(var1, var2);
   }

   private static void a(Class var0, String var1, int var2, int var3, int var4) {
      a(var0, var1, var2);
      if.put(var2, new aiq(var2, var3, var4));
   }

   public static aiw a(String var0, y6 var1) {
      aiw var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if (var3 != null) {
            var2 = (aiw)var3.getConstructor(y6.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static aiw a(aqv var0, y6 var1) {
      aiw var2 = null;
      if ("Minecart".equals(var0.new("id"))) {
         switch(var0.goto("Type")) {
         case 0:
            var0.a("id", "MinecartRideable");
            break;
         case 1:
            var0.a("id", "MinecartChest");
            break;
         case 2:
            var0.a("id", "MinecartFurnace");
         }

         var0.do("Type");
      }

      try {
         Class var3 = (Class)a.get(var0.new("id"));
         if (var3 != null) {
            var2 = (aiw)var3.getConstructor(y6.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.byte(var0);
      } else {
         var1.char().if("Skipping Entity with id " + var0.new("id"));
      }

      return var2;
   }

   public static aiw a(int var0, y6 var1) {
      aiw var2 = null;

      try {
         Class var3 = a(var0);
         if (var3 != null) {
            var2 = (aiw)var3.getConstructor(y6.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 == null) {
         var1.char().if("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int a(aiw var0) {
      Class var1 = var0.getClass();
      return for.containsKey(var1) ? (Integer)for.get(var1) : 0;
   }

   public static Class a(int var0) {
      return (Class)int.get(var0);
   }

   public static String if(aiw var0) {
      return (String)new.get(var0.getClass());
   }

   public static String if(int var0) {
      Class var1 = a(var0);
      return var1 != null ? (String)new.get(var1) : null;
   }

   static {
      a(afk.class, "Item", 1);
      a(aik.class, "XPOrb", 2);
      a(ah7.class, "Painting", 9);
      a(aei.class, "Arrow", 10);
      a(aea.class, "Snowball", 11);
      a(aed.class, "Fireball", 12);
      a(aeb.class, "SmallFireball", 13);
      a(ad6.class, "ThrownEnderpearl", 14);
      a(aeh.class, "EyeOfEnderSignal", 15);
      a(ad4.class, "ThrownPotion", 16);
      a(ad5.class, "ThrownExpBottle", 17);
      a(aih.class, "ItemFrame", 18);
      a(ad3.class, "WitherSkull", 19);
      a(afa.class, "PrimedTnt", 20);
      a(afl.class, "FallingSand", 21);
      a(aef.class, "FireworksRocketEntity", 22);
      a(afm.class, "Boat", 41);
      a(afe.class, "MinecartRideable", 42);
      a(afi.class, "MinecartChest", 43);
      a(afg.class, "MinecartFurnace", 44);
      a(afb.class, "MinecartTNT", 45);
      a(aff.class, "MinecartHopper", 46);
      a(afd.class, "MinecartSpawner", 47);
      a(aig.class, "Mob", 48);
      a(ae0.class, "Monster", 49);
      a(ae7.class, "Creeper", 50, 894731, 0);
      a(aew.class, "Skeleton", 51, 12698049, 4802889);
      a(aeu.class, "Spider", 52, 3419431, 11013646);
      a(ae2.class, "Giant", 53);
      a(aes.class, "Zombie", 54, 44975, 7969893);
      a(aev.class, "Slime", 55, 5349438, 8306542);
      a(ae3.class, "Ghast", 56, 16382457, 12369084);
      a(aez.class, "PigZombie", 57, 15373203, 5009705);
      a(ae6.class, "Enderman", 58, 1447446, 0);
      a(ae8.class, "CaveSpider", 59, 803406, 11013646);
      a(aex.class, "Silverfish", 60, 7237230, 3158064);
      a(ae9.class, "Blaze", 61, 16167425, 16775294);
      a(ae1.class, "LavaSlime", 62, 3407872, 16579584);
      a(afr.class, "EnderDragon", 63);
      a(afq.class, "WitherBoss", 64);
      a(aga.class, "Bat", 65, 4996656, 986895);
      a(aet.class, "Witch", 66, 3407872, 5349438);
      a(af3.class, "Pig", 90, 15771042, 14377823);
      a(af2.class, "Sheep", 91, 15198183, 16758197);
      a(af7.class, "Cow", 92, 4470310, 10592673);
      a(af8.class, "Chicken", 93, 10592673, 16711680);
      a(afz.class, "Squid", 94, 2243405, 7375001);
      a(afw.class, "Wolf", 95, 14144467, 13545366);
      a(af5.class, "MushroomCow", 96, 10489616, 12040119);
      a(af0.class, "SnowMan", 97);
      a(af4.class, "Ozelot", 98, 15720061, 5653556);
      a(afy.class, "VillagerGolem", 99);
      a(aep.class, "Villager", 120, 5651507, 12422002);
      a(afs.class, "EnderCrystal", 200);
   }
}
