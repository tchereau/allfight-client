public class f7 extends fx {
   public e7 bd = (new e7(this, 0, 0)).if(64, 64);
   public e7 bc;
   public e7 be;

   public f7() {
      this.bd.a(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
      this.bd.g = 1.0F;
      this.bd.f = 7.0F;
      this.bd.e = 15.0F;
      this.be = (new e7(this, 0, 0)).if(64, 64);
      this.be.a(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
      this.be.g = 8.0F;
      this.be.f = 7.0F;
      this.be.e = 15.0F;
      this.bc = (new e7(this, 0, 19)).if(64, 64);
      this.bc.a(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
      this.bc.g = 1.0F;
      this.bc.f = 6.0F;
      this.bc.e = 1.0F;
   }

   public void new() {
      this.be.d = this.bd.d;
      this.bd.for(0.0625F);
      this.be.for(0.0625F);
      this.bc.for(0.0625F);
   }
}
