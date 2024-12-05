import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bi {
   private final int if;
   private final int a;
   private final int new;
   private final int int;
   private List for;
   private bd do;

   public bi(int var1, int var2, int var3, int var4) {
      this.if = var1;
      this.a = var2;
      this.new = var3;
      this.int = var4;
   }

   public bd do() {
      return this.do;
   }

   public int if() {
      return this.if;
   }

   public int a() {
      return this.a;
   }

   public boolean a(bd var1) {
      if (this.do != null) {
         return false;
      } else {
         int var2 = var1.for();
         int var3 = var1.if();
         if (var2 <= this.new && var3 <= this.int) {
            if (var2 == this.new && var3 == this.int) {
               this.do = var1;
               return true;
            } else {
               if (this.for == null) {
                  this.for = new ArrayList(1);
                  this.for.add(new bi(this.if, this.a, var2, var3));
                  int var4 = this.new - var2;
                  int var5 = this.int - var3;
                  if (var5 > 0 && var4 > 0) {
                     int var6 = Math.max(this.int, var4);
                     int var7 = Math.max(this.new, var5);
                     if (var6 >= var7) {
                        this.for.add(new bi(this.if, this.a + var3, var2, var5));
                        this.for.add(new bi(this.if + var2, this.a, var4, this.int));
                     } else {
                        this.for.add(new bi(this.if + var2, this.a, var4, var3));
                        this.for.add(new bi(this.if, this.a + var3, this.new, var5));
                     }
                  } else if (var4 == 0) {
                     this.for.add(new bi(this.if, this.a + var3, var2, var5));
                  } else if (var5 == 0) {
                     this.for.add(new bi(this.if + var2, this.a, var4, var3));
                  }
               }

               Iterator var8 = this.for.iterator();

               bi var9;
               do {
                  if (!var8.hasNext()) {
                     return false;
                  }

                  var9 = (bi)var8.next();
               } while(!var9.a(var1));

               return true;
            }
         } else {
            return false;
         }
      }
   }

   public void a(List var1) {
      if (this.do != null) {
         var1.add(this);
      } else if (this.for != null) {
         Iterator var2 = this.for.iterator();

         while(var2.hasNext()) {
            bi var3 = (bi)var2.next();
            var3.a(var1);
         }
      }

   }

   public String toString() {
      return "Slot{originX=" + this.if + ", originY=" + this.a + ", width=" + this.new + ", height=" + this.int + ", texture=" + this.do + ", subSlots=" + this.for + '}';
   }
}
