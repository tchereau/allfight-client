import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;

public class ep {
   private final Minecraft if;
   private final List a = new ArrayList();

   public ep(Minecraft var1) {
      this.if = var1;
      this.if();
   }

   public void if() {
      try {
         aqv var1 = aqk.a(new File(this.if.uR, "servers.dat"));
         aqm var2 = var1.void("servers");
         this.a.clear();

         for(int var3 = 0; var3 < var2.for(); ++var3) {
            this.a.add(eq.a((aqv)var2.a(var3)));
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public void a() {
      try {
         aqm var1 = new aqm();
         Iterator var2 = this.a.iterator();

         while(var2.hasNext()) {
            eq var3 = (eq)var2.next();
            var1.a((aqd)var3.do());
         }

         aqv var5 = new aqv();
         var5.a("servers", (aqd)var1);
         aqk.a(var5, new File(this.if.uR, "servers.dat"));
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public eq a(int var1) {
      return (eq)this.a.get(var1);
   }

   public void if(int var1) {
      this.a.remove(var1);
   }

   public void if(eq var1) {
      this.a.add(var1);
   }

   public int do() {
      return this.a.size();
   }

   public void a(int var1, int var2) {
      eq var3 = this.a(var1);
      this.a.set(var1, this.a(var2));
      this.a.set(var2, var3);
      this.a();
   }

   public void a(int var1, eq var2) {
      this.a.set(var1, var2);
   }

   public static void a(eq var0) {
      ep var1 = new ep(Minecraft.ih());
      var1.if();

      for(int var2 = 0; var2 < var1.do(); ++var2) {
         eq var3 = var1.a(var2);
         if (var3.else.equals(var0.else) && var3.char.equals(var0.char)) {
            var1.a(var2, var0);
            break;
         }
      }

      var1.a();
   }
}
