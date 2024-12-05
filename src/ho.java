import java.util.Iterator;
import java.util.List;

public class ho extends i5 {
   private String jZ;
   private String jY;
   private Object[] j2;
   private List j0;
   private final i5 j1;

   public ho(i5 var1, String var2, String var3, Object... var4) {
      aqy var5 = aqy.if();
      this.j1 = var1;
      this.jZ = var5.a(var2);
      this.jY = var3;
      this.j2 = var4;
   }

   protected void if(char var1, int var2) {
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.hT.clear();
      this.hT.add(new j6(0, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.back")));
      if (this.j2 != null) {
         this.j0 = this.hR.do(var1.a(this.jY, this.j2), this.hV - 50);
      } else {
         this.j0 = this.hR.do(var1.a(this.jY), this.hV - 50);
      }

   }

   protected void a(j6 var1) {
      if (var1.hv == 0) {
         this.hW.a(this.j1);
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.jZ, this.hV / 2, this.hU / 2 - 50, 11184810);
      int var4 = this.hU / 2 - 30;
      if (this.j0 != null) {
         for(Iterator var5 = this.j0.iterator(); var5.hasNext(); var4 += this.hR.i) {
            String var6 = (String)var5.next();
            this.a(this.hR, var6, this.hV / 2, var4, 16777215);
         }
      }

      super.if(var1, var2, var3);
   }
}
