import java.io.PushbackReader;
import java.io.Reader;

final class lb implements k9 {
   private final PushbackReader if;
   private int a = 0;
   private int for = 1;
   private boolean do = false;

   public lb(Reader var1) {
      this.if = new PushbackReader(var1);
   }

   public void a(char var1) {
      --this.a;
      if (this.a < 0) {
         this.a = 0;
      }

      this.if.unread(var1);
   }

   public void a(char[] var1) {
      this.a -= var1.length;
      if (this.a < 0) {
         this.a = 0;
      }

   }

   public int do() {
      int var1 = this.if.read();
      this.a(var1);
      return var1;
   }

   public int if(char[] var1) {
      int var2 = this.if.read(var1);
      char[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         this.a((int)var6);
      }

      return var2;
   }

   private void a(int var1) {
      if (13 == var1) {
         this.a = 0;
         ++this.for;
         this.do = true;
      } else {
         if (10 == var1 && !this.do) {
            this.a = 0;
            ++this.for;
         } else {
            ++this.a;
         }

         this.do = false;
      }

   }

   public int if() {
      return this.a;
   }

   public int a() {
      return this.for;
   }
}
