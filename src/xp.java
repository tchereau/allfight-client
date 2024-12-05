import java.io.ByteArrayOutputStream;

class xp extends ByteArrayOutputStream {
   private int a;
   private int do;
   // $FF: synthetic field
   final xq if;

   public xp(xq var1, int var2, int var3) {
      super(8096);
      this.if = var1;
      this.a = var2;
      this.do = var3;
   }

   public void close() {
      this.if.a(this.a, this.do, this.buf, this.count);
   }
}
