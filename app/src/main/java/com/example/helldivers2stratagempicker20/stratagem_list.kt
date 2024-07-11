package com.example.helldivers2stratagempicker20

import androidx.compose.ui.res.stringResource

class Stratagem(val name:String, val typ: String, val enemy:String, val tags: List<String>, val displayNameID: Int, val iconId: Int)

val stratagemList: List<Stratagem> = listOf(
    //orbital
    Stratagem(name="orbital_precision", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_precision, iconId = R.drawable.orbital_precision_strike_icon),
    Stratagem(name="orbital_airburst", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_airburst, iconId = R.drawable.orbital_airburst_strike_icon),
    Stratagem(name="orbital_120mm", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_120mm, iconId = R.drawable.orbital_120mm_he_barrage_icon),
    Stratagem(name="orbital_380mm", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_380mm, iconId = R.drawable.orbital_380mm_he_barrage_icon),
    Stratagem(name="orbital_walking", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_walking, iconId = R.drawable.orbital_walking_barrage_icon),
    Stratagem(name="orbital_laser", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_laser, iconId = R.drawable.orbital_laser_icon),
    Stratagem(name="orbital_railcannon", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_railcannon, iconId = R.drawable.orbital_railcannon_strike_icon),
    Stratagem(name="orbital_gatling", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_gatling, iconId = R.drawable.orbital_gatling_barrage_icon),
    Stratagem(name="orbital_gas", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_gas, iconId = R.drawable.orbital_gas_strike_icon),
    Stratagem(name="orbital_ems", typ="orbital", enemy="any", tags=listOf(), displayNameID = R.string.orbital_ems, iconId = R.drawable.orbital_ems_strike_icon),
    Stratagem(name="orbital_smoke", typ="orbital", enemy="automatons", tags=listOf("smoke"), displayNameID = R.string.orbital_smoke, iconId = R.drawable.orbital_smoke_strike_icon),
    //eagle
    Stratagem(name="eagle_strafing", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_strafing, iconId = R.drawable.eagle_strafing_run_icon),
    Stratagem(name="eagle_airstrike", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_airstrike, iconId = R.drawable.eagle_airstrike_icon),
    Stratagem(name="eagle_cluster", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_cluster, iconId = R.drawable.eagle_cluster_bomb_icon),
    Stratagem(name="eagle_napalm", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_napalm, iconId = R.drawable.eagle_napalm_airstrike_icon),
    Stratagem(name="eagle_smoke", typ="eagle", enemy="automatons", tags=listOf("smoke"), displayNameID = R.string.eagle_smoke, iconId = R.drawable.eagle_smoke_strike_icon),
    Stratagem(name="eagle_110mm", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_110mm, iconId = R.drawable.eagle_110mm_rocket_pods_icon),
    Stratagem(name="eagle_500kg", typ="eagle", enemy="any", tags=listOf(), displayNameID = R.string.eagle_500kg, iconId = R.drawable.eagle_500kg_bomb_icon),
    //support_weapon
    Stratagem(name="weapon_autocannon", typ="weapon", enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_autocannon, iconId = R.drawable.autocannon_icon),
    Stratagem(name="weapon_eat", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_eat, iconId = R.drawable.expendable_antitank_icon),
    Stratagem(name="weapon_flamethrower", typ="weapon", enemy="terminids", tags=listOf(), displayNameID = R.string.weapon_flamethrower, iconId = R.drawable.flamethrower_icon),
    Stratagem(name="weapon_laser_cannon", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_laser_cannon, iconId = R.drawable.laser_cannon_icon),
    Stratagem(name="weapon_stalwart", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_stalwart, iconId = R.drawable.stalwart_icon),
    Stratagem(name="weapon_machine_gun", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_machine_gun, iconId = R.drawable.machine_gun_icon),
    Stratagem(name="weapon_arc_thrower", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_arc_thrower, iconId = R.drawable.arc_thrower_icon),
    Stratagem(name="weapon_grenade_launcher", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_grenade_launcher, iconId = R.drawable.grenade_launcher_icon),
    Stratagem(name="weapon_anti_materiel", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_anti_materiel, iconId = R.drawable.antimateriel_rifle_icon),
    Stratagem(name="weapon_railgun", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_railgun, iconId = R.drawable.railgun_icon),
    Stratagem(name="weapon_recoiless", typ="weapon", enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_recoiless, iconId = R.drawable.recoilless_rifle_icon),
    Stratagem(name="weapon_spear", typ="weapon", enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_spear, iconId = R.drawable.spear_icon),
    Stratagem(name="weapon_quasar", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_quasar, iconId = R.drawable.quasar_cannon_icon),
    Stratagem(name="weapon_heavy_machine_gun", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_heavy_machine_gun, iconId = R.drawable.heavy_machine_gun_icon),
    Stratagem(name="weapon_airburst", typ="weapon", enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_airburst, iconId = R.drawable.airburst_rocket_launcher_icon),
    Stratagem(name="weapon_commando", typ="weapon", enemy="any", tags=listOf(), displayNameID = R.string.weapon_commando, iconId = R.drawable.commando_stratagem_icon),
    //backpack
    Stratagem(name="backpack_guard_dog_laser", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_guard_dog_laser, iconId = R.drawable.guard_dog_rover_icon),
    Stratagem(name="backpack_guard_dog_machine_gun", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_guard_dog_machine_gun, iconId = R.drawable.guard_dog_icon),
    Stratagem(name="backpack_jump_pack", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_jump_pack, iconId = R.drawable.jump_pack_icon),
    Stratagem(name="backpack_supply", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_supply, iconId = R.drawable.shield_generator_pack_icon),
    Stratagem(name="backpack_shield_generator", typ="backpack", enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_shield_generator, iconId = R.drawable.shield_generator_pack_icon),
    Stratagem(name="backpack_ballistic_shield", typ="backpack", enemy="automatons", tags=listOf("backpack"), displayNameID = R.string.backpack_ballistic_shield, iconId = R.drawable.ballistic_shield_backpack_icon),
    //sentry
    Stratagem(name="sentry_tesla", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_tesla, iconId = R.drawable.tesla_tower_icon),
    Stratagem(name="sentry_mortar", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_mortar, iconId = R.drawable.mortar_sentry_icon),
    Stratagem(name="sentry_ems_mortar", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_ems_mortar, iconId = R.drawable.ems_mortar_sentry_icon),
    Stratagem(name="sentry_machine_gun", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_machine_gun, iconId = R.drawable.machine_gun_sentry_icon),
    Stratagem(name="sentry_gatling", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_gatling, iconId = R.drawable.gatling_sentry_icon),
    Stratagem(name="sentry_autocannon", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_autocannon, iconId = R.drawable.autocannon_sentry_icon),
    Stratagem(name="sentry_rocket", typ="sentry", enemy="any", tags=listOf(), displayNameID = R.string.sentry_rocket, iconId = R.drawable.rocket_sentry_icon),
    //emplacement
    Stratagem(name="emplacement_mines", typ="emplacement", enemy="any", tags=listOf("mines"), displayNameID = R.string.emplacement_mines, iconId = R.drawable.antipersonnel_minefield_icon),
    Stratagem(name="emplacement_mines_incendiary", typ="emplacement", enemy="any", tags=listOf("mines"), displayNameID = R.string.emplacement_mines_incendiary, iconId = R.drawable.incendiary_mines_icon),
    Stratagem(name="emplacement_shield_generator", typ="emplacement", enemy="any", tags=listOf(), displayNameID = R.string.emplacement_shield_generator, iconId = R.drawable.shield_generator_relay_icon),
    Stratagem(name="emplacement_hmg", typ="emplacement", enemy="any", tags=listOf(), displayNameID = R.string.emplacement_hmg, iconId = R.drawable.hmg_emplacement_icon),
    //vehicle
    Stratagem(name="vehicle_patriot", typ="vehicle", enemy="any", tags=listOf(), displayNameID = R.string.vehicle_patriot, iconId = R.drawable.patriot_exosuit_icon),
    Stratagem(name="vehicle_emancipator", typ="vehicle", enemy="any", tags=listOf(), displayNameID = R.string.vehicle_emancipator, iconId = R.drawable.emancipator_exosuit_icon),
)