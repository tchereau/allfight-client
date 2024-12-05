import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;

public class aln extends amh {
   private File c;
   private File b;

   public aln(alm var1) {
      super(var1);
      this.c = var1.M("ops.txt");
      this.b = var1.M("white-list.txt");
      this.goto = var1.new("view-distance", 10);
      this.long = var1.new("max-players", 20);
      this.a(var1.a("white-list", false));
      if (!var1.hb()) {
         this.int().if(true);
         this.for().if(true);
      }

      this.int().if();
      this.int().a();
      this.for().if();
      this.for().a();
      this.g();
      this.j();
      this.f();
      if (!this.b.exists()) {
         this.h();
      }

   }

   public void a(boolean var1) {
      super.a(var1);
      this.i().a("white-list", (Object)var1);
      this.i().hJ();
   }

   public void a(String var1) {
      super.a(var1);
      this.f();
   }

   public void if(String var1) {
      super.if(var1);
      this.f();
   }

   public void byte(String var1) {
      super.byte(var1);
      this.h();
   }

   public void try(String var1) {
      super.try(var1);
      this.h();
   }

   public void long() {
      this.j();
   }

   private void g() {
      try {
         this.case().clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.c));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            this.case().add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         this.i().a().if("Failed to load operators list: " + var3);
      }

   }

   private void f() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.c, false));
         Iterator var2 = this.case().iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         this.i().a().if("Failed to save operators list: " + var4);
      }

   }

   private void j() {
      try {
         this.e().clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.b));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            this.e().add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         this.i().a().if("Failed to load white-list: " + var3);
      }

   }

   private void h() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.b, false));
         Iterator var2 = this.e().iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         this.i().a().if("Failed to save white-list: " + var4);
      }

   }

   public boolean do(String var1) {
      var1 = var1.trim().toLowerCase();
      return !this.do() || this.for(var1) || this.e().contains(var1);
   }

   public alm i() {
      return (alm)super.void();
   }

   // $FF: synthetic method
   public net.minecraft.a.a void() {
      return this.i();
   }
}
