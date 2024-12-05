import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class ja extends i5 {
   private static cb mh = new cb();
   private static final List mg = new ArrayList();
   private final j0 mf;
   private String me;
   private String md;
   private String mc;
   private i8 mb;
   private j6 ma;
   private ju l9;

   public ja(j0 var1) {
      this.mf = var1;
   }

   public void dA() {
      this.hT.clear();
      Keyboard.enableRepeatEvents(true);
      this.me = aqz.if("createWorld.customize.presets.title");
      this.md = aqz.if("createWorld.customize.presets.share");
      this.mc = aqz.if("createWorld.customize.presets.list");
      this.l9 = new ju(this.hR, 50, 40, this.hV - 100, 20);
      this.mb = new i8(this);
      this.l9.M(1230);
      this.l9.case(this.mf.em());
      this.hT.add(this.ma = new j6(0, this.hV / 2 - 155, this.hU - 28, 150, 20, aqz.if("createWorld.customize.presets.select")));
      this.hT.add(new j6(1, this.hV / 2 + 5, this.hU - 28, 150, 20, aqz.if("gui.cancel")));
      this.d9();
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void char(int var1, int var2, int var3) {
      this.l9.case(var1, var2, var3);
      super.char(var1, var2, var3);
   }

   protected void if(char var1, int var2) {
      if (!this.l9.a(var1, var2)) {
         super.if(var1, var2);
      }

   }

   protected void a(j6 var1) {
      if (var1.hv == 0 && this.ea()) {
         this.mf.p(this.l9.dc());
         this.hW.a((i5)this.mf);
      } else if (var1.hv == 1) {
         this.hW.a((i5)this.mf);
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.mb.a(var1, var2, var3);
      this.a(this.hR, this.me, this.hV / 2, 8, 16777215);
      this.if(this.hR, this.md, 50, 30, 10526880);
      this.if(this.hR, this.mc, 50, 70, 10526880);
      this.l9.db();
      super.if(var1, var2, var3);
   }

   public void dG() {
      this.l9.de();
      super.dG();
   }

   public void d9() {
      boolean var1 = this.ea();
      this.ma.hu = var1;
   }

   private boolean ea() {
      return this.mb.v > -1 && this.mb.v < mg.size() || this.l9.dc().length() > 1;
   }

   private static void a(String var0, int var1, yn var2, wd... var3) {
      a(var0, var1, var2, (List)null, var3);
   }

   private static void a(String var0, int var1, yn var2, List var3, wd... var4) {
      we var5 = new we();

      for(int var6 = var4.length - 1; var6 >= 0; --var6) {
         var5.a().add(var4[var6]);
      }

      var5.a(var2.try);
      var5.for();
      if (var3 != null) {
         Iterator var8 = var3.iterator();

         while(var8.hasNext()) {
            String var7 = (String)var8.next();
            var5.if().put(var7, new HashMap());
         }
      }

      mg.add(new i9(var1, var0, var5.toString()));
   }

   // $FF: synthetic method
   static cb d8() {
      return mh;
   }

   // $FF: synthetic method
   static List d7() {
      return mg;
   }

   // $FF: synthetic method
   static i8 a(ja var0) {
      return var0.mb;
   }

   // $FF: synthetic method
   static ju if(ja var0) {
      return var0.l9;
   }

   static {
      a("Classic Flat", pa.i.void, yn.E, Arrays.asList("village"), new wd(1, pa.i.void), new wd(2, pa.g.void), new wd(1, pa.bc.void));
      a("Tunnelers' Dream", pa.k.void, yn.C, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new wd(1, pa.i.void), new wd(5, pa.g.void), new wd(230, pa.k.void), new wd(1, pa.bc.void));
      a("Water World", pa.bb.void, yn.E, Arrays.asList("village", "biome_1"), new wd(90, pa.ba.void), new wd(5, pa.a1.void), new wd(5, pa.g.void), new wd(5, pa.k.void), new wd(1, pa.bc.void));
      a("Overworld", pa.b3.void, yn.E, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new wd(1, pa.i.void), new wd(3, pa.g.void), new wd(59, pa.k.void), new wd(1, pa.bc.void));
      a("Snowy Kingdom", pa.ca.void, yn.t, Arrays.asList("village", "biome_1"), new wd(1, pa.ca.void), new wd(1, pa.i.void), new wd(3, pa.g.void), new wd(59, pa.k.void), new wd(1, pa.bc.void));
      a("Bottomless Pit", abr.aU.A, yn.E, Arrays.asList("village", "biome_1"), new wd(1, pa.i.void), new wd(3, pa.g.void), new wd(2, pa.bf.void));
      a("Desert", pa.a1.void, yn.D, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new wd(8, pa.a1.void), new wd(52, pa.ar.void), new wd(3, pa.k.void), new wd(1, pa.bc.void));
      a("Redstone Ready", abr.cv.A, yn.D, new wd(52, pa.ar.void), new wd(3, pa.k.void), new wd(1, pa.bc.void));
   }
}
