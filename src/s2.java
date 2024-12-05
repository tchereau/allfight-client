import java.util.Iterator;

public class s2 {
   public final aek case;
   public int[] byte;
   public int[] try;
   private int for;
   private int do;
   private byte[] if;
   public int new;
   private boolean a;
   // $FF: synthetic field
   final s3 int;

   public s2(s3 var1, aek var2) {
      this.int = var1;
      this.byte = new int[128];
      this.try = new int[128];
      this.for = 0;
      this.do = 0;
      this.a = false;
      this.case = var2;

      for(int var3 = 0; var3 < this.byte.length; ++var3) {
         this.byte[var3] = 0;
         this.try[var3] = 127;
      }

   }

   public byte[] a(abp var1) {
      byte[] var2;
      if (!this.a) {
         var2 = new byte[]{2, this.int.case};
         this.a = true;
         return var2;
      } else {
         int var3;
         int var10;
         if (--this.do < 0) {
            this.do = 4;
            var2 = new byte[this.int.new.size() * 3 + 1];
            var2[0] = 1;
            var3 = 0;

            for(Iterator var4 = this.int.new.values().iterator(); var4.hasNext(); ++var3) {
               s1 var5 = (s1)var4.next();
               var2[var3 * 3 + 1] = (byte)(var5.if << 4 | var5.for & 15);
               var2[var3 * 3 + 2] = var5.a;
               var2[var3 * 3 + 3] = var5.int;
            }

            boolean var9 = !var1.do();
            if (this.if != null && this.if.length == var2.length) {
               for(var10 = 0; var10 < var2.length; ++var10) {
                  if (var2[var10] != this.if[var10]) {
                     var9 = false;
                     break;
                  }
               }
            } else {
               var9 = false;
            }

            if (!var9) {
               this.if = var2;
               return var2;
            }
         }

         for(int var8 = 0; var8 < 1; ++var8) {
            var3 = this.for++ * 11 % 128;
            if (this.byte[var3] >= 0) {
               int var11 = this.try[var3] - this.byte[var3] + 1;
               var10 = this.byte[var3];
               byte[] var6 = new byte[var11 + 3];
               var6[0] = 0;
               var6[1] = (byte)var3;
               var6[2] = (byte)var10;

               for(int var7 = 0; var7 < var6.length - 3; ++var7) {
                  var6[var7 + 3] = this.int.byte[(var7 + var10) * 128 + var3];
               }

               this.try[var3] = -1;
               this.byte[var3] = -1;
               return var6;
            }
         }

         return null;
      }
   }
}
