import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aae implements aag {
   private final abp case;
   private final List byte;

   public aae(abp var1, List var2) {
      this.case = var1;
      this.byte = var2;
   }

   public abp a() {
      return this.case;
   }

   public boolean a(adt var1, y6 var2) {
      ArrayList var3 = new ArrayList(this.byte);

      for(int var4 = 0; var4 < 3; ++var4) {
         for(int var5 = 0; var5 < 3; ++var5) {
            abp var6 = var1.do(var5, var4);
            if (var6 != null) {
               boolean var7 = false;
               Iterator var8 = var3.iterator();

               while(var8.hasNext()) {
                  abp var9 = (abp)var8.next();
                  if (var6.new == var9.new && (var9.new() == 32767 || var6.new() == var9.new())) {
                     var7 = true;
                     var3.remove(var9);
                     break;
                  }
               }

               if (!var7) {
                  return false;
               }
            }
         }
      }

      return var3.isEmpty();
   }

   public abp a(adt var1) {
      return this.case.n();
   }

   public int if() {
      return this.byte.size();
   }
}
