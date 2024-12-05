import java.util.Iterator;
import java.util.List;

public class e0 extends i5 {
   private String iM;
   private String iL;
   private Object[] iP;
   private List iN;
   private final i5 iO;

   public e0(i5 var1, String var2, String var3, Object... var4) {
      aqy var5 = aqy.if();
      this.iO = var1;
      this.iM = var5.a(var2);
      this.iL = var3;
      this.iP = var4;
   }

   protected void if(char var1, int var2) {
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.hT.clear();
      this.hT.add(new j6(0, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.toMenu")));
      if (this.iP != null) {
         this.iN = this.hR.do(var1.a(this.iL, this.iP), this.hV - 50);
      } else {
         this.iN = this.hR.do(var1.a(this.iL), this.hV - 50);
      }

   }

   protected void a(j6 var1) {
      if (var1.hv == 0) {
         this.hW.a(this.iO);
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.iM, this.hV / 2, this.hU / 2 - 50, 11184810);
      int var4 = this.hU / 2 - 30;
      if (this.iN != null) {
         for(Iterator var5 = this.iN.iterator(); var5.hasNext(); var4 += this.hR.i) {
            String var6 = (String)var5.next();
            this.a(this.hR, var6, this.hV / 2, var4, 16777215);
         }
      }

      super.if(var1, var2, var3);
   }
}
