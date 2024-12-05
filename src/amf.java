import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class amf extends nl {
   private final net.minecraft.a.a byte;
   private final Set try = new HashSet();
   private nk case;

   public amf(net.minecraft.a.a var1) {
      this.byte = var1;
   }

   public void a(nn var1) {
      super.a(var1);
      if (this.try.contains(var1.int())) {
         this.byte.g6().a((an7)(new ank(var1, 0)));
      }

      this.new();
   }

   public void if(String var1) {
      super.if(var1);
      this.byte.g6().a((an7)(new ank(var1)));
      this.new();
   }

   public void a(int var1, np var2) {
      np var3 = this.if(var1);
      super.a(var1, var2);
      if (var3 != var2 && var3 != null) {
         if (this.try(var3) > 0) {
            this.byte.g6().a((an7)(new ant(var1, var2)));
         } else {
            this.case(var3);
         }
      }

      if (var2 != null) {
         if (this.try.contains(var2)) {
            this.byte.g6().a((an7)(new ant(var1, var2)));
         } else {
            this.char(var2);
         }
      }

      this.new();
   }

   public void if(String var1, no var2) {
      super.if(var1, var2);
      this.byte.g6().a((an7)(new anm(var2, Arrays.asList(var1), 3)));
      this.new();
   }

   public void a(String var1, no var2) {
      super.a(var1, var2);
      this.byte.g6().a((an7)(new anm(var2, Arrays.asList(var1), 4)));
      this.new();
   }

   public void if(np var1) {
      super.if(var1);
      this.new();
   }

   public void for(np var1) {
      super.for(var1);
      if (this.try.contains(var1)) {
         this.byte.g6().a((an7)(new ann(var1, 2)));
      }

      this.new();
   }

   public void a(np var1) {
      super.a(var1);
      if (this.try.contains(var1)) {
         this.case(var1);
      }

      this.new();
   }

   public void do(no var1) {
      super.do(var1);
      this.byte.g6().a((an7)(new anm(var1, 0)));
      this.new();
   }

   public void for(no var1) {
      super.for(var1);
      this.byte.g6().a((an7)(new anm(var1, 2)));
      this.new();
   }

   public void if(no var1) {
      super.if(var1);
      this.byte.g6().a((an7)(new anm(var1, 1)));
      this.new();
   }

   public void a(nk var1) {
      this.case = var1;
   }

   protected void new() {
      if (this.case != null) {
         this.case.a();
      }

   }

   public List new(np var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new ann(var1, 0));

      for(int var3 = 0; var3 < 3; ++var3) {
         if (this.if(var3) == var1) {
            var2.add(new ant(var3, var1));
         }
      }

      Iterator var5 = this.do(var1).iterator();

      while(var5.hasNext()) {
         nn var4 = (nn)var5.next();
         var2.add(new ank(var4, 0));
      }

      return var2;
   }

   public void char(np var1) {
      List var2 = this.new(var1);
      Iterator var3 = this.byte.g6().void.iterator();

      while(var3.hasNext()) {
         ak2 var4 = (ak2)var3.next();
         Iterator var5 = var2.iterator();

         while(var5.hasNext()) {
            an7 var6 = (an7)var5.next();
            var4.pV.if(var6);
         }
      }

      this.try.add(var1);
   }

   public List byte(np var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new ann(var1, 1));

      for(int var3 = 0; var3 < 3; ++var3) {
         if (this.if(var3) == var1) {
            var2.add(new ant(var3, var1));
         }
      }

      return var2;
   }

   public void case(np var1) {
      List var2 = this.byte(var1);
      Iterator var3 = this.byte.g6().void.iterator();

      while(var3.hasNext()) {
         ak2 var4 = (ak2)var3.next();
         Iterator var5 = var2.iterator();

         while(var5.hasNext()) {
            an7 var6 = (an7)var5.next();
            var4.pV.if(var6);
         }
      }

      this.try.remove(var1);
   }

   public int try(np var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 3; ++var3) {
         if (this.if(var3) == var1) {
            ++var2;
         }
      }

      return var2;
   }
}
