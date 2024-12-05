import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class nl {
   private final Map if = new HashMap();
   private final Map a = new HashMap();
   private final Map new = new HashMap();
   private final np[] int = new np[3];
   private final Map for = new HashMap();
   private final Map do = new HashMap();

   public np byte(String var1) {
      return (np)this.if.get(var1);
   }

   public np a(String var1, nh var2) {
      np var3 = this.byte(var1);
      if (var3 != null) {
         throw new IllegalArgumentException("An objective with the name '" + var1 + "' already exists!");
      } else {
         var3 = new np(this, var1, var2);
         Object var4 = (List)this.a.get(var2);
         if (var4 == null) {
            var4 = new ArrayList();
            this.a.put(var2, var4);
         }

         ((List)var4).add(var3);
         this.if.put(var1, var3);
         this.if(var3);
         return var3;
      }
   }

   public Collection a(nh var1) {
      Collection var2 = (Collection)this.a.get(var1);
      return var2 == null ? new ArrayList() : new ArrayList(var2);
   }

   public nn a(String var1, np var2) {
      Object var3 = (Map)this.new.get(var1);
      if (var3 == null) {
         var3 = new HashMap();
         this.new.put(var1, var3);
      }

      nn var4 = (nn)((Map)var3).get(var2);
      if (var4 == null) {
         var4 = new nn(this, var2, var1);
         ((Map)var3).put(var2, var4);
      }

      return var4;
   }

   public Collection do(np var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.new.values().iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         nn var5 = (nn)var4.get(var1);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      Collections.sort(var2, nn.if);
      return var2;
   }

   public Collection a() {
      return this.if.values();
   }

   public Collection if() {
      return this.new.keySet();
   }

   public void new(String var1) {
      Map var2 = (Map)this.new.remove(var1);
      if (var2 != null) {
         this.if(var1);
      }

   }

   public Collection do() {
      Collection var1 = this.new.values();
      ArrayList var2 = new ArrayList();
      if (var1 != null) {
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            Map var4 = (Map)var3.next();
            var2.addAll(var4.values());
         }
      }

      return var2;
   }

   public Map a(String var1) {
      Object var2 = (Map)this.new.get(var1);
      if (var2 == null) {
         var2 = new HashMap();
      }

      return (Map)var2;
   }

   public void int(np var1) {
      this.if.remove(var1.if());

      for(int var2 = 0; var2 < 3; ++var2) {
         if (this.if(var2) == var1) {
            this.a(var2, (np)null);
         }
      }

      List var5 = (List)this.a.get(var1.a());
      if (var5 != null) {
         var5.remove(var1);
      }

      Iterator var3 = this.new.values().iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         var4.remove(var1);
      }

      this.a(var1);
   }

   public void a(int var1, np var2) {
      this.int[var1] = var2;
   }

   public np if(int var1) {
      return this.int[var1];
   }

   public no for(String var1) {
      return (no)this.for.get(var1);
   }

   public no int(String var1) {
      no var2 = this.for(var1);
      if (var2 != null) {
         throw new IllegalArgumentException("An objective with the name '" + var1 + "' already exists!");
      } else {
         var2 = new no(this, var1);
         this.for.put(var1, var2);
         this.do(var2);
         return var2;
      }
   }

   public void a(no var1) {
      this.for.remove(var1.try());
      Iterator var2 = var1.int().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.do.remove(var3);
      }

      this.if(var1);
   }

   public void if(String var1, no var2) {
      if (this.case(var1) != null) {
         this.try(var1);
      }

      this.do.put(var1, var2);
      var2.int().add(var1);
   }

   public boolean try(String var1) {
      no var2 = this.case(var1);
      if (var2 != null) {
         this.a(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public void a(String var1, no var2) {
      if (this.case(var1) != var2) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + var2.try() + "'.");
      } else {
         this.do.remove(var1);
         var2.int().remove(var1);
      }
   }

   public Collection for() {
      return this.for.keySet();
   }

   public Collection int() {
      return this.for.values();
   }

   public no case(String var1) {
      return (no)this.do.get(var1);
   }

   public void if(np var1) {
   }

   public void for(np var1) {
   }

   public void a(np var1) {
   }

   public void a(nn var1) {
   }

   public void if(String var1) {
   }

   public void do(no var1) {
   }

   public void for(no var1) {
   }

   public void if(no var1) {
   }

   public static String a(int var0) {
      switch(var0) {
      case 0:
         return "list";
      case 1:
         return "sidebar";
      case 2:
         return "belowName";
      default:
         return null;
      }
   }

   public static int do(String var0) {
      if (var0.equalsIgnoreCase("list")) {
         return 0;
      } else if (var0.equalsIgnoreCase("sidebar")) {
         return 1;
      } else {
         return var0.equalsIgnoreCase("belowName") ? 2 : -1;
      }
   }
}
