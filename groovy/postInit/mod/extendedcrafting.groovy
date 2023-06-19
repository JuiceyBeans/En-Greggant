mods.gregtech.alloy_smelter.recipeBuilder()
        .inputs(metaitem('blockStainlessSteel'), metaitem('quantumeye'))
        .outputs(item('extendedcrafting:material:36') * 9)
        .duration(200)
        .EUt(512)
        .buildAndRegister()

mods.extendedcrafting.tablecrafting.shapedBuilder()
    .output(item('extendedcrafting:ender_crafter'))
    .matrix(
        'eeeee',
        'eccce',
        'eampe',
        'ecCce',
        'eeeee'
        )
        .key('a', metaitem('robot.arm.hv'))
        .key('e', item('extendedcrafting:material:36'))
        .key('m', metaitem('gregtech:assembler.hv'))
        .key('p', metaitem('electric.piston.hv'))
        .key('c', metaitem('voltage_coil.hv'))
        .key('C', metaitem('conveyor.module.hv'))
        .tier(2)
        .register()

mods.extendedcrafting.tablecrafting.shapedBuilder()
    .output(item('extendedcrafting:ender_crafter'))
    .matrix(
        '     ',
        '  b  ',
        ' rpc ',
        'eeeee',
        'eeeee'
        )
        .key('b', ore('batteryHv'))
        .key('e', item('extendedcrafting:material:36'))
        .key('r', metaitem('robot.arm.hv'))
        .key('p', item('extendedcrafting:pedestal'))
        .key('c', metaitem('conveyor.module.hv'))
        .tier(2)
        .register()

mods.gregtech.chemical_bath.recipeBuilder()
    .inputs(metaitem('ingotWroughtIron'))
    .fluidInputs(fluid('dye_black') * 288)
    .outputs(item('extendedcrafting:material:0'))
    .duration(100)
    .EUt(64)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
        .inputs(item('extendedcrafting:material:2'), item('extendedcrafting:material:7'), metaitem('plateDoubleWroughtIron') * 2)
        .outputs(item('extendedcrafting:material:14'))
        .duration(40)
        .EUt(64)
        .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
        .inputs(item('extendedcrafting:material:2'), item('extendedcrafting:material:7'), metaitem('plateDoubleRoseGold') * 2)
        .outputs(item('extendedcrafting:material:16'))
        .duration(40)
        .EUt(64)
        .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
        .inputs(item('extendedcrafting:material:2'), item('extendedcrafting:material:7'), metaitem('gemFlawlessEmerald') * 2)
        .outputs(item('extendedcrafting:material:17'))
        .duration(40)
        .EUt(64)
        .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
        .inputs(item('extendedcrafting:material:2'), item('extendedcrafting:material:7'), ore('ingotCrystaltine') * 2)
        .outputs(item('extendedcrafting:material:18'))
        .duration(40)
        .EUt(64)
        .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
        .inputs(item('extendedcrafting:material:2'), item('extendedcrafting:material:7'), metaitem('quantumstar') * 2)
        .outputs(item('extendedcrafting:material:19'))
        .duration(40)
        .EUt(64)
        .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
        .inputs()
        .outputs()
        .duration(40)
        .EUt(64)
        .buildAndRegister()

mods.gregtech.mixer.recipeBuilder()
    .inputs(item('minecraft:glowstone_dust') * 2, item('minecraft:gunpowder'), item('minecraft:redstone'))
    .outputs(item('extendedcrafting:material:7'))
    .duration(100)
    .EUt(64)
    .buildAndRegister()

mods.gregtech.forge_hammer.recipeBuilder()
    .inputs(item('extendedcrafting:material:0') * 3)
    .outputs(item('extendedcrafting:material:2') * 2)
    .duration(40)
    .EUt(64)
    .buildAndRegister()

mods.gregtech.bender.recipeBuilder()
    .inputs(item('extendedcrafting:material:0'))
    .outputs(item('extendedcrafting:material:2'))
    .duration(40)
    .EUt(64)
    .buildAndRegister()

mods.gregtech.lathe.recipeBuilder()
    .inputs(item('extendedcrafting:material:0'))
    .outputs(item('extendedcrafting:material:3') * 2)
    .duration(40)
    .EUt(64)
    .buildAndRegister()