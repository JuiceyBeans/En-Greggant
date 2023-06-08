crafting.addShapeless('saw_oakplanks', item('minecraft:planks:0') * 4, [ore('toolSaw'), item('minecraft:log:0')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:1') * 4, [ore('toolSaw'), item('minecraft:log:1')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:2') * 4, [ore('toolSaw'), item('minecraft:log:2')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:3') * 4, [ore('toolSaw'), item('minecraft:log:3')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:4') * 4, [ore('toolSaw'), item('minecraft:log:4')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:5') * 4, [ore('toolSaw'), item('minecraft:log:5')])

crafting.shapedBuilder()
        .name('manual_ladder')
        .output(item('minecraft:ladder') * 4)
        .matrix('SMS',
                'SWS',
                'SHS')
        .key('W', metaitem('boltWood'))
        .key('S', ore('stickWood'))
        .key('M', ore('toolMallet'))
        .key('H', ore('toolHammer'))
        .replace()
        .register()