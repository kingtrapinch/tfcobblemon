ItemEvents.rightClicked(event => {
    if (event.item.id == 'tfcobblemon:golett') {
        const playerName = event.player.username; 
        event.server.runCommandSilent(`pokegiveother ${playerName} golett level=10 pokeball=ancient_poke_ball`);
        event.item.count--;
    }
});

ItemEvents.rightClicked(event => {
    const itemId = event.item.id;
    if (itemId.startsWith("tfcobblemon:golett_")) {
        const playerName = event.player.username;
        const dye = itemId.replace("tfcobblemon:golett_", ""); 
        event.server.runCommandSilent(`pokegiveother ${playerName} golett level=10 pokeball=ancient_poke_ball dye=${dye}`);
        event.item.count--;
    }
});

ServerEvents.recipes(event => {
    const colors = [
        'black',
        'blue',
        'cyan',
        'gray',
        'green',
        'lime',
        'magenta',
        'orange',
        'pink',
        'purple',
        'red',
        'white',
        'yellow'
    ];
  
    colors.forEach(color => {
        const vessel = `tfc:ceramic/${color}_glazed_vessel`;  
        const output = `tfcobblemon:golett_${color}`;  
        event.shapeless(
            Item.of(output), 
            [
                vessel,          
                'cobblemon:life_orb'  
            ]
        );
    });
  });
  

ServerEvents.recipes(event => {
      event.shapeless(
        Item.of('tfcobblemon:golett_white'), 
        [
            'tfc:ceramic/light_gray_glazed_vessel',
            'cobblemon:life_orb'
        ]
      );
      event.shapeless(
        Item.of('tfcobblemon:golett_lightblue'), 
        [
            'tfc:ceramic/light_blue_glazed_vessel',
            'cobblemon:life_orb'
        ]
      );
      event.shapeless(
        Item.of('tfcobblemon:golett'), 
        [
            'tfc:ceramic/brown_glazed_vessel',
            'cobblemon:life_orb'
        ]
      );
      event.shapeless(
        Item.of('tfcobblemon:golett'), 
        [
            'tfc:ceramic/vessel',
            'cobblemon:life_orb'
        ]
      );
})
