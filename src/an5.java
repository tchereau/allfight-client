import java.io.DataInputStream;
import java.io.DataOutputStream;

public class an5 extends an7 {
   private boolean aZ = false;
   private boolean aY = false;
   private boolean a3 = false;
   private boolean a2 = false;
   private float a1;
   private float a0;

   public an5() {
   }

   public an5(aeo var1) {
      this.do(var1.if);
      this.a(var1.a);
      this.for(var1.try);
      this.if(var1.new);
      this.if(var1.a());
      this.a(var1.if());
   }

   public void for(DataInputStream var1) {
      byte var2 = var1.readByte();
      this.do((var2 & 1) > 0);
      this.a((var2 & 2) > 0);
      this.for((var2 & 4) > 0);
      this.if((var2 & 8) > 0);
      this.if((float)var1.readByte() / 255.0F);
      this.a((float)var1.readByte() / 255.0F);
   }

   public void a(DataOutputStream var1) {
      byte var2 = 0;
      if (this.d()) {
         var2 = (byte)(var2 | 1);
      }

      if (this.f()) {
         var2 = (byte)(var2 | 2);
      }

      if (this.h()) {
         var2 = (byte)(var2 | 4);
      }

      if (this.i()) {
         var2 = (byte)(var2 | 8);
      }

      var1.writeByte(var2);
      var1.writeByte((int)(this.a1 * 255.0F));
      var1.writeByte((int)(this.a0 * 255.0F));
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2;
   }

   public boolean d() {
      return this.aZ;
   }

   public void do(boolean var1) {
      this.aZ = var1;
   }

   public boolean f() {
      return this.aY;
   }

   public void a(boolean var1) {
      this.aY = var1;
   }

   public boolean h() {
      return this.a3;
   }

   public void for(boolean var1) {
      this.a3 = var1;
   }

   public boolean i() {
      return this.a2;
   }

   public void if(boolean var1) {
      this.a2 = var1;
   }

   public float e() {
      return this.a1;
   }

   public void if(float var1) {
      this.a1 = var1;
   }

   public float g() {
      return this.a0;
   }

   public void a(float var1) {
      this.a0 = var1;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      return true;
   }
}
