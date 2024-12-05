import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class alu extends ao8 {
   public String if() {
      return "scoreboard";
   }

   public int do() {
      return 2;
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length >= 1) {
         if (var2[0].equalsIgnoreCase("objectives")) {
            if (var2.length == 1) {
               throw new ard("commands.scoreboard.objectives.usage", new Object[0]);
            }

            if (var2[1].equalsIgnoreCase("list")) {
               this.for(var1);
            } else if (var2[1].equalsIgnoreCase("add")) {
               if (var2.length < 4) {
                  throw new ard("commands.scoreboard.objectives.add.usage", new Object[0]);
               }

               this.try(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("remove")) {
               if (var2.length != 3) {
                  throw new ard("commands.scoreboard.objectives.remove.usage", new Object[0]);
               }

               this.int(var1, var2[2]);
            } else {
               if (!var2[1].equalsIgnoreCase("setdisplay")) {
                  throw new ard("commands.scoreboard.objectives.usage", new Object[0]);
               }

               if (var2.length != 3 && var2.length != 4) {
                  throw new ard("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
               }

               this.else(var1, var2, 2);
            }

            return;
         }

         if (var2[0].equalsIgnoreCase("players")) {
            if (var2.length == 1) {
               throw new ard("commands.scoreboard.players.usage", new Object[0]);
            }

            if (var2[1].equalsIgnoreCase("list")) {
               if (var2.length > 3) {
                  throw new ard("commands.scoreboard.players.list.usage", new Object[0]);
               }

               this.do(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("add")) {
               if (var2.length != 5) {
                  throw new ard("commands.scoreboard.players.add.usage", new Object[0]);
               }

               this.byte(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("remove")) {
               if (var2.length != 5) {
                  throw new ard("commands.scoreboard.players.remove.usage", new Object[0]);
               }

               this.byte(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("set")) {
               if (var2.length != 5) {
                  throw new ard("commands.scoreboard.players.set.usage", new Object[0]);
               }

               this.byte(var1, var2, 2);
            } else {
               if (!var2[1].equalsIgnoreCase("reset")) {
                  throw new ard("commands.scoreboard.players.usage", new Object[0]);
               }

               if (var2.length != 3) {
                  throw new ard("commands.scoreboard.players.reset.usage", new Object[0]);
               }

               this.if(var1, var2, 2);
            }

            return;
         }

         if (var2[0].equalsIgnoreCase("teams")) {
            if (var2.length == 1) {
               throw new ard("commands.scoreboard.teams.usage", new Object[0]);
            }

            if (var2[1].equalsIgnoreCase("list")) {
               if (var2.length > 3) {
                  throw new ard("commands.scoreboard.teams.list.usage", new Object[0]);
               }

               this.for(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("add")) {
               if (var2.length < 3) {
                  throw new ard("commands.scoreboard.teams.add.usage", new Object[0]);
               }

               this.goto(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("remove")) {
               if (var2.length != 3) {
                  throw new ard("commands.scoreboard.teams.remove.usage", new Object[0]);
               }

               this.char(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("empty")) {
               if (var2.length != 3) {
                  throw new ard("commands.scoreboard.teams.empty.usage", new Object[0]);
               }

               this.new(var1, var2, 2);
            } else if (!var2[1].equalsIgnoreCase("join")) {
               if (var2[1].equalsIgnoreCase("leave")) {
                  if (var2.length < 3 && !(var1 instanceof aek)) {
                     throw new ard("commands.scoreboard.teams.leave.usage", new Object[0]);
                  }

                  this.long(var1, var2, 2);
               } else {
                  if (!var2[1].equalsIgnoreCase("option")) {
                     throw new ard("commands.scoreboard.teams.usage", new Object[0]);
                  }

                  if (var2.length != 4 && var2.length != 5) {
                     throw new ard("commands.scoreboard.teams.option.usage", new Object[0]);
                  }

                  this.int(var1, var2, 2);
               }
            } else {
               if (var2.length < 4 && (var2.length != 3 || !(var1 instanceof aek))) {
                  throw new ard("commands.scoreboard.teams.join.usage", new Object[0]);
               }

               this.case(var1, var2, 2);
            }

            return;
         }
      }

      throw new ard("commands.scoreboard.usage", new Object[0]);
   }

   protected nl for() {
      return net.minecraft.a.a.g2().aS(0).f();
   }

   protected np a(String var1, boolean var2) {
      nl var3 = this.for();
      np var4 = var3.byte(var1);
      if (var4 == null) {
         throw new ari("commands.scoreboard.objectiveNotFound", new Object[]{var1});
      } else if (var2 && var4.a().if()) {
         throw new ari("commands.scoreboard.objectiveReadOnly", new Object[]{var1});
      } else {
         return var4;
      }
   }

   protected no a(String var1) {
      nl var2 = this.for();
      no var3 = var2.for(var1);
      if (var3 == null) {
         throw new ari("commands.scoreboard.teamNotFound", new Object[]{var1});
      } else {
         return var3;
      }
   }

   protected void try(ar0 var1, String[] var2, int var3) {
      String var4 = var2[var3++];
      String var5 = var2[var3++];
      nl var6 = this.for();
      nh var7 = (nh)nh.if.get(var5);
      if (var7 == null) {
         String[] var10 = (String[])nh.if.keySet().toArray(new String[0]);
         throw new ard("commands.scoreboard.objectives.add.wrongType", new Object[]{a(var10)});
      } else if (var6.byte(var4) != null) {
         throw new ari("commands.scoreboard.objectives.add.alreadyExists", new Object[]{var4});
      } else if (var4.length() > 16) {
         throw new arg("commands.scoreboard.objectives.add.tooLong", new Object[]{var4, 16});
      } else {
         np var8 = var6.a(var4, var7);
         if (var2.length > var3) {
            String var9 = a(var1, var2, var3);
            if (var9.length() > 32) {
               throw new arg("commands.scoreboard.objectives.add.displayTooLong", new Object[]{var9, 32});
            }

            if (var9.length() > 0) {
               var8.a(var9);
            }
         }

         a(var1, "commands.scoreboard.objectives.add.success", new Object[]{var4});
      }
   }

   protected void goto(ar0 var1, String[] var2, int var3) {
      String var4 = var2[var3++];
      nl var5 = this.for();
      if (var5.for(var4) != null) {
         throw new ari("commands.scoreboard.teams.add.alreadyExists", new Object[]{var4});
      } else if (var4.length() > 16) {
         throw new arg("commands.scoreboard.teams.add.tooLong", new Object[]{var4, 16});
      } else {
         no var6 = var5.int(var4);
         if (var2.length > var3) {
            String var7 = a(var1, var2, var3);
            if (var7.length() > 32) {
               throw new arg("commands.scoreboard.teams.add.displayTooLong", new Object[]{var7, 32});
            }

            if (var7.length() > 0) {
               var6.do(var7);
            }
         }

         a(var1, "commands.scoreboard.teams.add.success", new Object[]{var4});
      }
   }

   protected void int(ar0 var1, String[] var2, int var3) {
      no var4 = this.a(var2[var3++]);
      String var5 = var2[var3++].toLowerCase();
      if (!var5.equalsIgnoreCase("color") && !var5.equalsIgnoreCase("friendlyfire") && !var5.equalsIgnoreCase("seeFriendlyInvisibles")) {
         throw new ard("commands.scoreboard.teams.option.usage", new Object[0]);
      } else if (var2.length == 4) {
         if (var5.equalsIgnoreCase("color")) {
            throw new ard("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(aqj.a(true, false))});
         } else if (!var5.equalsIgnoreCase("friendlyfire") && !var5.equalsIgnoreCase("seeFriendlyInvisibles")) {
            throw new ard("commands.scoreboard.teams.option.usage", new Object[0]);
         } else {
            throw new ard("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(Arrays.asList("true", "false"))});
         }
      } else {
         String var6 = var2[var3++];
         if (var5.equalsIgnoreCase("color")) {
            aqj var7 = aqj.a(var6);
            if (var6 == null) {
               throw new ard("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(aqj.a(true, false))});
            }

            var4.if(var7.toString());
            var4.a(aqj.int.toString());
         } else if (var5.equalsIgnoreCase("friendlyfire")) {
            if (!var6.equalsIgnoreCase("true") && !var6.equalsIgnoreCase("false")) {
               throw new ard("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(Arrays.asList("true", "false"))});
            }

            var4.if(var6.equalsIgnoreCase("true"));
         } else if (var5.equalsIgnoreCase("seeFriendlyInvisibles")) {
            if (!var6.equalsIgnoreCase("true") && !var6.equalsIgnoreCase("false")) {
               throw new ard("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(Arrays.asList("true", "false"))});
            }

            var4.a(var6.equalsIgnoreCase("true"));
         }

         a(var1, "commands.scoreboard.teams.option.success", new Object[]{var5, var4.try(), var6});
      }
   }

   protected void char(ar0 var1, String[] var2, int var3) {
      nl var4 = this.for();
      no var5 = this.a(var2[var3++]);
      var4.a(var5);
      a(var1, "commands.scoreboard.teams.remove.success", new Object[]{var5.try()});
   }

   protected void for(ar0 var1, String[] var2, int var3) {
      nl var4 = this.for();
      if (var2.length > var3) {
         no var5 = this.a(var2[var3++]);
         Collection var6 = var5.int();
         if (var6.size() <= 0) {
            throw new ari("commands.scoreboard.teams.list.player.empty", new Object[]{var5.try()});
         }

         var1.a(aqj.n + var1.a("commands.scoreboard.teams.list.player.count", var6.size(), var5.try()));
         var1.a(a(var6.toArray()));
      } else {
         Collection var8 = var4.int();
         if (var8.size() <= 0) {
            throw new ari("commands.scoreboard.teams.list.empty", new Object[0]);
         }

         var1.a(aqj.n + var1.a("commands.scoreboard.teams.list.count", var8.size()));
         Iterator var9 = var8.iterator();

         while(var9.hasNext()) {
            no var7 = (no)var9.next();
            var1.a(var1.a("commands.scoreboard.teams.list.entry", var7.try(), var7.new(), var7.int().size()));
         }
      }

   }

   protected void case(ar0 var1, String[] var2, int var3) {
      nl var4 = this.for();
      no var5 = var4.for(var2[var3++]);
      HashSet var6 = new HashSet();
      String var7;
      if (var1 instanceof aek && var3 == var2.length) {
         var7 = do(var1).aB();
         var4.if(var7, var5);
         var6.add(var7);
      } else {
         while(var3 < var2.length) {
            var7 = for(var1, var2[var3++]);
            var4.if(var7, var5);
            var6.add(var7);
         }
      }

      if (!var6.isEmpty()) {
         a(var1, "commands.scoreboard.teams.join.success", new Object[]{var6.size(), var5.try(), a(var6.toArray(new String[0]))});
      }

   }

   protected void long(ar0 var1, String[] var2, int var3) {
      nl var4 = this.for();
      HashSet var5 = new HashSet();
      HashSet var6 = new HashSet();
      String var7;
      if (var1 instanceof aek && var3 == var2.length) {
         var7 = do(var1).aB();
         if (var4.try(var7)) {
            var5.add(var7);
         } else {
            var6.add(var7);
         }
      } else {
         while(var3 < var2.length) {
            var7 = for(var1, var2[var3++]);
            if (var4.try(var7)) {
               var5.add(var7);
            } else {
               var6.add(var7);
            }
         }
      }

      if (!var5.isEmpty()) {
         a(var1, "commands.scoreboard.teams.leave.success", new Object[]{var5.size(), a(var5.toArray(new String[0]))});
      }

      if (!var6.isEmpty()) {
         throw new ari("commands.scoreboard.teams.leave.failure", new Object[]{var6.size(), a(var6.toArray(new String[0]))});
      }
   }

   protected void new(ar0 var1, String[] var2, int var3) {
      nl var4 = this.for();
      no var5 = this.a(var2[var3++]);
      ArrayList var6 = new ArrayList(var5.int());
      if (var6.isEmpty()) {
         throw new ari("commands.scoreboard.teams.empty.alreadyEmpty", new Object[]{var5.try()});
      } else {
         Iterator var7 = var6.iterator();

         while(var7.hasNext()) {
            String var8 = (String)var7.next();
            var4.a(var8, var5);
         }

         a(var1, "commands.scoreboard.teams.empty.success", new Object[]{var6.size(), var5.try()});
      }
   }

   protected void int(ar0 var1, String var2) {
      nl var3 = this.for();
      np var4 = this.a(var2, false);
      var3.int(var4);
      a(var1, "commands.scoreboard.objectives.remove.success", new Object[]{var2});
   }

   protected void for(ar0 var1) {
      nl var2 = this.for();
      Collection var3 = var2.a();
      if (var3.size() <= 0) {
         throw new ari("commands.scoreboard.objectives.list.empty", new Object[0]);
      } else {
         var1.a(aqj.n + var1.a("commands.scoreboard.objectives.list.count", var3.size()));
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            np var5 = (np)var4.next();
            var1.a(var1.a("commands.scoreboard.objectives.list.entry", var5.if(), var5.for(), var5.a().a()));
         }

      }
   }

   protected void else(ar0 var1, String[] var2, int var3) {
      nl var4 = this.for();
      String var5 = var2[var3++];
      int var6 = nl.do(var5);
      np var7 = null;
      if (var2.length == 4) {
         var7 = this.a(var2[var3++], false);
      }

      if (var6 < 0) {
         throw new ari("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[]{var5});
      } else {
         var4.a(var6, var7);
         if (var7 != null) {
            a(var1, "commands.scoreboard.objectives.setdisplay.successSet", new Object[]{nl.a(var6), var7.if()});
         } else {
            a(var1, "commands.scoreboard.objectives.setdisplay.successCleared", new Object[]{nl.a(var6)});
         }

      }
   }

   protected void do(ar0 var1, String[] var2, int var3) {
      nl var4 = this.for();
      if (var2.length > var3) {
         String var5 = for(var1, var2[var3++]);
         Map var6 = var4.a(var5);
         if (var6.size() <= 0) {
            throw new ari("commands.scoreboard.players.list.player.empty", new Object[]{var5});
         }

         var1.a(aqj.n + var1.a("commands.scoreboard.players.list.player.count", var6.size(), var5));
         Iterator var7 = var6.values().iterator();

         while(var7.hasNext()) {
            nn var8 = (nn)var7.next();
            var1.a(var1.a("commands.scoreboard.players.list.player.entry", var8.for(), var8.int().for(), var8.int().if()));
         }
      } else {
         Collection var9 = var4.if();
         if (var9.size() <= 0) {
            throw new ari("commands.scoreboard.players.list.empty", new Object[0]);
         }

         var1.a(aqj.n + var1.a("commands.scoreboard.players.list.count", var9.size()));
         var1.a(a(var9.toArray()));
      }

   }

   protected void byte(ar0 var1, String[] var2, int var3) {
      String var4 = var2[var3 - 1];
      String var5 = for(var1, var2[var3++]);
      np var6 = this.a(var2[var3++], true);
      int var7 = var4.equalsIgnoreCase("set") ? a(var1, var2[var3++]) : a(var1, var2[var3++], 1);
      nl var8 = this.for();
      nn var9 = var8.a(var5, var6);
      if (var4.equalsIgnoreCase("set")) {
         var9.a(var7);
      } else if (var4.equalsIgnoreCase("add")) {
         var9.do(var7);
      } else {
         var9.if(var7);
      }

      a(var1, "commands.scoreboard.players.set.success", new Object[]{var6.if(), var5, var9.for()});
   }

   protected void if(ar0 var1, String[] var2, int var3) {
      nl var4 = this.for();
      String var5 = for(var1, var2[var3++]);
      var4.new(var5);
      a(var1, "commands.scoreboard.players.reset.success", new Object[]{var5});
   }

   public List a(ar0 var1, String[] var2) {
      if (var2.length == 1) {
         return a(var2, new String[]{"objectives", "players", "teams"});
      } else {
         if (var2[0].equalsIgnoreCase("objectives")) {
            if (var2.length == 2) {
               return a(var2, new String[]{"list", "add", "remove", "setdisplay"});
            }

            if (var2[1].equalsIgnoreCase("add")) {
               if (var2.length == 4) {
                  return a(var2, nh.if.keySet());
               }
            } else if (var2[1].equalsIgnoreCase("remove")) {
               if (var2.length == 3) {
                  return a(var2, this.a(false));
               }
            } else if (var2[1].equalsIgnoreCase("setdisplay")) {
               if (var2.length == 3) {
                  return a(var2, new String[]{"list", "sidebar", "belowName"});
               }

               if (var2.length == 4) {
                  return a(var2, this.a(false));
               }
            }
         } else if (var2[0].equalsIgnoreCase("players")) {
            if (var2.length == 2) {
               return a(var2, new String[]{"set", "add", "remove", "reset", "list"});
            }

            if (!var2[1].equalsIgnoreCase("set") && !var2[1].equalsIgnoreCase("add") && !var2[1].equalsIgnoreCase("remove")) {
               if ((var2[1].equalsIgnoreCase("reset") || var2[1].equalsIgnoreCase("list")) && var2.length == 3) {
                  return a(var2, this.for().if());
               }
            } else {
               if (var2.length == 3) {
                  return a(var2, net.minecraft.a.a.g2().hs());
               }

               if (var2.length == 4) {
                  return a(var2, this.a(true));
               }
            }
         } else if (var2[0].equalsIgnoreCase("teams")) {
            if (var2.length == 2) {
               return a(var2, new String[]{"add", "remove", "join", "leave", "empty", "list", "option"});
            }

            if (var2[1].equalsIgnoreCase("join")) {
               if (var2.length == 3) {
                  return a(var2, this.for().for());
               }

               if (var2.length >= 4) {
                  return a(var2, net.minecraft.a.a.g2().hs());
               }
            } else {
               if (var2[1].equalsIgnoreCase("leave")) {
                  return a(var2, net.minecraft.a.a.g2().hs());
               }

               if (!var2[1].equalsIgnoreCase("empty") && !var2[1].equalsIgnoreCase("list") && !var2[1].equalsIgnoreCase("remove")) {
                  if (var2[1].equalsIgnoreCase("option")) {
                     if (var2.length == 3) {
                        return a(var2, this.for().for());
                     }

                     if (var2.length == 4) {
                        return a(var2, new String[]{"color", "friendlyfire", "seeFriendlyInvisibles"});
                     }

                     if (var2.length == 5) {
                        if (var2[3].equalsIgnoreCase("color")) {
                           return a(var2, aqj.a(true, false));
                        }

                        if (var2[3].equalsIgnoreCase("friendlyfire") || var2[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                           return a(var2, new String[]{"true", "false"});
                        }
                     }
                  }
               } else if (var2.length == 3) {
                  return a(var2, this.for().for());
               }
            }
         }

         return null;
      }
   }

   protected List a(boolean var1) {
      Collection var2 = this.for().a();
      ArrayList var3 = new ArrayList();
      Iterator var4 = var2.iterator();

      while(true) {
         np var5;
         do {
            if (!var4.hasNext()) {
               return var3;
            }

            var5 = (np)var4.next();
         } while(var1 && var5.a().if());

         var3.add(var5.if());
      }
   }

   public boolean a(String[] var1, int var2) {
      if (var1[0].equalsIgnoreCase("players")) {
         return var2 == 2;
      } else if (!var1[0].equalsIgnoreCase("teams")) {
         return false;
      } else {
         return var2 == 2 || var2 == 3;
      }
   }
}
