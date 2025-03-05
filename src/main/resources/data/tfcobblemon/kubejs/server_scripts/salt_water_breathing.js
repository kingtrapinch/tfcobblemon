EntityEvents.spawned("cobblemon:pokemon", event => {
    const {entity, player, server} = event
    let nbt = entity.serializeNBT();
    let species = nbt.Pokemon.Species.toString().replace("cobblemon:", "");
    // Check if the species is in the speciesList array
    if ((global.saltWaterBreather).includes(species)) {
        if (!entity.hasEffect("minecraft:water_breathing")) {
            entity.potionEffects.add("minecraft:water_breathing", 1000000, 0, true, false);
        }
    }
});