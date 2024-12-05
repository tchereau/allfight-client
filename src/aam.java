import java.util.HashMap;
import java.util.Map;

public class aam {
   private static final aam if = new aam();
   private Map a = new HashMap();
   private Map do = new HashMap();

   public static final aam if() {
      return if;
   }

   private aam() {
      this.a(pa.aS.void, new abp(abr.N), 0.7F);
      this.a(pa.aV.void, new abp(abr.L), 1.0F);
      this.a(pa.cw.void, new abp(abr.P), 1.0F);
      this.a(pa.a1.void, new abp(pa.aD), 0.1F);
      this.a(abr.bu.A, new abp(abr.bs), 0.35F);
      this.a(abr.aP.A, new abp(abr.aN), 0.35F);
      this.a(abr.aL.A, new abp(abr.aJ), 0.35F);
      this.a(abr.cb.A, new abp(abr.ca), 0.35F);
      this.a(pa.bf.void, new abp(pa.k), 0.1F);
      this.a(abr.cp.A, new abp(abr.cq), 0.3F);
      this.a(pa.b7.void, new abp(abr.b9, 1, 2), 0.2F);
      this.a(pa.aM.void, new abp(abr.R, 1, 1), 0.15F);
      this.a(pa.bp.void, new abp(abr.bP), 1.0F);
      this.a(abr.bG.A, new abp(abr.bE), 0.35F);
      this.a(pa.aT.void, new abp(abr.bf), 0.1F);
      this.a(pa.aP.void, new abp(abr.R), 0.1F);
      this.a(pa.cf.void, new abp(abr.cv), 0.7F);
      this.a(pa.aA.void, new abp(abr.b9, 1, 4), 0.2F);
      this.a(pa.h.void, new abp(abr.ah), 0.2F);
   }

   public void a(int var1, abp var2, float var3) {
      this.a.put(var1, var2);
      this.do.put(var2.new, var3);
   }

   public abp a(int var1) {
      return (abp)this.a.get(var1);
   }

   public Map a() {
      return this.a;
   }

   public float if(int var1) {
      return 0.0F;
   }
}
