import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class wb extends uo {
   private double c = 0.01D;

   public wb() {
   }

   public wb(Map var1) {
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (((String)var3.getKey()).equals("chance")) {
            this.c = ajs.a((String)var3.getValue(), this.c);
         }
      }

   }

   protected boolean if(int var1, int var2) {
      return this.a.nextDouble() < this.c && this.a.nextInt(80) < Math.max(Math.abs(var1), Math.abs(var2));
   }

   protected ui a(int var1, int var2) {
      return new v5(this.do, this.a, var1, var2);
   }
}
