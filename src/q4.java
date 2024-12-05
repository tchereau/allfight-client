import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class q4 extends AbstractSet {
   private ajv a = new ajv();
   private int do = 0;
   private HashSet if = new HashSet();

   public q4(Set var1) {
      this.addAll(var1);
   }

   public int size() {
      return this.do;
   }

   public boolean contains(Object var1) {
      if (!(var1 instanceof yr)) {
         return false;
      } else {
         yr var2 = (yr)var1;
         if (var2 == null) {
            return false;
         } else {
            long var3 = zi.a(var2.if >> 4, var2.byte >> 4);
            HashSet var5 = (HashSet)this.a.int(var3);
            return var5 == null ? false : var5.contains(var2);
         }
      }
   }

   public boolean add(Object var1) {
      if (!(var1 instanceof yr)) {
         return false;
      } else {
         yr var2 = (yr)var1;
         if (var2 == null) {
            return false;
         } else {
            long var3 = zi.a(var2.if >> 4, var2.byte >> 4);
            HashSet var5 = (HashSet)this.a.int(var3);
            if (var5 == null) {
               var5 = new HashSet();
               this.a.a(var3, var5);
            }

            boolean var6 = var5.add(var2);
            if (var6) {
               ++this.do;
            }

            return var6;
         }
      }
   }

   public boolean remove(Object var1) {
      if (!(var1 instanceof yr)) {
         return false;
      } else {
         yr var2 = (yr)var1;
         if (var2 == null) {
            return false;
         } else {
            long var3 = zi.a(var2.if >> 4, var2.byte >> 4);
            HashSet var5 = (HashSet)this.a.int(var3);
            if (var5 == null) {
               return false;
            } else {
               boolean var6 = var5.remove(var2);
               if (var6) {
                  --this.do;
               }

               return var6;
            }
         }
      }
   }

   public Iterator a(int var1, int var2) {
      long var3 = zi.a(var1, var2);
      HashSet var5 = (HashSet)this.a.int(var3);
      if (var5 == null) {
         var5 = this.if;
      }

      return var5.iterator();
   }

   public Iterator iterator() {
      throw new UnsupportedOperationException("Not implemented");
   }
}
