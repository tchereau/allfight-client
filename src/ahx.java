import java.util.List;

public class ahx extends ahk {
   public final aip bV = new ahw(this);
   private ah5 bU;
   private float bT;
   private float bS;
   private aiw bR;
   private float bQ;
   private s5 bP;
   private agj bO;
   private Class bN;

   public ahx(ah5 var1, Class var2, float var3, float var4, float var5) {
      this.bU = var1;
      this.bN = var2;
      this.bQ = var3;
      this.bT = var4;
      this.bS = var5;
      this.bO = var1.bl();
      this.a(1);
   }

   public boolean do() {
      if (this.bN == aek.class) {
         if (this.bU instanceof ah2 && ((ah2)this.bU).fy()) {
            return false;
         }

         this.bR = this.bU.ap.if(this.bU, (double)this.bQ);
         if (this.bR == null) {
            return false;
         }
      } else {
         List var1 = this.bU.ap.a(this.bN, this.bU.aZ.do((double)this.bQ, 3.0D, (double)this.bQ), this.bV);
         if (var1.isEmpty()) {
            return false;
         }

         this.bR = (aiw)var1.get(0);
      }

      nr var2 = agh.do(this.bU, 16, 7, this.bU.ap.do().a(this.bR.al, this.bR.ak, this.bR.aj));
      if (var2 == null) {
         return false;
      } else if (this.bR.if(var2.int, var2.for, var2.do) < this.bR.for((aiw)this.bU)) {
         return false;
      } else {
         this.bP = this.bO.a(var2.int, var2.for, var2.do);
         if (this.bP == null) {
            return false;
         } else {
            return this.bP.a(var2);
         }
      }
   }

   public boolean try() {
      return !this.bO.new();
   }

   public void a() {
      this.bO.a(this.bP, this.bT);
   }

   public void new() {
      this.bR = null;
   }

   public void int() {
      if (this.bU.for(this.bR) < 49.0D) {
         this.bU.bl().a(this.bS);
      } else {
         this.bU.bl().a(this.bT);
      }

   }

   // $FF: synthetic method
   static ah5 a(ahx var0) {
      return var0.bU;
   }
}
