package me.mchiappinam.pdghcreativoarenas;

import java.util.ArrayList;
import java.util.List;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener, CommandExecutor {
	public static Inventory menu = Bukkit.createInventory(null, 45, "§e» §b§l[/ARENA] PDGH §e«");

	protected static Economy econ = null;
	List<String> principal = new ArrayList<String>();
	List<String> medieval = new ArrayList<String>();
	List<String> coliseu = new ArrayList<String>();
	List<String> campo = new ArrayList<String>();
	List<String> castelo = new ArrayList<String>();
	List<String> redonda = new ArrayList<String>();
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginCommand("arena").setExecutor(this);
		getServer().getPluginCommand("arenalobby").setExecutor(this);
		setupEconomy();
		getServer().getConsoleSender().sendMessage("§3[PDGHCreativoArenas] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHCreativoArenas] §2Acesse: http://pdgh.com.br/");
	}

	public void onDisable() {
		int online = getServer().getOnlinePlayers().length;
			if (!(online == 0)) {
				for(String n : principal) {
		            World w = Bukkit.getWorld("world");
		            Location loc = new Location(w, 0.0, 1, 0.0);
		            loc.setPitch(0);
		            loc.setYaw(180);
		            getServer().getPlayer(n).teleport(loc);
		  			clearInv(getServer().getPlayer(n));
		  			getServer().getPlayer(n).setExp(0.99F);
		  			getServer().getPlayer(n).setLevel(0);
		  			getServer().getPlayer(n).playSound(getServer().getPlayer(n).getLocation(), Sound.ENDERDRAGON_HIT, 1.0F, (byte) 30);
		  			getServer().getPlayer(n).sendMessage("§cSistema de arenas se reiniciando...");
		  			getServer().getPlayer(n).sendMessage("§3Você estava na arena PRINCIPAL e foi teleportado para o spawn!");
				}
				for(String n : medieval) {
		            World w = Bukkit.getWorld("world");
		            Location loc = new Location(w, 0.0, 1, 0.0);
		            loc.setPitch(0);
		            loc.setYaw(180);
		            getServer().getPlayer(n).teleport(loc);
		  			clearInv(getServer().getPlayer(n));
		  			getServer().getPlayer(n).setExp(0.99F);
		  			getServer().getPlayer(n).setLevel(0);
		  			getServer().getPlayer(n).playSound(getServer().getPlayer(n).getLocation(), Sound.ENDERDRAGON_HIT, 1.0F, (byte) 30);
		  			getServer().getPlayer(n).sendMessage("§cSistema de arenas se reiniciando...");
		  			getServer().getPlayer(n).sendMessage("§3Você estava na arena MEDIEVAL e foi teleportado para o spawn!");
				}
				for(String n : coliseu) {
		            World w = Bukkit.getWorld("world");
		            Location loc = new Location(w, 0.0, 1, 0.0);
		            loc.setPitch(0);
		            loc.setYaw(180);
		            getServer().getPlayer(n).teleport(loc);
		  			clearInv(getServer().getPlayer(n));
		  			getServer().getPlayer(n).setExp(0.99F);
		  			getServer().getPlayer(n).setLevel(0);
		  			getServer().getPlayer(n).playSound(getServer().getPlayer(n).getLocation(), Sound.ENDERDRAGON_HIT, 1.0F, (byte) 30);
		  			getServer().getPlayer(n).sendMessage("§cSistema de arenas se reiniciando...");
		  			getServer().getPlayer(n).sendMessage("§3Você estava na arena COLISEU e foi teleportado para o spawn!");
				}
				for(String n : campo) {
		            World w = Bukkit.getWorld("world");
		            Location loc = new Location(w, 0.0, 1, 0.0);
		            loc.setPitch(0);
		            loc.setYaw(180);
		            getServer().getPlayer(n).teleport(loc);
		  			clearInv(getServer().getPlayer(n));
		  			getServer().getPlayer(n).setExp(0.99F);
		  			getServer().getPlayer(n).setLevel(0);
		  			getServer().getPlayer(n).playSound(getServer().getPlayer(n).getLocation(), Sound.ENDERDRAGON_HIT, 1.0F, (byte) 30);
		  			getServer().getPlayer(n).sendMessage("§cSistema de arenas se reiniciando...");
		  			getServer().getPlayer(n).sendMessage("§3Você estava na arena CAMPO e foi teleportado para o spawn!");
				}
				for(String n : castelo) {
		            World w = Bukkit.getWorld("world");
		            Location loc = new Location(w, 0.0, 1, 0.0);
		            loc.setPitch(0);
		            loc.setYaw(180);
		            getServer().getPlayer(n).teleport(loc);
		  			clearInv(getServer().getPlayer(n));
		  			getServer().getPlayer(n).setExp(0.99F);
		  			getServer().getPlayer(n).setLevel(0);
		  			getServer().getPlayer(n).playSound(getServer().getPlayer(n).getLocation(), Sound.ENDERDRAGON_HIT, 1.0F, (byte) 30);
		  			getServer().getPlayer(n).sendMessage("§cSistema de arenas se reiniciando...");
		  			getServer().getPlayer(n).sendMessage("§3Você estava na arena CASTELO e foi teleportado para o spawn!");
				}
				for(String n : redonda) {
		            World w = Bukkit.getWorld("world");
		            Location loc = new Location(w, 0.0, 1, 0.0);
		            loc.setPitch(0);
		            loc.setYaw(180);
		            getServer().getPlayer(n).teleport(loc);
		  			clearInv(getServer().getPlayer(n));
		  			getServer().getPlayer(n).setExp(0.99F);
		  			getServer().getPlayer(n).setLevel(0);
		  			getServer().getPlayer(n).playSound(getServer().getPlayer(n).getLocation(), Sound.ENDERDRAGON_HIT, 1.0F, (byte) 30);
		  			getServer().getPlayer(n).sendMessage("§cSistema de arenas se reiniciando...");
		  			getServer().getPlayer(n).sendMessage("§3Você estava na arena REDONDA e foi teleportado para o spawn!");
				}
			principal.clear();
			medieval.clear();
			coliseu.clear();
			campo.clear();
			castelo.clear();
			redonda.clear();
			//getServer().getConsoleSender().sendMessage("§d[ARENAS] §dSistema de arenas recarregado");
		}
		getServer().getConsoleSender().sendMessage("§3[PDGHCreativoArenas] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHCreativoArenas] §2Acesse: http://pdgh.com.br/");
	}

	@EventHandler
	private void onRespawn(PlayerRespawnEvent e) {
  		e.getPlayer().setExp(0.99F);
  		e.getPlayer().setLevel(0);
		e.getPlayer().getInventory().clear();
		ItemStack a0 = new ItemStack(Material.BLAZE_ROD, 1);
		List<String> l0 = new ArrayList<String>();
	    ItemMeta b0 = a0.getItemMeta();
	    b0.setDisplayName("§a§l[/Arena] §aClique para escolher a arena oficial");
	    b0.setLore(l0);
	    a0.setItemMeta(b0);
	    e.getPlayer().getInventory().addItem(a0);
	}

	@EventHandler
	private void onDeath(PlayerDeathEvent e) {
			Player p = e.getEntity().getPlayer();
			//e.getDrops().clear();
  			e.setDroppedExp(0);
	  		p.setExp(0.99F);
  			p.setLevel(0);
	  			if(e.getEntity().getKiller() instanceof Player) {
	  				Player killer = e.getEntity().getKiller();
	  					if ((principal.contains(killer.getName())) || (medieval.contains(killer.getName())) || (coliseu.contains(killer.getName())) || (campo.contains(killer.getName())) || (castelo.contains(killer.getName())) || (redonda.contains(killer.getName()))) {
	  						killer.setHealth(20);
	  						killer.setFoodLevel(20);
	  						killer.setLevel(killer.getLevel() + 1);
	  						killer.playSound(killer.getLocation(), Sound.BURP, 1.0F, (byte) 30);
	  						econ.depositPlayer(killer.getName(), 1);
	  						killer.sendMessage(" ");
	  						killer.sendMessage("§aVocê matou o §l"+p.getName()+"§a. §a§l(+1 ponto e +$1)");
	  						killer.sendMessage(" ");
	  					}else{
	  						killer.sendMessage("§aVocê matou o §l"+p.getName()+"§a.");
	  						killer.sendMessage("§aEntre nas arenas oficiais para ganhar $1 por kill.");
	  					}
				}
				principal.remove(p.getName());
				medieval.remove(p.getName());
				coliseu.remove(p.getName());
				campo.remove(p.getName());
				castelo.remove(p.getName());
				redonda.remove(p.getName());
	}
	
	@EventHandler
	private void onQuit(PlayerQuitEvent e) {
        World w = Bukkit.getWorld("world");
		Player p = e.getPlayer();
  		p.setExp(0.99F);
			p.setLevel(0);
		if ((principal.contains(p.getName())) || (medieval.contains(p.getName())) || (coliseu.contains(p.getName())) || (campo.contains(p.getName())) || (castelo.contains(p.getName())) || (redonda.contains(p.getName()))) {
			principal.remove(p.getName());
			medieval.remove(p.getName());
			coliseu.remove(p.getName());
			campo.remove(p.getName());
			castelo.remove(p.getName());
			redonda.remove(p.getName());
        	clearInv(p);
            Location loc = new Location(w, 0.0, 1, 0.0);
            loc.setPitch(0);
            loc.setYaw(180);
            p.teleport(loc);
		}
  		p.setExp(0.99F);
			p.setLevel(0);
	}
	
	@EventHandler
	private void onKick(PlayerKickEvent e) {
        World w = Bukkit.getWorld("world");
		Player p = e.getPlayer();
  		p.setExp(0.99F);
			p.setLevel(0);
		if ((principal.contains(p.getName())) || (medieval.contains(p.getName())) || (coliseu.contains(p.getName())) || (campo.contains(p.getName())) || (castelo.contains(p.getName())) || (redonda.contains(p.getName()))) {
			principal.remove(p.getName());
			medieval.remove(p.getName());
			coliseu.remove(p.getName());
			campo.remove(p.getName());
			castelo.remove(p.getName());
			redonda.remove(p.getName());
        	clearInv(p);
            Location loc = new Location(w, 0.0, 1, 0.0);
            loc.setPitch(0);
            loc.setYaw(180);
            p.teleport(loc);
		}
  		p.setExp(0.99F);
			p.setLevel(0);
	}

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        final Player p = (Player) cs;
        if(cmd.getName().equalsIgnoreCase("arenalobby")) {
        	p.sendMessage("§cUse /arena");
        	return true;
        }else if(cmd.getName().equalsIgnoreCase("arena")) {
            tags();
            p.openInventory(Main.menu);
        	return true;
        }
      return false;
    }

	public void clearInv(Player p) {
		p.getInventory().setHelmet(null);
		p.getInventory().setChestplate(null);
		p.getInventory().setLeggings(null);
		p.getInventory().setBoots(null);
		p.getInventory().clear();
	}

	public void Kit(Player p) {
		if(p.hasPermission("pdgh.vip")) {
		    ItemStack espada = new ItemStack(Material.DIAMOND_SWORD, 1);
		    espada.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
		    espada.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
		    espada.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		    ItemStack arco = new ItemStack(Material.BOW, 1);
		    arco.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE , 5);
		    arco.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
		    arco.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
		    arco.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		    ItemStack elmo = new ItemStack(Material.DIAMOND_HELMET, 3);
		    elmo.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 6);
		    elmo.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		    ItemStack peito = new ItemStack(Material.DIAMOND_CHESTPLATE, 3);
		    peito.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 6);
		    peito.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		    ItemStack calca = new ItemStack(Material.DIAMOND_LEGGINGS, 3);
		    calca.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 6);
		    calca.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		    ItemStack bota = new ItemStack(Material.DIAMOND_BOOTS, 3);
		    bota.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 6);
		    bota.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
			//p.getInventory().clear();
		    p.getInventory().addItem(espada);
		    p.getInventory().addItem(arco);
		    p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 10, (short) 1));
		    p.getInventory().addItem(new ItemStack(Material.POTION, 10, (short) 8226));
		    p.getInventory().addItem(new ItemStack(Material.POTION, 20, (short) 8225));
		    p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
			p.getInventory().setHelmet(elmo);
			p.getInventory().setChestplate(peito);
			p.getInventory().setLeggings(calca);
			p.getInventory().setBoots(bota);
		}else{
		    ItemStack espada = new ItemStack(Material.DIAMOND_SWORD, 1);
		    espada.addEnchantment(Enchantment.DAMAGE_ALL, 5);
		    espada.addEnchantment(Enchantment.FIRE_ASPECT, 2);
		    espada.addEnchantment(Enchantment.DURABILITY, 3);
		    ItemStack arco = new ItemStack(Material.BOW, 1);
		    arco.addEnchantment(Enchantment.ARROW_DAMAGE , 5);
		    arco.addEnchantment(Enchantment.ARROW_FIRE, 1);
		    arco.addEnchantment(Enchantment.ARROW_INFINITE, 1);
		    arco.addEnchantment(Enchantment.DURABILITY, 3);
		    ItemStack elmo = new ItemStack(Material.DIAMOND_HELMET, 1);
		    elmo.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 4);
		    elmo.addEnchantment(Enchantment.DURABILITY, 3);
		    ItemStack peito = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		    peito.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 4);
		    peito.addEnchantment(Enchantment.DURABILITY, 3);
		    ItemStack calca = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		    calca.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 4);
		    calca.addEnchantment(Enchantment.DURABILITY, 3);
		    ItemStack bota = new ItemStack(Material.DIAMOND_BOOTS, 1);
		    bota.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 4);
		    bota.addEnchantment(Enchantment.DURABILITY, 3);
			//p.getInventory().clear();
		    p.getInventory().addItem(espada);
		    p.getInventory().addItem(arco);
		    p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 10, (short) 1));
		    p.getInventory().addItem(new ItemStack(Material.POTION, 1, (short) 8226));
		    p.getInventory().addItem(new ItemStack(Material.POTION, 1, (short) 8225));
		    p.getInventory().addItem(new ItemStack(Material.POTION, 1, (short) 8226));
		    p.getInventory().addItem(new ItemStack(Material.POTION, 1, (short) 8225));
		    p.getInventory().addItem(new ItemStack(Material.POTION, 1, (short) 8258));
		    p.getInventory().addItem(new ItemStack(Material.POTION, 1, (short) 8257));
		    p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
			p.getInventory().setHelmet(elmo);
			p.getInventory().setChestplate(peito);
			p.getInventory().setLeggings(calca);
			p.getInventory().setBoots(bota);
		}
	}

	public void entrarPrincipal(final Player p) {
		if ((principal.contains(p.getName())) || (medieval.contains(p.getName())) || (coliseu.contains(p.getName())) || (campo.contains(p.getName())) || (castelo.contains(p.getName())) || (redonda.contains(p.getName()))) {
			p.sendMessage("§c§lVocê já está na arena!");
			return;
		}
		principal.add(p.getName());
		p.sendMessage("§b§lTeleportando...");
		p.closeInventory();
		p.closeInventory();
		clearInv(p);
		getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
	      	    p.sendMessage("§aVocê entrou na arena §lPrincipal");
	      	    p.closeInventory();
	      	    Kit(p);
	      	    World w = Bukkit.getWorld("world");
	      	    Location loc = new Location(w, -27.5, 2, 0.0);
	      	    loc.setPitch(0);
	      	    loc.setYaw(90);
	      	    p.teleport(loc);
	      	    p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1.0F, (byte) 30);
			}
		}, 15L);
		return;
	}

	public void entrarMedieval(final Player p) {
		if ((principal.contains(p.getName())) || (medieval.contains(p.getName())) || (coliseu.contains(p.getName())) || (campo.contains(p.getName())) || (castelo.contains(p.getName())) || (redonda.contains(p.getName()))) {
			p.sendMessage("§c§lVocê já está na arena!");
			return;
		}
		principal.add(p.getName());
		p.sendMessage("§b§lTeleportando...");
		p.closeInventory();
		p.closeInventory();
		clearInv(p);
		getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
	      	    p.sendMessage("§aVocê entrou na arena §lMedieval");
	      	    p.closeInventory();
	      	    Kit(p);
	      	    World w = Bukkit.getWorld("world");
	      	    Location loc = new Location(w, -25000.5, 70, -25000.0);
	      	    loc.setPitch(0);
	      	    loc.setYaw(90);
	      	    p.teleport(loc);
	      	    p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1.0F, (byte) 30);
			}
		}, 15L);
		return;
	}

	public void entrarColiseu(final Player p) {
		if ((principal.contains(p.getName())) || (medieval.contains(p.getName())) || (coliseu.contains(p.getName())) || (campo.contains(p.getName())) || (castelo.contains(p.getName())) || (redonda.contains(p.getName()))) {
			p.sendMessage("§c§lVocê já está na arena!");
			return;
		}
		principal.add(p.getName());
		p.sendMessage("§b§lTeleportando...");
		p.closeInventory();
		p.closeInventory();
		clearInv(p);
		getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
	      	    p.sendMessage("§aVocê entrou na arena §lColiseu");
	      	    p.closeInventory();
	      	    Kit(p);
	      	    World w = Bukkit.getWorld("world");
	      	    Location loc = new Location(w, 25000.5, 70, 25000.5);
	      	    loc.setPitch(0);
	      	    loc.setYaw(90);
	      	    p.teleport(loc);
	      	    p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1.0F, (byte) 30);
			}
		}, 15L);
		return;
	}

	public void entrarCampo(final Player p) {
		if ((principal.contains(p.getName())) || (medieval.contains(p.getName())) || (coliseu.contains(p.getName())) || (campo.contains(p.getName())) || (castelo.contains(p.getName())) || (redonda.contains(p.getName()))) {
			p.sendMessage("§c§lVocê já está na arena!");
			return;
		}
		campo.add(p.getName());
		p.sendMessage("§b§lTeleportando...");
		p.closeInventory();
		p.closeInventory();
		clearInv(p);
		getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
	      	    p.sendMessage("§aVocê entrou na arena §lCampo");
	      	    p.closeInventory();
	      	    Kit(p);
	      	    World w = Bukkit.getWorld("world");
	      	    Location loc = new Location(w, 10000.5, 70, 10000.5);
	      	    loc.setPitch(0);
	      	    loc.setYaw(90);
	      	    p.teleport(loc);
	      	    p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1.0F, (byte) 30);
			}
		}, 15L);
		return;
	}

	public void entrarCastelo(final Player p) {
		if ((principal.contains(p.getName())) || (medieval.contains(p.getName())) || (coliseu.contains(p.getName())) || (campo.contains(p.getName())) || (castelo.contains(p.getName())) || (redonda.contains(p.getName()))) {
			p.sendMessage("§c§lVocê já está na arena!");
			return;
		}
		castelo.add(p.getName());
		p.sendMessage("§b§lTeleportando...");
		p.closeInventory();
		p.closeInventory();
		clearInv(p);
		getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
	      	    p.sendMessage("§aVocê entrou na arena §lCastelo");
	      	    p.closeInventory();
	      	    Kit(p);
	      	    World w = Bukkit.getWorld("world");
	      	    Location loc = new Location(w, -10000.5, 70, -10000.5);
	      	    loc.setPitch(0);
	      	    loc.setYaw(90);
	      	    p.teleport(loc);
	      	    p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1.0F, (byte) 30);
			}
		}, 15L);
		return;
	}

	public void entrarRedonda(final Player p) {
		if ((principal.contains(p.getName())) || (medieval.contains(p.getName())) || (coliseu.contains(p.getName())) || (campo.contains(p.getName())) || (castelo.contains(p.getName())) || (redonda.contains(p.getName()))) {
			p.sendMessage("§c§lVocê já está na arena!");
			return;
		}
		redonda.add(p.getName());
		p.sendMessage("§b§lTeleportando...");
		p.closeInventory();
		p.closeInventory();
		clearInv(p);
		getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
	      	    p.sendMessage("§aVocê entrou na arena §lRedonda");
	      	    p.closeInventory();
	      	    Kit(p);
	      	    World w = Bukkit.getWorld("world");
	      	    Location loc = new Location(w, 10000.5, 70, -10000.5);
	      	    loc.setPitch(0);
	      	    loc.setYaw(90);
	      	    p.teleport(loc);
	      	    p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1.0F, (byte) 30);
			}
		}, 15L);
		return;
	}

	protected void tags() {
		ItemStack a0 = new ItemStack(Material.CACTUS, 1);
	    ItemMeta b0 = a0.getItemMeta();
		List<String> l0 = new ArrayList<String>();
	    b0.setDisplayName("§a§lPrincipal");
	    l0.add(" ");
	    l0.add("§4Clique para entrar na arena");
	    b0.setLore(l0);
	    a0.setItemMeta(b0);
	    menu.setItem(12, a0);

		ItemStack a1 = new ItemStack(Material.WEB, 1);
	    ItemMeta b1 = a1.getItemMeta();
	    b1.setDisplayName("§a§lMedieval");
	    b1.setLore(l0);
	    a1.setItemMeta(b1);
	    menu.setItem(21, a1);

		ItemStack a2 = new ItemStack(Material.FENCE, 1);
	    ItemMeta b2 = a2.getItemMeta();
	    b2.setDisplayName("§a§lColiseu");
	    b2.setLore(l0);
	    a2.setItemMeta(b2);
	    menu.setItem(30, a2);

		ItemStack a3 = new ItemStack(Material.GRASS, 1);
	    ItemMeta b3 = a3.getItemMeta();
	    b3.setDisplayName("§a§lCampo");
	    b3.setLore(l0);
	    a3.setItemMeta(b3);
	    menu.setItem(14, a3);

		ItemStack a4 = new ItemStack(Material.PAINTING, 1);
	    ItemMeta b4 = a4.getItemMeta();
	    b4.setDisplayName("§a§lCastelo");
	    b4.setLore(l0);
	    a4.setItemMeta(b4);
	    menu.setItem(23, a4);

		ItemStack a5 = new ItemStack(Material.QUARTZ_BLOCK, 1);
	    ItemMeta b5 = a5.getItemMeta();
	    b5.setDisplayName("§a§lRedonda");
	    b5.setLore(l0);
	    a5.setItemMeta(b5);
	    menu.setItem(32, a5);
	}
	
	@EventHandler
    public void onInteract(PlayerInteractEvent e){   
        if(e.getAction().equals(Action.LEFT_CLICK_AIR)||equals(Action.LEFT_CLICK_BLOCK)||equals(Action.RIGHT_CLICK_AIR)||equals(Action.RIGHT_CLICK_BLOCK));{
            if((e.getPlayer().getItemInHand().getType() == Material.BLAZE_ROD) && (e.getPlayer().getItemInHand().getItemMeta().hasDisplayName()==true)) {
                e.setCancelled(true);
                tags();
                e.getPlayer().openInventory(Main.menu);
            }
        }
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
	    ItemStack clicked = e.getCurrentItem();
	    Inventory inventory = e.getInventory();
	    if (inventory.getName().equals(Main.menu.getName())) {
	    	e.setCancelled(true);
	    	if ((e.getCurrentItem() != null)&&(!e.getCurrentItem().getType().equals(Material.AIR))) {
		    	if (clicked.getType() == Material.CACTUS) { //Principal
			    	p.closeInventory();
			    	entrarPrincipal(p);
				    return;
			    }else if (clicked.getType() == Material.WEB) { //Teia
			    	p.closeInventory();
			    	entrarMedieval(p);
				    return;
			    }else if (clicked.getType() == Material.FENCE) { //Coliseu
			    	p.closeInventory();
			    	entrarColiseu(p);
				    return;
			    }else if (clicked.getType() == Material.GRASS) { //Campo
			    	p.closeInventory();
			    	entrarCampo(p);
				    return;
			    }else if (clicked.getType() == Material.PAINTING) { //Castelo
			    	p.closeInventory();
			    	entrarCastelo(p);
				    return;
			    }else if (clicked.getType() == Material.QUARTZ_BLOCK) { //Redonda
			    	p.closeInventory();
			    	entrarRedonda(p);
				    return;
			    }
	    	}
		    return;
	    }
	}
	
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
		e.getPlayer().getInventory().clear();
		ItemStack a0 = new ItemStack(Material.BLAZE_ROD, 1);
		List<String> l0 = new ArrayList<String>();
	    ItemMeta b0 = a0.getItemMeta();
	    b0.setDisplayName("§a§l[/Arena] §aClique para escolher a arena oficial");
	    b0.setLore(l0);
	    a0.setItemMeta(b0);
	    e.getPlayer().getInventory().addItem(a0);
    }
	
	
	

	
	private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
		
		
		
}