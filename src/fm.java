public class fm extends fx {
   e7 Z;
   e7 Y;
   e7 ab;
   e7 aa;

   public fm(int var1) {
      this.Z = new e7(this, 0, var1);
      this.Z.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
      if (var1 > 0) {
         this.Z = new e7(this, 0, var1);
         this.Z.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
         this.Y = new e7(this, 32, 0);
         this.Y.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
         this.ab = new e7(this, 32, 4);
         this.ab.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
         this.aa = new e7(this, 32, 8);
         this.aa.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
      }

   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.Z.for(var7);
      if (this.Y != null) {
         this.Y.for(var7);
         this.ab.for(var7);
         this.aa.for(var7);
      }

   }
}
