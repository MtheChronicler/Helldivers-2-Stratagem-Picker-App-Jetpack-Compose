package com.example.helldivers2stratagempicker20

import androidx.compose.ui.res.stringResource

class Stratagem(val name:String, val typ: String, val enemy:String, val tags: List<String>, val displayNameID: Int)

val stratagemList: List<Stratagem> = listOf(
    //orbital
    Stratagem(name="orbital_precision", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_precision),
    Stratagem(name="orbital_airburst", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_airburst),
    Stratagem(name="orbital_120mm", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_120mm),
    Stratagem(name="orbital_380mm", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_380mm),
    Stratagem(name="orbital_walking", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_walking),
    Stratagem(name="orbital_laser", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_laser),
    Stratagem(name="orbital_railcannon", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_railcannon),
    Stratagem(name="orbital_gatling", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_gatling),
    Stratagem(name="orbital_gas", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_gas),
    Stratagem(name="orbital_ems", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_ems),
    Stratagem(name="orbital_smoke", typ="orbital", enemy="automatons", tags=listOf("smoke"), displayNameID = R.string.orbital_smoke),
    //eagle
    Stratagem(name="eagle_strafing", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_strafing),
    Stratagem(name="eagle_airstrike", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_airstrike),
    Stratagem(name="eagle_cluster", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_cluster),
    Stratagem(name="eagle_napalm", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_napalm),
    Stratagem(name="eagle_smoke", typ="eagle", enemy="automatons", tags=listOf("smoke"), displayNameID = R.string.eagle_smoke),
    Stratagem(name="eagle_110mm", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_110mm),
    Stratagem(name="eagle_500kg", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_500kg),
    //support_weapon
    Stratagem(name="weapon_autocannon", typ="weapon", enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_autocannon),
    Stratagem(name="weapon_eat", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_eat),
    Stratagem(name="weapon_flamethrower", typ="weapon", enemy="terminids", tags=listOf(), displayNameID = R.string.weapon_flamethrower),
    Stratagem(name="weapon_laser_cannon", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_laser_cannon),
    Stratagem(name="weapon_stalwart", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_stalwart),
    Stratagem(name="weapon_machine_gun", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_machine_gun),
    Stratagem(name="weapon_arc_thrower", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_arc_thrower),
    Stratagem(name="weapon_grenade_launcher", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_grenade_launcher),
    Stratagem(name="weapon_anti_materiel", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_anti_materiel),
    Stratagem(name="weapon_railgun", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_railgun),
    Stratagem(name="weapon_recoiless", typ="weapon", enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_recoiless),
    Stratagem(name="weapon_spear", typ="weapon", enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_spear),
    Stratagem(name="weapon_quasar", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_quasar),
    Stratagem(name="weapon_heavy_machine_gun", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_heavy_machine_gun),
    Stratagem(name="weapon_airburst", typ="weapon", enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_airburst),
    //backpack
    Stratagem(name="backpack_guard_dog_laser", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_guard_dog_laser),
    Stratagem(name="backpack_guard_dog_machine_gun", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_guard_dog_machine_gun),
    Stratagem(name="backpack_jump_pack", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_jump_pack),
    Stratagem(name="backpack_supply", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_supply),
    Stratagem(name="backpack_shield_generator", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_shield_generator),
    Stratagem(name="backpack_ballistic_shield", typ="backpack", enemy="automatons", tags=listOf("backpack"), displayNameID = R.string.backpack_ballistic_shield),
    //sentry
    Stratagem(name="sentry_tesla", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_tesla),
    Stratagem(name="sentry_mortar", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_mortar),
    Stratagem(name="sentry_ems_mortar", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_ems_mortar),
    Stratagem(name="sentry_machine_gun", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_machine_gun),
    Stratagem(name="sentry_gatling", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_gatling),
    Stratagem(name="sentry_autocannon", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_autocannon),
    Stratagem(name="sentry_rocket", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_rocket),
    //emplacement
    Stratagem(name="emplacement_mines", typ="emplacement", enemy="any", tags=listOf("mines"), displayNameID = R.string.emplacement_mines),
    Stratagem(name="emplacement_mines_incendiary", typ="emplacement", enemy="any", tags=listOf("mines"), displayNameID = R.string.emplacement_mines_incendiary),
    Stratagem(name="emplacement_shield_generator", typ="emplacement", enemy="any", tags=listOf(), displayNameID = R.string.emplacement_shield_generator),
    Stratagem(name="emplacement_hmg", typ="emplacement", enemy="any", tags=listOf(), displayNameID = R.string.emplacement_hmg),
    //vehicle
    Stratagem(name="vehicle_patriot", typ="vehicle", enemy="any", tags=listOf(), displayNameID = R.string.vehicle_patriot),
    Stratagem(name="vehicle_emancipator", typ="vehicle", enemy="any", tags=listOf(), displayNameID = R.string.vehicle_emancipator)
)