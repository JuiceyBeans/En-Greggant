//Add recipes
crafting.shapedBuilder()
        .name('claybukkit')
        .output(item('ceramics:unfired_clay:0'))
        .matrix('   ',
                'CMC',
                'CCC')
        .key('C', metaitem('compressed.clay'))
        .key('M', ore('toolMallet'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('clayplate')
        .output(item('ceramics:unfired_clay:8'))
        .matrix('MC ',
                'C  ',
                '   ')
        .key('C', metaitem('compressed.clay'))
        .key('M', ore('toolMallet'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('clayshears')
        .output(item('ceramics:unfired_clay:1'))
        .matrix(' C ',
                'C  ',
                '   ')
        .key('C', item('ceramics:unfired_clay:8'))
        .replace()
        .register()

crafting.addShapeless('porcelain_bone', item('ceramics:unfired_clay:4'), [metaitem('dustClay'), item('minecraft:dye:15')])
crafting.addShapeless('porcelain_quartz', item('ceramics:unfired_clay:4') * 2, [metaitem('dustClay'), metaitem('dustClay'), item('minecraft:quartz')])