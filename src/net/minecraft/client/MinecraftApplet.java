package net.minecraft.client;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;

public class MinecraftApplet extends Applet {
   private Canvas if;
   private Minecraft a;
   private Thread do = null;

   public void init() {
      this.if = new .ki(this);
      boolean var1 = "true".equalsIgnoreCase(this.getParameter("fullscreen"));
      this.a = new .kh(this, this.if, this, this.getWidth(), this.getHeight(), var1);
      this.a.vf = this.getDocumentBase().getHost();
      if (this.getDocumentBase().getPort() > 0) {
         this.a.vf = this.a.vf + ":" + this.getDocumentBase().getPort();
      }

      if (this.getParameter("username") != null && this.getParameter("sessionid") != null) {
         this.a.vg = new .j7(this.getParameter("username"), this.getParameter("sessionid"));
         this.a.a().a("Setting user: " + this.a.vg.if);
      } else {
         this.a.vg = new .j7("Player", "");
      }

      if (this.getParameter("allfight") == null || this.getParameter("allfight") != "true") {
         System.exit(0);
      }

      this.a.U("true".equals(this.getParameter("demo")));
      if (this.getParameter("server") != null && this.getParameter("port") != null) {
         this.a.try(this.getParameter("server"), Integer.parseInt(this.getParameter("port")));
      }

      this.a.vd = !"true".equals(this.getParameter("stand-alone"));
      this.setLayout(new BorderLayout());
      this.add(this.if, "Center");
      this.if.setFocusable(true);
      this.if.setFocusTraversalKeysEnabled(false);
      this.validate();
   }

   public void if() {
      if (this.do == null) {
         this.do = new Thread(this.a, "Minecraft main thread");
         this.do.start();
      }

   }

   public void start() {
      if (this.a != null) {
         this.a.vc = false;
      }

   }

   public void stop() {
      if (this.a != null) {
         this.a.vc = true;
      }

   }

   public void destroy() {
      this.a();
   }

   public void a() {
      if (this.do != null) {
         this.a.h2();

         try {
            this.do.join(10000L);
         } catch (InterruptedException var4) {
            try {
               this.a.ia();
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         this.do = null;
      }

   }
}
