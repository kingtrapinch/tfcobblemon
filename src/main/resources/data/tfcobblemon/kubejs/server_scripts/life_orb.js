

ItemEvents.rightClicked('tfcobblemon:blank_orb', event=> {
        if (event.player.mainHandItem.id == "tfcobblemon:blank_orb") {
            event.player.mainHandItem = Item.of('tfcobblemon:life_orb_charging', '{Damage:100}');
            Utils.server.runCommandSilent(`/playsound minecraft:entity.allay.ambient_with_item block ${event.player.username} ${event.player.x} ${event.player.y} ${event.player.z} 3`)
    }
})

ItemEvents.rightClicked('tfcobblemon:life_orb_charging', event=> {
  if (event.player.mainHandItem.id == "tfcobblemon:life_orb_charging") {
    if (event.player.mainHandItem.damageValue <= 0) {
      event.player.mainHandItem = Item.of('cobblemon:life_orb');
      Utils.server.runCommandSilent(`/playsound minecraft:entity.allay.ambient_without_item block ${event.player.username} ${event.player.x} ${event.player.y} ${event.player.z} 3`)
    }
}
})

EntityEvents.death('cobblemon:pokemon', event => {
  console.log("pokemon died")
  let nearestPlayer = event.level.getNearestPlayer(event.entity, 25)
  if (nearestPlayer !== null) {
    let orb = nearestPlayer.inventory.getItem(nearestPlayer.inventory.find('tfcobblemon:life_orb_charging'))
    if (orb.damageValue >= 1) {
        orb.damageValue--;
        Utils.server.runCommandSilent(`/playsound minecraft:block.amethyst_cluster.hit block ${nearestPlayer.username} ${nearestPlayer.x} ${nearestPlayer.y} ${nearestPlayer.z} 3`)
    }
  }
})
