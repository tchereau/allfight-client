import java.util.LinkedList;
import java.util.List;
import org.lwjgl.opengl.Pbuffer;

public class ael extends Thread {
   private Pbuffer if = null;
   private Object goto = new Object();
   private List long = new LinkedList();
   private List int = new LinkedList();
   private int try = 0;
   private c4 for;
   private c4 case;
   private boolean else;
   private .b new;
   private boolean a;
   private boolean byte;
   private boolean do;
   private static final int char = 10;

   public ael(Pbuffer var1) {
      super("WrUpdateThread");
      this.for = c4.G;
      this.case = new c4(2097152);
      this.else = false;
      this.new = null;
      this.a = false;
      this.byte = false;
      this.do = false;
      this.if = var1;
   }

   public void run() {
      try {
         this.if.makeCurrent();
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      ael.b var1 = new ael.b();

      while(!Thread.interrupted() && !this.do) {
         try {
            .b var2 = this.a();
            if (var2 == null) {
               return;
            }

            this.a((.a)null);

            try {
               this.new = var2;
               c4.G = this.case;
               var2.a(var1);
            } finally {
               c4.G = this.for;
            }

            this.a((dm)var2);
         } catch (Exception var9) {
            var9.printStackTrace();
            if (this.new != null) {
               this.new.do = false;
               this.new.f = true;
            }

            this.new = null;
            this.else = false;
         }
      }

   }

   public void a(dm var1, boolean var2) {
      synchronized(this.goto) {
         if (var1.do) {
            throw new IllegalArgumentException("Renderer already updating");
         } else {
            if (var2) {
               this.long.add(0, var1);
            } else {
               this.long.add(var1);
            }

            var1.do = true;
            this.goto.notifyAll();
         }
      }
   }

   private .b a() {
      synchronized(this.goto) {
         while(this.long.size() <= 0) {
            try {
               this.goto.wait(2000L);
               if (this.do) {
                  Object var10000 = null;
                  return (.b)var10000;
               }
            } catch (InterruptedException var4) {
            }
         }

         .b var2 = (.b)this.long.remove(0);
         this.goto.notifyAll();
         return var2;
      }
   }

   public boolean if() {
      synchronized(this.goto) {
         if (this.long.size() > 0) {
            return true;
         } else {
            return this.new != null ? true : this.else;
         }
      }
   }

   public int new() {
      synchronized(this.goto) {
         return this.long.size() > 10 ? 0 : 10 - this.long.size();
      }
   }

   private void a(dm var1) {
      synchronized(this.goto) {
         this.int.add(var1);
         ++this.try;
         this.new = null;
         this.else = false;
         this.goto.notifyAll();
      }
   }

   private void try() {
      synchronized(this.goto) {
         for(int var2 = 0; var2 < this.int.size(); ++var2) {
            .b var3 = (.b)this.int.get(var2);
            var3.case();
            var3.do = false;
         }

         this.int.clear();
      }
   }

   public void case() {
      synchronized(this.goto) {
         this.a = false;
         this.byte = false;
         this.goto.notifyAll();

         while(this.else) {
            try {
               this.goto.wait();
            } catch (InterruptedException var4) {
            }
         }

         this.try();
      }
   }

   public void do() {
      synchronized(this.goto) {
         if (this.else) {
            qs.for("UpdateThread still working in unpause()!!!");
         }

         this.a = true;
         this.byte = false;
         this.goto.notifyAll();
      }
   }

   public void byte() {
      synchronized(this.goto) {
         if (this.else) {
            qs.for("UpdateThread still working in unpause()!!!");
         }

         if (this.new != null) {
            while(this.new != null) {
               this.a = false;
               this.byte = true;
               this.goto.notifyAll();

               try {
                  this.goto.wait();
               } catch (InterruptedException var4) {
               }
            }

            this.case();
         }
      }
   }

   private void a(.a var1) {
      Thread.yield();
      synchronized(this.goto) {
         while(!this.a && (!this.byte || this.new == null)) {
            if (var1 != null) {
               var1.if();
            }

            this.else = false;
            this.goto.notifyAll();

            try {
               this.goto.wait();
            } catch (InterruptedException var5) {
            }
         }

         this.else = true;
         if (var1 != null) {
            var1.a();
         }

         this.goto.notifyAll();
      }
   }

   public void int() {
      synchronized(this.goto) {
         this.byte();
         this.long.clear();
         this.goto.notifyAll();
      }
   }

   public int for() {
      synchronized(this.goto) {
         int var2 = this.long.size();
         if (this.new != null) {
            ++var2;
         }

         return var2;
      }
   }

   public int char() {
      synchronized(this.goto) {
         int var2 = this.try;
         this.try = 0;
         return var2;
      }
   }

   public void else() {
      this.do = true;
   }

   private class b implements ain {
      private ael.a if;

      private b() {
         this.if = ael.this.new a();
      }

      public void a(.a var1) {
         this.if.a(var1);
         ael.this.a((.a)this.if);
      }

      // $FF: synthetic method
      b(Object var2) {
         this();
      }
   }

   private class a implements .a {
      private .a int;
      private boolean for;

      private a() {
         this.int = null;
         this.for = false;
      }

      public void if() {
         if (!this.for) {
            this.for = true;
            this.int.if();
            c4.G = ael.this.for;
         }

      }

      public void a() {
         if (this.for) {
            this.for = false;
            c4.G = ael.this.case;
            this.int.a();
         }

      }

      public void a(.a var1) {
         this.int = var1;
      }

      // $FF: synthetic method
      a(Object var2) {
         this();
      }
   }
}
