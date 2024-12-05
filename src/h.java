import java.util.ArrayList;

public class h {
   private ArrayList for;
   private int a;
   private float do;
   private int if;

   public h() {
      this(10, 0.75F);
   }

   public h(int var1) {
      this(var1, 0.75F);
   }

   public h(int var1, float var2) {
      this.for = null;
      this.a = 0;
      this.do = 1.0F;
      this.if = 0;
      this.for = new ArrayList(var1);
      this.a = var1;
      this.do = var2;
   }

   public void a(int var1, Object var2) {
      if (var2 != null) {
         ++this.if;
      }

      this.for.add(var1, var2);
   }

   public boolean if(Object var1) {
      if (var1 != null) {
         ++this.if;
      }

      return this.for.add(var1);
   }

   public Object if(int var1, Object var2) {
      Object var3 = this.for.set(var1, var2);
      if (var2 != var3) {
         if (var3 == null) {
            ++this.if;
         }

         if (var2 == null) {
            --this.if;
         }
      }

      return var3;
   }

   public Object a(int var1) {
      Object var2 = this.for.remove(var1);
      if (var2 != null) {
         --this.if;
      }

      return var2;
   }

   public void a() {
      this.for.clear();
      this.if = 0;
   }

   public void if() {
      if (this.if <= 0 && this.for.size() <= 0) {
         this.a();
      } else if (this.for.size() > this.a) {
         float var1 = (float)this.if * 1.0F / (float)this.for.size();
         if (!(var1 > this.do)) {
            int var2 = 0;

            int var3;
            for(var3 = 0; var3 < this.for.size(); ++var3) {
               Object var4 = this.for.get(var3);
               if (var4 != null) {
                  if (var3 != var2) {
                     this.for.set(var2, var4);
                  }

                  ++var2;
               }
            }

            for(var3 = this.for.size() - 1; var3 >= var2; --var3) {
               this.for.remove(var3);
            }

         }
      }
   }

   public boolean a(Object var1) {
      return this.for.contains(var1);
   }

   public Object if(int var1) {
      return this.for.get(var1);
   }

   public boolean int() {
      return this.for.isEmpty();
   }

   public int do() {
      return this.for.size();
   }

   public int for() {
      return this.if;
   }
}
