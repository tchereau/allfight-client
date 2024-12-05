import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class g2 extends Thread {
   // $FF: synthetic field
   final gm if;
   // $FF: synthetic field
   final g5 a;

   g2(g5 var1, gm var2) {
      this.a = var1;
      this.if = var2;
   }

   public void run() {
      boolean var27 = false;

      label194: {
         label195: {
            label196: {
               label197: {
                  label198: {
                     try {
                        var27 = true;
                        if (!this.if.case) {
                           this.if.case = true;
                           this.if.try = -2L;
                           this.if.char = "";
                           g8.dM();
                           long var1 = System.nanoTime();
                           g8.a(this.a.h, this.if);
                           long var3 = System.nanoTime();
                           this.if.try = (var3 - var1) / 1000000L;
                           var27 = false;
                        } else if (this.if.byte) {
                           this.if.byte = false;
                           g8.a(this.a.h, this.if);
                           var27 = false;
                        } else {
                           var27 = false;
                        }
                        break label194;
                     } catch (UnknownHostException var35) {
                        this.if.try = -1L;
                        var27 = false;
                     } catch (SocketTimeoutException var36) {
                        this.if.try = -1L;
                        var27 = false;
                        break label198;
                     } catch (ConnectException var37) {
                        this.if.try = -1L;
                        var27 = false;
                        break label197;
                     } catch (IOException var38) {
                        this.if.try = -1L;
                        var27 = false;
                        break label196;
                     } catch (Exception var39) {
                        this.if.try = -1L;
                        var27 = false;
                        break label195;
                     } finally {
                        if (var27) {
                           synchronized(g8.dL()) {
                              g8.dI();
                           }
                        }
                     }

                     synchronized(g8.dL()) {
                        g8.dI();
                        return;
                     }
                  }

                  synchronized(g8.dL()) {
                     g8.dI();
                     return;
                  }
               }

               synchronized(g8.dL()) {
                  g8.dI();
                  return;
               }
            }

            synchronized(g8.dL()) {
               g8.dI();
               return;
            }
         }

         synchronized(g8.dL()) {
            g8.dI();
            return;
         }
      }

      synchronized(g8.dL()) {
         g8.dI();
      }

   }
}
