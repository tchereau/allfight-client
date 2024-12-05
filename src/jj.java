import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class jj extends Thread {
   // $FF: synthetic field
   final eq if;
   // $FF: synthetic field
   final jk a;

   jj(jk var1, eq var2) {
      this.a = var1;
      this.if = var2;
   }

   public void run() {
      boolean var27 = false;

      label183: {
         label184: {
            label185: {
               label186: {
                  label187: {
                     try {
                        var27 = true;
                        this.if.byte = aqj.h + "Polling..";
                        long var1 = System.nanoTime();
                        jl.do(this.if);
                        long var3 = System.nanoTime();
                        this.if.try = (var3 - var1) / 1000000L;
                        var27 = false;
                        break label183;
                     } catch (UnknownHostException var35) {
                        this.if.try = -1L;
                        this.if.byte = aqj.l + "Can't resolve hostname";
                        var27 = false;
                        break label184;
                     } catch (SocketTimeoutException var36) {
                        this.if.try = -1L;
                        this.if.byte = aqj.l + "Can't reach server";
                        var27 = false;
                     } catch (ConnectException var37) {
                        this.if.try = -1L;
                        this.if.byte = aqj.l + "Can't reach server";
                        var27 = false;
                        break label187;
                     } catch (IOException var38) {
                        this.if.try = -1L;
                        this.if.byte = aqj.l + "Communication error";
                        var27 = false;
                        break label186;
                     } catch (Exception var39) {
                        this.if.try = -1L;
                        this.if.byte = "ERROR: " + var39.getClass();
                        var27 = false;
                        break label185;
                     } finally {
                        if (var27) {
                           synchronized(jl.ec()) {
                              jl.ee();
                           }
                        }
                     }

                     synchronized(jl.ec()) {
                        jl.ee();
                        return;
                     }
                  }

                  synchronized(jl.ec()) {
                     jl.ee();
                     return;
                  }
               }

               synchronized(jl.ec()) {
                  jl.ee();
                  return;
               }
            }

            synchronized(jl.ec()) {
               jl.ee();
               return;
            }
         }

         synchronized(jl.ec()) {
            jl.ee();
            return;
         }
      }

      synchronized(jl.ec()) {
         jl.ee();
      }

   }
}
