import java.io.IOException;

class g0 extends hg {
   private final long char;
   // $FF: synthetic field
   final g1 case;

   public g0(g1 var1, long var2) {
      this.case = var1;
      this.char = var2;
   }

   public void run() {
      gv var1 = new gv(this.a().vg);
      String var2 = aqy.if().a("mco.reset.world.resetting.screen.title");
      this.if(var2);

      try {
         var1.a(this.char);
         g1.a(this.case).a(g1.if(this.case));
      } catch (gj var4) {
         this.a(var4.a);
      } catch (IOException var5) {
      }

   }
}
