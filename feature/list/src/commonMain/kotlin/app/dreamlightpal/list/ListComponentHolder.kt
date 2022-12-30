package app.dreamlightpal.list

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import app.dreamlightpal.list.ListComponent.ListState
import app.dreamlightpal.list.ListComponent.ListState.Item
import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@Stable
interface ListComponent {

    val state: StateFlow<ListState>

    @Immutable
    data class ListState(
        val collectionItems: List<Item>,
    ) {

        @Immutable
        data class Item(
            val name: String,
            val imageUrl: String,
        )
    }
}

internal class ListComponentHolder(
    componentContext: ComponentContext,
) : ListComponent, ComponentContext by componentContext {

    private val _state = MutableStateFlow(ListState(collectionItems = Fake_Collections))
    override val state: StateFlow<ListState> = _state.asStateFlow()
}

val Fake_Collections = listOf(
    Item(
        name = "Emerald Sunbird",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/75/Emerald_Sunbird.png"
    ),
    Item(
        name = "Golden Sunbird",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/92/Golden_Sunbird.png"
    ),
    Item(
        name = "Orchid Sunbird",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e0/Orchid_Sunbird.png"
    ),
    Item(
        name = "Red Sunbird",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/fe/Red_Sunbird.png"
    ),
    Item(
        name = "Turquoise Sunbird",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/08/Turquoise_Sunbird.png"
    ),
    Item(
        name = "Black Squirrel",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9e/Black_Squirrel.png"
    ),
    Item(
        name = "Classic Squirrel",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/54/Classic_Squirrel.png"
    ),
    Item(
        name = "Gray Squirrel",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/58/Gray_Squirrel.png"
    ),
    Item(
        name = "Red Squirrel",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f9/Red_Squirrel.png"
    ),
    Item(
        name = "White Squirrel",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/97/White_Squirrel.png"
    ),
    Item(
        name = "Blue Crocodile",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e1/Blue_Crocodile.png"
    ),
    Item(
        name = "Classic Crocodile",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/88/Classic_Crocodile.png"
    ),
    Item(
        name = "Golden Crocodile",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/84/Golden_Crocodile.png"
    ),
    Item(
        name = "Pink Crocodile",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9e/Pink_Crocodile.png"
    ),
    Item(
        name = "Red Crocodile",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/8b/Red_Crocodile.png"
    ),
    Item(
        name = "White Crocodile",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/48/White_Crocodile.png"
    ),
    Item(
        name = "Black Rabbit",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2a/Black_Rabbit.png"
    ),
    Item(
        name = "Brown Rabbit",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/93/Brown_Rabbit.png"
    ),
    Item(
        name = "Calico Rabbit",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/13/Calico_Rabbit.png"
    ),
    Item(
        name = "Classic Rabbit",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e2/Classic_Rabbit.png"
    ),
    Item(
        name = "White Rabbit",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e6/White_Rabbit.png"
    ),
    Item(
        name = "Blue Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c9/Blue_Raven.png"
    ),
    Item(
        name = "Brown Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/51/Brown_Raven.png"
    ),
    Item(
        name = "Classic Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/bd/Classic_Raven.png"
    ),
    Item(
        name = "Red Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d4/Red_Raven.png"
    ),
    Item(
        name = "White Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2f/White_Raven.png"
    ),
    Item(
        name = "Black Sea Turtle",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f4/Black_Sea_Turtle.png"
    ),
    Item(
        name = "Brown Sea Turtle",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f3/Brown_Sea_Turtle.png"
    ),
    Item(
        name = "Classic Sea Turtle",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/69/Classic_Sea_Turtle.png?20220918030627"
    ),
    Item(
        name = "Purple Sea Turtle",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d0/Purple_Sea_Turtle.png"
    ),
    Item(
        name = "White Sea Turtle",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/67/White_Sea_Turtle.png"
    ),
    Item(
        name = "Black Fox",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/be/Black_Fox.png"
    ),
    Item(
        name = "Blue Fox",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9c/Blue_Fox.png"
    ),
    Item(
        name = "Classic Fox",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/88/Classic_Fox.png"
    ),
    Item(
        name = "Red Fox",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/21/Red_Fox.png"
    ),
    Item(
        name = "White Fox",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/00/White_Fox.png"
    ),
    Item(
        name = "Black Raccoon",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f7/Black_Raccoon.png"
    ),
    Item(
        name = "Blue Raccoon",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7e/Blue_Raccoon.png"
    ),
    Item(
        name = "Classic Raccoon",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b4/Classic_Raccoon.png"
    ),
    Item(
        name = "Red Raccoon",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/31/Red_Raccoon.png"
    ),
    Item(
        name = "White Raccoon",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/15/White_Raccoon.png"
    ),
    Item(
        name = "Anglerfish",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/64/Anglerfish.png"
    ),
    Item(
        name = "Bass",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Bass.png"
    ),
    Item(
        name = "Bream",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/82/Bream.png"
    ),
    Item(
        name = "Carp",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a8/Carp.png"
    ),
    Item(
        name = "Catfish",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/99/Catfish.png"
    ),
    Item(
        name = "Cod",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/41/Cod.png"
    ),
    Item(
        name = "Crab",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/63/Crab.png"
    ),
    Item(
        name = "Fugu",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e7/Fugu.png"
    ),
    Item(
        name = "Herring",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Herring.png"
    ),
    Item(
        name = "Kingfish",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fb/Kingfish.png"
    ),
    Item(
        name = "Lancetfish",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Lancetfish.png"
    ),
    Item(
        name = "Lobster",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Lobster.png"
    ),
    Item(
        name = "Perch",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Perch.png"
    ),
    Item(
        name = "Pike",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Pike.png"
    ),
    Item(
        name = "Rainbow Trout",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Rainbow_Trout.png"
    ),
    Item(
        name = "Red Algae",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/36/Red_Algae.png"
    ),
    Item(
        name = "Salmon",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/Salmon.png"
    ),
    Item(
        name = "Seaweed",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Seaweed.png"
    ),
    Item(
        name = "Shrimp",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Shrimp.png"
    ),
    Item(
        name = "Sole",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/47/Sole.png"
    ),
    Item(
        name = "Squid",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/81/Squid.png"
    ),
    Item(
        name = "Swordfish",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Swordfish.png"
    ),
    Item(
        name = "Tilapia",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/73/Tilapia.png"
    ),
    Item(
        name = "Tuna",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c5/Tuna.png"
    ),
    Item(
        name = "Walleye",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/05/Walleye.png"
    ),
    Item(
        name = "White Sturgeon",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/White_Sturgeon.png"
    ),
    Item(
        name = "Festive Anglerfish [1] [2]",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/06/Festive_Anglerfish.png"
    ),
    Item(
        name = "Festive Bass [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cc/Festive_Bass.png"
    ),
    Item(
        name = "Festive Fugu [1] [3]",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2f/Festive_Fugu.png"
    ),
    Item(
        name = "Festive Salmon [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5c/Festive_Salmon.png"
    ),
    Item(
        name = "Festive Squid [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fa/Festive_Squid.png"
    ),
    Item(
        name = "Clay",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a2/Clay.png"
    ),
    Item(
        name = "Coal Ore",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fe/Coal_Ore.png"
    ),
    Item(
        name = "Cotton",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c3/Cotton.png"
    ),
    Item(
        name = "Crystal",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Crystal.png"
    ),
    Item(
        name = "Dark Wood",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Dark_Wood.png"
    ),
    Item(
        name = "Dream Shard",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e2/Dream_Shard.png"
    ),
    Item(
        name = "Dry Wood",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f4/Dry_Wood.png"
    ),
    Item(
        name = "Gold Nugget",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cf/Gold_Nugget.png"
    ),
    Item(
        name = "Hardwood",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Hardwood.png"
    ),
    Item(
        name = "Iron Ore",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Iron_Ore.png"
    ),
    Item(
        name = "Night Shard",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ef/Night_Shard.png"
    ),
    Item(
        name = "Pebbles",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/75/Pebbles.png"
    ),
    Item(
        name = "Rich Soil",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fa/Rich_Soil.png"
    ),
    Item(
        name = "Sand",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a7/Sand.png"
    ),
    Item(
        name = "Snowball",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/04/Snowball.png"
    ),
    Item(
        name = "Softwood",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f4/Softwood.png"
    ),
    Item(
        name = "Soil",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/42/Soil.png"
    ),
    Item(
        name = "Stone",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d4/Stone.png"
    ),
    Item(
        name = "Black Passion Lily",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/23/Black_Passion_Lily.png"
    ),
    Item(
        name = "Blue Falling Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4d/Blue_Falling_Penstemon.png"
    ),
    Item(
        name = "Blue Hydrangea",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/49/Blue_Hydrangea.png"
    ),
    Item(
        name = "Blue Marsh Milkweed",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6a/Blue_Marsh_Milkweed.png"
    ),
    Item(
        name = "Blue Passion Lily",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7a/Blue_Passion_Lily.png"
    ),
    Item(
        name = "Blue Star Lily",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Blue_Star_Lily.png"
    ),
    Item(
        name = "Dandelion",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b1/Dandelion.png"
    ),
    Item(
        name = "Green Passion Lily",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ca/Green_Passion_Lily.png"
    ),
    Item(
        name = "Green Rising Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/04/Green_Rising_Penstemon.png"
    ),
    Item(
        name = "Orange & Red Marsh Milkweed",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4f/Orange_%26_Red_Marsh_Milkweed.png"
    ),
    Item(
        name = "Orange Houseleek",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a7/Orange_Houseleek.png"
    ),
    Item(
        name = "Orange Marsh Milkweed",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d4/Orange_Marsh_Milkweed.png"
    ),
    Item(
        name = "Orange Nasturtium",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3a/Orange_Nasturtium.png"
    ),
    Item(
        name = "Orange Star Lily",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cb/Orange_Star_Lily.png"
    ),
    Item(
        name = "Pink Bromeliad",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2a/Pink_Bromeliad.png"
    ),
    Item(
        name = "Pink Houseleek",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b1/Pink_Houseleek.png"
    ),
    Item(
        name = "Pink Hydrangea",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/67/Pink_Hydrangea.png"
    ),
    Item(
        name = "Purple Bell Flower",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a1/Purple_Bell_Flower.png"
    ),
    Item(
        name = "Purple Falling Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Purple_Falling_Penstemon.png"
    ),
    Item(
        name = "Purple Hydrangea",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Purple_Hydrangea.png"
    ),
    Item(
        name = "Purple Impatiens",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/73/Purple_Impatiens.png"
    ),
    Item(
        name = "Purple Marsh Milkweed",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dd/Purple_Marsh_Milkweed.png"
    ),
    Item(
        name = "Purple Rising Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Purple_Rising_Penstemon.png"
    ),
    Item(
        name = "Red Bell Flower",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Red_Bell_Flower.png"
    ),
    Item(
        name = "Red Bromeliad",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/04/Red_Bromeliad.png"
    ),
    Item(
        name = "Red Daisy",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/73/Red_Daisy.png"
    ),
    Item(
        name = "Red Falling Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3a/Red_Falling_Penstemon.png"
    ),
    Item(
        name = "Red Nasturtium",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/74/Red_Nasturtium.png"
    ),
    Item(
        name = "Red Passion Lily",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e5/Red_Passion_Lily.png"
    ),
    Item(
        name = "Sunflower",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/81/Sunflower.png"
    ),
    Item(
        name = "White & Pink Falling Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/White_%26_Pink_Falling_Penstemon.png"
    ),
    Item(
        name = "White & Red Hydrangea",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8e/White_%26_Red_Hydrangea.png"
    ),
    Item(
        name = "White Bell Flower",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/19/White_Bell_Flower.png"
    ),
    Item(
        name = "White Daisy",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/White_Daisy.png"
    ),
    Item(
        name = "White Impatiens",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/White_Impatiens.png"
    ),
    Item(
        name = "White Marsh Milkweed",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5f/White_Marsh_Milkweed.png"
    ),
    Item(
        name = "White Passion Lily",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/70/White_Passion_Lily.png"
    ),
    Item(
        name = "Yellow Bromeliad",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Yellow_Bromeliad.png"
    ),
    Item(
        name = "Yellow Daisy",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Yellow_Daisy.png"
    ),
    Item(
        name = "Yellow Nasturtium",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Yellow_Nasturtium.png"
    ),
    Item(
        name = "Stone",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d4/Stone.png"
    ),
    Item(
        name = "Coal Ore",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fe/Coal_Ore.png"
    ),
    Item(
        name = "Iron Ore",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Iron_Ore.png"
    ),
    Item(
        name = "Gold Nugget",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cf/Gold_Nugget.png"
    ),
    Item(
        name = "Crystal",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Crystal.png"
    ),
    Item(
        name = "Amethyst",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/Amethyst.png"
    ),
    Item(
        name = "Shiny Amethyst",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/26/Shiny_Amethyst.png"
    ),
    Item(
        name = "Aquamarine",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a2/Aquamarine.png"
    ),
    Item(
        name = "Shiny Aquamarine",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b2/Shiny_Aquamarine.png"
    ),
    Item(
        name = "Citrine",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Citrine.png"
    ),
    Item(
        name = "Shiny Citrine",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a8/Shiny_Citrine.png"
    ),
    Item(
        name = "Diamond",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ea/Diamond.png"
    ),
    Item(
        name = "Shiny Diamond",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ea/Shiny_Diamond.png"
    ),
    Item(
        name = "Emerald",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6a/Emerald.png"
    ),
    Item(
        name = "Shiny Emerald",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Shiny_Emerald.png"
    ),
    Item(
        name = "Garnet",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5a/Garnet.png"
    ),
    Item(
        name = "Shiny Garnet",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Shiny_Garnet.png"
    ),
    Item(
        name = "Onyx",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fb/Onyx.png"
    ),
    Item(
        name = "Peridot",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Peridot.png"
    ),
    Item(
        name = "Shiny Peridot",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/82/Shiny_Peridot.png"
    ),
    Item(
        name = "Ruby",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a9/Ruby.png"
    ),
    Item(
        name = "Shiny Ruby",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e3/Shiny_Ruby.png"
    ),
    Item(
        name = "Sapphire",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Sapphire.png"
    ),
    Item(
        name = "Shiny Sapphire",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/74/Shiny_Sapphire.png"
    ),
    Item(
        name = "Topaz",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a5/Topaz.png"
    ),
    Item(
        name = "Shiny Topaz",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fc/Shiny_Topaz.png"
    ),
    Item(
        name = "Tourmaline",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/94/Tourmaline.png"
    ),
    Item(
        name = "Shiny Tourmaline",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Shiny_Tourmaline.png"
    ),
    Item(
        name = "Vitalys Crystal",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d5/Vitalys_Crystal.png"
    ),
    Item(
        name = "Blue Zircon",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b2/Blue_Zircon.png"
    ),
    Item(
        name = "Alexandrite",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c9/Alexandrite.png"
    ),
    Item(
        name = "Black and Blue Sporty Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/60/Black_and_Blue_Sporty_Shorts.png"
    ),
    Item(
        name = "Black and Red Top Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/69/Black_and_Red_Top_Hat.png"
    ),
    Item(
        name = "Black and Yellow Top Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Black_and_Yellow_Top_Hat.png"
    ),
    Item(
        name = "Black Fitness Watch",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2d/Black_Fitness_Watch.png"
    ),
    Item(
        name = "Black Mickey Ears Headband",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/16/Black_Mickey_Ears_Headband.png"
    ),
    Item(
        name = "Black Running Mickey Mouse T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f6/Black_Running_Mickey_Mouse_T-Shirt.png"
    ),
    Item(
        name = "Blue Athletic Sunglasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/90/Blue_Athletic_Sunglasses.png"
    ),
    Item(
        name = "Blue Mickey Ears Headband",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Blue_Mickey_Ears_Headband.png"
    ),
    Item(
        name = "Blue Minnie Backpack",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Blue_Minnie_Backpack.png"
    ),
    Item(
        name = "Blue Sailor's Cap",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/64/Blue_Sailor%27s_Cap.png"
    ),
    Item(
        name = "Dark Gray Mickey-Mouse-Patch Jean Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fc/Dark_Gray_Mickey-Mouse-Patch_Jean_Jacket.png"
    ),
    Item(
        name = "Dazzling Mickey Mouse Ears Headband",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/90/Dazzling_Mickey_Mouse_Ears_Headband.png"
    ),
    Item(
        name = "Donald's Sailor Coat",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Donald%27s_Sailor_Coat.png"
    ),
    Item(
        name = "Festive Candy Ears with Bow",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/df/Festive_Candy_Ears_with_Bow.png"
    ),
    Item(
        name = "Festive Holiday Suit",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/Festive_Holiday_Suit.png"
    ),
    Item(
        name = "Festive Reindeer Headband",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f3/Festive_Reindeer_Headband.png"
    ),
    Item(
        name = "Golden Showman's Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e2/Golden_Showman%27s_Gown.png"
    ),
    Item(
        name = "Goofy's Signature Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Goofy%27s_Signature_Hat.png"
    ),
    Item(
        name = "Light Blue Mickey-Mouse-Patch Jean Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Light_Blue_Mickey-Mouse-Patch_Jean_Jacket.png"
    ),
    Item(
        name = "Loose Black Playful Pluto T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/07/Loose_Black_Playful_Pluto_T-Shirt.png"
    ),
    Item(
        name = "Loose White Playful Pluto T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/47/Loose_White_Playful_Pluto_T-Shirt.png"
    ),
    Item(
        name = "Mickey Mouse Extravaganza Jersey",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/Mickey_Mouse_Extravaganza_Jersey.png"
    ),
    Item(
        name = "Minnie's Dinner Party Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c5/Minnie%27s_Dinner_Party_Jacket.png"
    ),
    Item(
        name = "Pale Green Fishing Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/90/Pale_Green_Fishing_Hat.png"
    ),
    Item(
        name = "Pink Looking-Sharp Minnie Crop Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/34/Pink_Looking-Sharp_Minnie_Crop_Top.png"
    ),
    Item(
        name = "Red Athletic Sunglasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Red_Athletic_Sunglasses.png"
    ),
    Item(
        name = "Red Fitness Watch",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/71/Red_Fitness_Watch.png"
    ),
    Item(
        name = "Red Mickey High-Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/71/Red_Mickey_High-Top.png"
    ),
    Item(
        name = "Red Performance Sneakers",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d4/Red_Performance_Sneakers.png"
    ),
    Item(
        name = "Scarlet Showman's Tuxedo",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/71/Scarlet_Showman%27s_Tuxedo.png"
    ),
    Item(
        name = "Silver Pearl Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/81/Silver_Pearl_Earrings.png"
    ),
    Item(
        name = "Stylish Black Sweats",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a4/Stylish_Black_Sweats.png"
    ),
    Item(
        name = "Thick Curls and Mickey Buns",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/eb/Thick_Curls_and_Mickey_Buns.png"
    ),
    Item(
        name = "White and Pink Minnie Backpack",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/White_and_Pink_Minnie_Backpack.png"
    ),
    Item(
        name = "White Mickey-Mouse-Patch Jean Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8a/White_Mickey-Mouse-Patch_Jean_Jacket.png"
    ),
    Item(
        name = "White Retro Mickey Mouse T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c2/White_Retro_Mickey_Mouse_T-Shirt.png"
    ),
    Item(
        name = "White Sailor's Cap",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c3/White_Sailor%27s_Cap.png"
    ),
    Item(
        name = "Yellow Fishing Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2a/Yellow_Fishing_Hat.png"
    ),
    Item(
        name = "Yellow Minnie Backpack",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/53/Yellow_Minnie_Backpack.png"
    ),
    Item(
        name = "Yellow Performance Sneakers",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c6/Yellow_Performance_Sneakers.png"
    ),
    Item(
        name = "Black \"Define Dancing\" Tank Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Black_%22Define_Dancing%22_Tank_Top.png"
    ),
    Item(
        name = "Blue \"Define Dancing\" Tank Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a0/Blue_%22Define_Dancing%22_Tank_Top.png"
    ),
    Item(
        name = "Blue Eco-Suit",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Blue_Eco-Suit.png"
    ),
    Item(
        name = "Blue High-Tech Trainers",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7c/Blue_High-Tech_Trainers.png"
    ),
    Item(
        name = "Blue Safety Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7d/Blue_Safety_Gloves.png"
    ),
    Item(
        name = "Blue Work Overalls",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Blue_Work_Overalls.png"
    ),
    Item(
        name = "Brown BnL Bomber Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5b/Brown_BnL_Bomber_Jacket.png"
    ),
    Item(
        name = "Brown Safety Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Brown_Safety_Gloves.png"
    ),
    Item(
        name = "Futuristic Blue Jumpsuit",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/29/Futuristic_Blue_Jumpsuit.png"
    ),
    Item(
        name = "Futuristic Red Jumpsuit",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Futuristic_Red_Jumpsuit.png"
    ),
    Item(
        name = "Green Eco-Suit",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Green_Eco-Suit.png"
    ),
    Item(
        name = "Green High-Tech Trainers",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ae/Green_High-Tech_Trainers.png"
    ),
    Item(
        name = "Green Sprout Boot T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fe/Green_Sprout_Boot_T-Shirt.png"
    ),
    Item(
        name = "Green Work Overalls",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/48/Green_Work_Overalls.png"
    ),
    Item(
        name = "Orange Eco-Suit",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9c/Orange_Eco-Suit.png"
    ),
    Item(
        name = "Orange High-Tech Trainers",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/41/Orange_High-Tech_Trainers.png"
    ),
    Item(
        name = "Orange Visor Glasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f4/Orange_Visor_Glasses.png"
    ),
    Item(
        name = "Pink Combat Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Pink_Combat_Boots.png"
    ),
    Item(
        name = "Pink Retro Shades",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fa/Pink_Retro_Shades.png"
    ),
    Item(
        name = "Retro \"Meal-in-a-Cup\" T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8d/Retro_%22Meal-in-a-Cup%22_T-Shirt.png"
    ),
    Item(
        name = "Sunset Retro Shades",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c8/Sunset_Retro_Shades.png"
    ),
    Item(
        name = "WALL-E Companion Pack",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1b/WALL-E_Companion_Pack.png"
    ),
    Item(
        name = "White Sprout Boot T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/White_Sprout_Boot_T-Shirt.png"
    ),
    Item(
        name = "Yellow Combat Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/46/Yellow_Combat_Boots.png"
    ),
    Item(
        name = "Yellow Safety Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/41/Yellow_Safety_Gloves.png"
    ),
    Item(
        name = "Dreamlight Valley Jersey",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/92/Dreamlight_Valley_Jersey.png"
    ),
    Item(
        name = "Blue Beach Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/79/Blue_Beach_Shorts.png"
    ),
    Item(
        name = "Blue Tassel Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/03/Blue_Tassel_Earrings.png"
    ),
    Item(
        name = "Green Beach Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ef/Green_Beach_Shorts.png"
    ),
    Item(
        name = "Green Tassel Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/17/Green_Tassel_Earrings.png"
    ),
    Item(
        name = "Green Woven Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cb/Green_Woven_Shorts.png"
    ),
    Item(
        name = "Lava Pleather Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f9/Lava_Pleather_Jacket.png"
    ),
    Item(
        name = "Lush Green Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/64/Lush_Green_Earrings.png"
    ),
    Item(
        name = "Orange Gradient Shades",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2c/Orange_Gradient_Shades.png"
    ),
    Item(
        name = "Pink Woven Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/86/Purple_Woven_Shorts.png"
    ),
    Item(
        name = "Tan \"Heart of Te Fiti\" Camisole",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/29/Tan_%22Heart_of_Te_Fiti%22_Camisole.png"
    ),
    Item(
        name = "Turquoise Woven Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/17/Turquoise_Woven_Shorts.png"
    ),
    Item(
        name = "Black Checkered Chef Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/86/Black_Checkered_Chef_Pants.png"
    ),
    Item(
        name = "Black Foodie Loafers",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Black_Foodie_Loafers.png"
    ),
    Item(
        name = "Black Squeaker Sneakers",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Black_Squeaker_Sneakers.png"
    ),
    Item(
        name = "Blue Layered Turtleneck",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/49/Blue_Layered_Turtleneck.png"
    ),
    Item(
        name = "Blue Wool Coat",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/84/Blue_Wool_Coat.png"
    ),
    Item(
        name = "Brown Slacks",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/Brown_Slacks.png"
    ),
    Item(
        name = "Dark Blue Layered Turtleneck",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3f/Dark_Blue_Layered_Turtleneck.png"
    ),
    Item(
        name = "French Bouffant Hairstyle",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4e/French_Bouffant_Hairstyle.png"
    ),
    Item(
        name = "Gold French Watch",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/da/Gold_French_Watch.png"
    ),
    Item(
        name = "Gray Cardigan",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Gray_Cardigan.png"
    ),
    Item(
        name = "Green Foodie Loafers",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/81/Green_Foodie_Loafers.png"
    ),
    Item(
        name = "Off-Shoulder Bag",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Off-Shoulder_Bag.png"
    ),
    Item(
        name = "Red Squeaker Sneakers",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d2/Red_Squeaker_Sneakers.png"
    ),
    Item(
        name = "Remy's White Chef Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1b/Remy%27s_White_Chef_Hat.png"
    ),
    Item(
        name = "Silver French Watch",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Silver_French_Watch.png"
    ),
    Item(
        name = "White \"Little Chef\" Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9d/White_%22Little_Chef%22_Top.png"
    ),
    Item(
        name = "White Checkered Chef Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/89/White_Checkered_Chef_Pants.png"
    ),
    Item(
        name = "White Foodie Loafers",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/White_Foodie_Loafers.png"
    ),
    Item(
        name = "Black Rose-Embroidered Ballerina Flats",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7d/Black_Rose-Embroidered_Ballerina_Flats.png"
    ),
    Item(
        name = "Blue \"Turn the Page\" Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/96/Blue_%22Turn_the_Page%22_Earrings.png"
    ),
    Item(
        name = "Blue Formal Suit",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8d/Blue_Formal_Suit.png"
    ),
    Item(
        name = "Blue Rose-Embroidered Ballerina Flats",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6d/Blue_Rose-Embroidered_Ballerina_Flats.png"
    ),
    Item(
        name = "Brown Dress Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cb/Brown_Dress_Pants.png"
    ),
    Item(
        name = "Elegant Floral Semi-Updo",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/36/Elegant_Floral_Semi-Updo.png"
    ),
    Item(
        name = "Golden Floral Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7d/Golden_Floral_Gown.png"
    ),
    Item(
        name = "Golden White Formal Suit",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Golden_White_Formal_Suit.png"
    ),
    Item(
        name = "Intricate Golden Floral Heels",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b8/Intricate_Golden_Floral_Heels.png"
    ),
    Item(
        name = "Loose Blue Button-Up Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Loose_Blue_Button-Up_Shirt.png"
    ),
    Item(
        name = "Loose White Button-Up Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cc/Loose_White_Button-Up_Shirt.png"
    ),
    Item(
        name = "Ornate Brown Wristwatch",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2b/Ornate_Brown_Wristwatch.png"
    ),
    Item(
        name = "Pink \"Enchanted Rose\" Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/89/Pink_%22Enchanted_Rose%22_Top.png"
    ),
    Item(
        name = "Red \"Turn the Page\" Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Red_%22Turn_the_Page%22_Earrings.png"
    ),
    Item(
        name = "Red Rose Necklace Set",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a0/Red_Rose_Necklace_Set.png"
    ),
    Item(
        name = "Tan Dress Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f5/Tan_Dress_Pants.png"
    ),
    Item(
        name = "Tan Pleated Slacks",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8e/Tan_Pleated_Slacks.png"
    ),
    Item(
        name = "White Pleated Slacks",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7f/White_Pleated_Slacks.png"
    ),
    Item(
        name = "Yellow \"Enchanted Rose\" Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ce/Yellow_%22Enchanted_Rose%22_Top.png"
    ),
    Item(
        name = "Black BFF T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5b/Black_BFF_T-Shirt.png"
    ),
    Item(
        name = "Blue Tech Bracelets",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/89/Blue_Tech_Bracelets.png"
    ),
    Item(
        name = "Candy-Encrusted Pigtails",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/42/Candy-Encrusted_Pigtails.png"
    ),
    Item(
        name = "Dark Green Pixel Camo Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/69/Dark_Green_Pixel_Camo_Pants.png"
    ),
    Item(
        name = "Green Cropped Camo Hoodie",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/56/Green_Cropped_Camo_Hoodie.png"
    ),
    Item(
        name = "Green Lace-Up Combat Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f5/Green_Lace-Up_Combat_Boots.png"
    ),
    Item(
        name = "Orange Dog Tags",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/56/Orange_Dog_Tags.png"
    ),
    Item(
        name = "Pink Candy-Laden Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6a/Pink_Candy-Laden_Skirt.png"
    ),
    Item(
        name = "Purple Candy-Laden Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5d/Purple_Candy-Laden_Skirt.png"
    ),
    Item(
        name = "Ralph's Sturdy Overalls",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Ralph%27s_Sturdy_Overalls.png"
    ),
    Item(
        name = "Silver Tech Bracelets",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Silver_Tech_Bracelets.png"
    ),
    Item(
        name = "Turquoise Candy-Laden Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/Turquoise_Candy-Laden_Skirt.png"
    ),
    Item(
        name = "White BFF T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/White_BFF_T-Shirt.png"
    ),
    Item(
        name = "Blue Mice-Sewn Pearl-Strung Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/79/Blue_Mice-Sewn_Pearl-Strung_Gown.png"
    ),
    Item(
        name = "Burgundy Gold Lock Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e7/Burgundy_Gold_Lock_Skirt.png"
    ),
    Item(
        name = "Enchanting Pink Pumpkin Ring",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/77/Enchanting_Pink_Pumpkin_Ring.png"
    ),
    Item(
        name = "Fancy Black and Blue Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/20/Fancy_Black_and_Blue_Hat.png"
    ),
    Item(
        name = "Fancy Bronze Bracelet",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/70/Fancy_Bronze_Bracelet.png"
    ),
    Item(
        name = "Fancy Gold Jeweled Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3a/Fancy_Gold_Jeweled_Gloves.png"
    ),
    Item(
        name = "Fancy Silver Jeweled Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/66/Fancy_Silver_Jeweled_Gloves.png"
    ),
    Item(
        name = "Green Pearls of Freedom Necklace",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/61/Green_Pearls_of_Freedom_Necklace.png"
    ),
    Item(
        name = "Once Upon a Ball Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3f/Once_Upon_a_Ball_Gown.png"
    ),
    Item(
        name = "Pearl-Laced Updo",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e3/Pearl-Laced_Updo.png"
    ),
    Item(
        name = "Pink Jewel-Collared Button-Up",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Pink_Jewel-Collared_Button-Up.png"
    ),
    Item(
        name = "Pink Pearls of Freedom Necklace",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/39/Pink_Pearls_of_Freedom_Necklace.png"
    ),
    Item(
        name = "Sturdy Blue Overalls",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/19/Sturdy_Blue_Overalls.png"
    ),
    Item(
        name = "Sturdy White Overalls",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5f/Sturdy_White_Overalls.png"
    ),
    Item(
        name = "White Pearls of Freedom Necklace",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/White_Pearls_of_Freedom_Necklace.png"
    ),
    Item(
        name = "Black and Silver Claw Shoes",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/39/Black_and_Silver_Claw_Shoes.png"
    ),
    Item(
        name = "Blue Baby-Simba Crop Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/15/Blue_Baby-Simba_Crop_Top.png"
    ),
    Item(
        name = "Blue Silk Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d3/Blue_Silk_Shirt.png"
    ),
    Item(
        name = "Brown Rebel-lion Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Brown_Rebel-lion_Gloves.png"
    ),
    Item(
        name = "Classy Blue Dress Shoes",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Classy_Blue_Dress_Shoes.png"
    ),
    Item(
        name = "Gold and Purple Watch",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/70/Gold_and_Purple_Watch.png"
    ),
    Item(
        name = "Green Claw Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Green_Claw_Top.png"
    ),
    Item(
        name = "Orange Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/89/Orange_Earrings.png"
    ),
    Item(
        name = "Orange Sunrise Bracelet",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/05/Orange_Sunrise_Bracelet.png"
    ),
    Item(
        name = "Purple Baby-Simba Crop Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/Purple_Baby-Simba_Crop_Top.png"
    ),
    Item(
        name = "Red Faux-Fur-Trimmed Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3b/Red_Faux-Fur-Trimmed_Jacket.png"
    ),
    Item(
        name = "Tan Sunny Slacks",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Tan_Sunny_Slacks.png"
    ),
    Item(
        name = "Yellow \"Time Flies\" Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ef/Yellow_%22Time_Flies%22_Top.png"
    ),
    Item(
        name = "Ariel's Seafoam Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/23/Ariel%27s_Seafoam_Gown.png"
    ),
    Item(
        name = "Blue Button-Up Vest",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Blue_Button-Up_Vest.png"
    ),
    Item(
        name = "Buttoned Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/39/Buttoned_Boots.png"
    ),
    Item(
        name = "Dark Blue Button-Up Vest",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Dark_Blue_Button-Up_Vest.png"
    ),
    Item(
        name = "Gray Button-Up Vest",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e4/Gray_Button-Up_Vest.png"
    ),
    Item(
        name = "Pink Off-the-Shoulder Shell Crop Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Pink_Off-the-Shoulder_Shell_Crop_Top.png"
    ),
    Item(
        name = "Purple and Tan Seashell Satchel",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b8/Purple_and_Tan_Seashell_Satchel.png"
    ),
    Item(
        name = "Red Cummerbund Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/96/Red_Cummerbund_Pants.png"
    ),
    Item(
        name = "Seaside Prince Side Part",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/85/Seaside_Prince_Side_Part.png"
    ),
    Item(
        name = "Shimmering Green Scaled Pants [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ee/Shimmering_Green_Scaled_Pants.png"
    ),
    Item(
        name = "Silver Mariner's Watch",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0c/Silver_Mariner%27s_Watch.png"
    ),
    Item(
        name = "White and Blue Officer Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e4/White_and_Blue_Officer_Jacket.png"
    ),
    Item(
        name = "White Silk Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8a/White_Silk_Gloves.png"
    ),
    Item(
        name = "Arendelle Braided Updo",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/86/Arendelle_Braided_Updo.png"
    ),
    Item(
        name = "Black Winter Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/aa/Black_Winter_Jacket.png"
    ),
    Item(
        name = "Blue Ice Shard Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/16/Blue_Ice_Shard_Earrings.png"
    ),
    Item(
        name = "Cozy Blue Sweater",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6f/Cozy_Blue_Sweater.png"
    ),
    Item(
        name = "Cozy Orange Sweater",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b1/Cozy_Orange_Sweater.png"
    ),
    Item(
        name = "Elemental Blue Hoodie",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Elemental_Blue_Hoodie.png"
    ),
    Item(
        name = "Fancy Black and Gold Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/01/Fancy_Black_and_Gold_Boots.png"
    ),
    Item(
        name = "Fireproof Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/62/Fireproof_Gloves.png"
    ),
    Item(
        name = "Gleaming Ice Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a0/Gleaming_Ice_Gown.png"
    ),
    Item(
        name = "Hat Hair",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4a/Hat_Hair.png"
    ),
    Item(
        name = "Purple Ice Shard Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2a/Purple_Ice_Shard_Earrings.png"
    ),
    Item(
        name = "Red Reindeer-Cinched Scarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Red_Reindeer-Cinched_Scarf.png"
    ),
    Item(
        name = "Red Winter Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/80/Red_Winter_Jacket.png"
    ),
    Item(
        name = "Sparkling-Ice Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Sparkling-Ice_Gown.png"
    ),
    Item(
        name = "Blue Floral Jumpsuit",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6c/Blue_Floral_Jumpsuit.png"
    ),
    Item(
        name = "Blue Silk Camisole [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a0/Blue_Silk_Camisole.png"
    ),
    Item(
        name = "Brown Artist's Satchel",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7f/Brown_Artist%27s_Satchel.png"
    ),
    Item(
        name = "Crisp White Button-Up",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/Crisp_White_Button-Up.png"
    ),
    Item(
        name = "Golden \"Dagger of Betrayal\" Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Golden_%22Dagger_of_Betrayal%22_Earrings.png"
    ),
    Item(
        name = "Golden Tower Necklace",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Golden_Tower_Necklace.png"
    ),
    Item(
        name = "Green Floral Cardigan",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/Green_Floral_Cardigan.png"
    ),
    Item(
        name = "Green Floral Scarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/32/Green_Floral_Scarf.png"
    ),
    Item(
        name = "Khaki Jodhpurs",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b1/Khaki_Jodhpurs.png"
    ),
    Item(
        name = "Purple Artist's Satchel",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a8/Purple_Artist%27s_Satchel.png"
    ),
    Item(
        name = "Purple Floral Jumpsuit",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ec/Purple_Floral_Jumpsuit.png"
    ),
    Item(
        name = "Purple Silk Camisole [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cd/Purple_Silk_Camisole.png"
    ),
    Item(
        name = "Sharp Heels",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Sharp_Heels.png"
    ),
    Item(
        name = "Silver Dagger-Sharp Nails",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/12/Silver_Dagger-Sharp_Nails.png"
    ),
    Item(
        name = "Tan Jodhpurs",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Tan_Jodhpurs.png"
    ),
    Item(
        name = "Trusty Brown Satchel",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/48/Trusty_Brown_Satchel.png"
    ),
    Item(
        name = "Black and Yellow Rubber Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1c/Black_and_Yellow_Rubber_Gloves.png"
    ),
    Item(
        name = "Black Rain Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5b/Black_Rain_Jacket.png"
    ),
    Item(
        name = "Blue Goggles",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b2/Blue_Goggles.png"
    ),
    Item(
        name = "Blue Mike Bag",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/92/Blue_Mike_Bag.png"
    ),
    Item(
        name = "Blue Sweats",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1b/Blue_Sweats.png"
    ),
    Item(
        name = "Chunky Sneakers With Green Highlights",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Chunky_Sneakers_With_Green_Highlights.png"
    ),
    Item(
        name = "Decontamination Pack",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/67/Decontamination_Pack.png"
    ),
    Item(
        name = "Green Headphones",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/Green_Headphones.png"
    ),
    Item(
        name = "Green Tufted Horns",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d8/Green_Tufted_Horns.png"
    ),
    Item(
        name = "Pale Blue Jean Jacket With Patches",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d2/Pale_Blue_Jean_Jacket_With_Patches.png"
    ),
    Item(
        name = "Puffy Green Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/Puffy_Green_Jacket.png"
    ),
    Item(
        name = "Purple Tufted Horns",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Purple_Tufted_Horns.png"
    ),
    Item(
        name = "Red Mike Bag",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6d/Red_Mike_Bag.png"
    ),
    Item(
        name = "Rubber Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e8/Rubber_Boots.png"
    ),
    Item(
        name = "White Rain Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/32/White_Rain_Jacket.png"
    ),
    Item(
        name = "Yellow Rain Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8c/Yellow_Rain_Jacket.png"
    ),
    Item(
        name = "Black Dolly Shoes",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1c/Black_Dolly_Shoes.png"
    ),
    Item(
        name = "Blue Dolly Shoes",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/56/Blue_Dolly_Shoes.png"
    ),
    Item(
        name = "Bo Peep's Shepherd's Crook",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Bo_Peep%27s_Shepherd%27s_Crook.png"
    ),
    Item(
        name = "Cowboy Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/99/Cowboy_Hat.png"
    ),
    Item(
        name = "Dark Brown Cowboy Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ae/Dark_Brown_Cowboy_Hat.png"
    ),
    Item(
        name = "Dolly-Bow Ponytail",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/35/Dolly-Bow_Ponytail.png"
    ),
    Item(
        name = "Frilly Pink Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/05/Frilly_Pink_Pants.png"
    ),
    Item(
        name = "Gray Wild West Button-Up",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5d/Gray_Wild_West_Button-Up.png"
    ),
    Item(
        name = "Lacy Blue Coat",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/05/Lacy_Blue_Coat.png"
    ),
    Item(
        name = "Lacy Purple Coat",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Lacy_Purple_Coat.png"
    ),
    Item(
        name = "Orange \"There's a Boot on my Shirt\" Tank Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a4/Orange_%22There%27s_a_Boot_on_my_Shirt%22_Tank_Top.png"
    ),
    Item(
        name = "Pink Dolly Shoes",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Pink_Dolly_Shoes.png"
    ),
    Item(
        name = "Red Wild West Button-Up",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/07/Red_Wild_West_Button-Up.png"
    ),
    Item(
        name = "Sheriff's Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Sheriff%27s_Jacket.png"
    ),
    Item(
        name = "Space Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/58/Space_Pants.png"
    ),
    Item(
        name = "Space Ranger Wings",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/59/Space_Ranger_Wings.png"
    ),
    Item(
        name = "Sturdy Blue Jeans",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/12/Sturdy_Blue_Jeans.png"
    ),
    Item(
        name = "White Space Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/29/White_Space_Gloves.png"
    ),
    Item(
        name = "White Star Command Turtleneck",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/18/White_Star_Command_Turtleneck.png"
    ),
    Item(
        name = "Yellow Wild West Button-Up",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/29/Yellow_Wild_West_Button-Up.png"
    ),
    Item(
        name = "High-Boot Incredibles Suit",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a3/High-Boot_Incredibles_Suit.png"
    ),
    Item(
        name = "Low-Boot Incredibles Suit",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Low-Boot_Incredibles_Suit.png"
    ),
    Item(
        name = "Skeleton Onesie",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cb/Skeleton_Onesie.png"
    ),
    Item(
        name = "Malevolent Fairy Horns",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Malevolent_Fairy_Horns.png"
    ),
    Item(
        name = "Assorted Bronze Rings",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Assorted_Bronze_Rings.png"
    ),
    Item(
        name = "Assorted Silver Rings",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Assorted_Silver_Rings.png"
    ),
    Item(
        name = "Bald",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9d/Bald.png"
    ),
    Item(
        name = "Black Activewear Headscarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Black_Activewear_Headscarf.png"
    ),
    Item(
        name = "Black and Red Long-Sleeved Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ab/Black_and_Red_Long-Sleeved_Gown.png"
    ),
    Item(
        name = "Black Ankle Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/18/Black_Ankle_Socks.png"
    ),
    Item(
        name = "Black Cat Ears",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Black_Cat_Ears.png"
    ),
    Item(
        name = "Black Cropped Cardigan",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/59/Black_Cropped_Cardigan.png"
    ),
    Item(
        name = "Black Footie Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e3/Black_Footie_Socks.png"
    ),
    Item(
        name = "Black Headscarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/Black_Headscarf.png"
    ),
    Item(
        name = "Black Holographic Choker",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Black_Holographic_Choker.png"
    ),
    Item(
        name = "Black Jean Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/48/Black_Jean_Skirt.png"
    ),
    Item(
        name = "Black Knee-High Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7b/Black_Knee-High_Socks.png"
    ),
    Item(
        name = "Black Long-Sleeved Turtleneck",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a4/Black_Long-Sleeved_Turtleneck.png"
    ),
    Item(
        name = "Black Open-Neck Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c3/Black_Open-Neck_Shirt.png"
    ),
    Item(
        name = "Black Pleated Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b8/Black_Pleated_Skirt.png"
    ),
    Item(
        name = "Black Rectangular Glasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Black_Rectangular_Glasses.png"
    ),
    Item(
        name = "Black Skinny Jeans",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/29/Black_Skinny_Jeans.png"
    ),
    Item(
        name = "Black Sunglasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/99/Black_Sunglasses.png"
    ),
    Item(
        name = "Black Tang Suit Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cf/Black_Tang_Suit_Jacket.png"
    ),
    Item(
        name = "Black T-Shirt Dress",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/71/Black_T-Shirt_Dress.png"
    ),
    Item(
        name = "Black Varsity Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/34/Black_Varsity_Jacket.png"
    ),
    Item(
        name = "Black Wide-Brimmed Fedora",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/77/Black_Wide-Brimmed_Fedora.png"
    ),
    Item(
        name = "Blue and Green Beaded Sandals",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5b/Blue_and_Green_Beaded_Sandals.png"
    ),
    Item(
        name = "Blue Backpack",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Blue_Backpack.png"
    ),
    Item(
        name = "Blue Bootcut Jeans",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Blue_Bootcut_Jeans.png"
    ),
    Item(
        name = "Blue Dress Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/07/Blue_Dress_Pants.png"
    ),
    Item(
        name = "Blue Footie Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fc/Blue_Footie_Socks.png"
    ),
    Item(
        name = "Blue High-Waisted Jean Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Blue_High-Waisted_Jean_Shorts.png"
    ),
    Item(
        name = "Blue Jean Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4e/Blue_Jean_Shorts.png"
    ),
    Item(
        name = "Blue Knee-High Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Blue_Knee-High_Socks.png"
    ),
    Item(
        name = "Blue Plaid Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1e/Blue_Plaid_Shirt.png"
    ),
    Item(
        name = "Blue Rolled-Cuff Jean Capris",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/Blue_Rolled-Cuff_Jean_Capris.png"
    ),
    Item(
        name = "Blue Rolled-Cuff Skinny Jeans",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Blue_Rolled-Cuff_Skinny_Jeans.png"
    ),
    Item(
        name = "Blue Skinny Jeans",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/40/Blue_Skinny_Jeans.png"
    ),
    Item(
        name = "Blue Thigh-High Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/Blue_Thigh-High_Socks.png"
    ),
    Item(
        name = "Blue Wetsuit",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/aa/Blue_Wetsuit.png"
    ),
    Item(
        name = "Blue Winter Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8e/Blue_Winter_Hat.png"
    ),
    Item(
        name = "Bronze Solid Bond Ring",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/51/Bronze_Solid_Bond_Ring.png"
    ),
    Item(
        name = "Bronze Triple Stud Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8e/Bronze_Triple_Stud_Earrings.png"
    ),
    Item(
        name = "Brown Lace-Up Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Brown_Lace-Up_Boots.png"
    ),
    Item(
        name = "Brown Oversized Glasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/35/Brown_Oversized_Glasses.png"
    ),
    Item(
        name = "Brown Rectangular Glasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/Brown_Rectangular_Glasses.png"
    ),
    Item(
        name = "Brown Watch",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/55/Brown_Watch.png"
    ),
    Item(
        name = "Calico Cat Ears",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/db/Calico_Cat_Ears.png"
    ),
    Item(
        name = "Classic Bronze Hoops",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/28/Classic_Bronze_Hoops.png"
    ),
    Item(
        name = "Classic Silver Hoops",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d7/Classic_Silver_Hoops.png"
    ),
    Item(
        name = "Comfy Pink Hoodie",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9d/Comfy_Pink_Hoodie.png"
    ),
    Item(
        name = "Commodore's Powdered Curls",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/93/Commodore%27s_Powdered_Curls.png"
    ),
    Item(
        name = "Cream and Red Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b8/Cream_and_Red_Gloves.png"
    ),
    Item(
        name = "Dark Brown Pirate's Tricorn Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5b/Dark_Brown_Pirate%27s_Tricorn_Hat.png"
    ),
    Item(
        name = "Double-Bun Half-Updo with Fringe",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/79/Double-Bun_Half-Updo_with_Fringe.png"
    ),
    Item(
        name = "Gold and Blue Jeweled Frames",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c0/Gold_and_Blue_Jeweled_Frames.png"
    ),
    Item(
        name = "Gold Solid Bond Ring",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/73/Gold_Solid_Bond_Ring.png"
    ),
    Item(
        name = "Gold Swan-Feather Pearl Necklace",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/53/Gold_Swan-Feather_Pearl_Necklace.png"
    ),
    Item(
        name = "Gold Triple Stud Earrings",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6a/Gold_Triple_Stud_Earrings.png"
    ),
    Item(
        name = "Golden Castle Jersey",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Golden_Castle_Jersey.png"
    ),
    Item(
        name = "Golden Orange Sweetheart Strapless Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f9/Golden_Orange_Sweetheart_Strapless_Gown.png"
    ),
    Item(
        name = "Grand Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/55/Grand_Skirt.png"
    ),
    Item(
        name = "Gray Baseball Cap",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/02/Gray_Baseball_Cap.png"
    ),
    Item(
        name = "Gray Jean Overalls",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d4/Gray_Jean_Overalls.png"
    ),
    Item(
        name = "Gray Rolled-Cuff Jean Capris",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/96/Gray_Rolled-Cuff_Jean_Capris.png"
    ),
    Item(
        name = "Gray Round Wireframe Glasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/eb/Gray_Round_Wireframe_Glasses.png"
    ),
    Item(
        name = "Gray Wetsuit",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Gray_Wetsuit.png"
    ),
    Item(
        name = "Grayish White Evening Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Grayish_White_Evening_Gloves.png"
    ),
    Item(
        name = "Green Backpack",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Green_Backpack.png"
    ),
    Item(
        name = "Green Crew Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/67/Green_Crew_Socks.png"
    ),
    Item(
        name = "Green Footie Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/36/Green_Footie_Socks.png"
    ),
    Item(
        name = "Green Knee-High Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Green_Knee-High_Socks.png"
    ),
    Item(
        name = "Green Lace-Up Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c0/Green_Lace-Up_Boots.png"
    ),
    Item(
        name = "Green Long-Sleeved Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2c/Green_Long-Sleeved_Gown.png"
    ),
    Item(
        name = "Green Rolled-Cuff Jean Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/aa/Green_Rolled-Cuff_Jean_Shorts.png"
    ),
    Item(
        name = "Green Silk Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d2/Green_Silk_Gloves.png"
    ),
    Item(
        name = "Green Thigh-High Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e4/Green_Thigh-High_Socks.png"
    ),
    Item(
        name = "Green Woven Sandals",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Green_Woven_Sandals.png"
    ),
    Item(
        name = "Icy Blue Sweetheart Strapless Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cd/Icy_Blue_Sweetheart_Strapless_Gown.png"
    ),
    Item(
        name = "Long Black Fingerless Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a3/Long_Black_Fingerless_Gloves.png"
    ),
    Item(
        name = "Long Gray Fingerless Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Long_Gray_Fingerless_Gloves.png"
    ),
    Item(
        name = "Long Red Fingerless Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1e/Long_Red_Fingerless_Gloves.png"
    ),
    Item(
        name = "Luxo Jr. Jersey",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ec/Luxo_Jr._Jersey.png"
    ),
    Item(
        name = "Navy Blue Activewear Headscarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bc/Navy_Blue_Activewear_Headscarf.png"
    ),
    Item(
        name = "Navy Blue Jean Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Navy_Blue_Jean_Shorts.png"
    ),
    Item(
        name = "Nightmarish Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/80/Nightmarish_Boots.png"
    ),
    Item(
        name = "Orange and Green Beaded Sandals",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b5/Orange_and_Green_Beaded_Sandals.png"
    ),
    Item(
        name = "Orange Knee-High Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/00/Orange_Knee-High_Boots.png"
    ),
    Item(
        name = "Pale Brown Lace-Up Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/23/Pale_Brown_Lace-Up_Boots.png"
    ),
    Item(
        name = "Pale Pink Cottage Dress",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Pale_Pink_Cottage_Dress.png"
    ),
    Item(
        name = "Pink and Purple Long-Sleeved Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/16/Pink_and_Purple_Long-Sleeved_Gown.png"
    ),
    Item(
        name = "Pink Baseball Cap",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b8/Pink_Baseball_Cap.png"
    ),
    Item(
        name = "Pink Headscarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/62/Pink_Headscarf.png"
    ),
    Item(
        name = "Pink Knot Wrap",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5b/Pink_Knot_Wrap.png"
    ),
    Item(
        name = "Pink Pleated Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Pink_Pleated_Skirt.png"
    ),
    Item(
        name = "Pink Rolled-Cuff Jean Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/da/Pink_Rolled-Cuff_Jean_Shorts.png"
    ),
    Item(
        name = "Pink Varsity Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/68/Pink_Varsity_Jacket.png"
    ),
    Item(
        name = "Pixar Ball Ears Headband",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/98/Pixar_Ball_Ears_Headband.png"
    ),
    Item(
        name = "Plain Gray T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/73/Plain_Gray_T-Shirt.png"
    ),
    Item(
        name = "Plague Mask",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0c/Plague_Mask.png"
    ),
    Item(
        name = "Purple Cat Ears",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6b/Purple_Cat_Ears.png"
    ),
    Item(
        name = "Purple Good-to-Be-Bad T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Purple_Good-to-Be-Bad_T-Shirt.png"
    ),
    Item(
        name = "Purple Sleeveless Turtleneck Crop Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Purple_Sleeveless_Turtleneck_Crop_Top.png"
    ),
    Item(
        name = "Red Activewear Headscarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3a/Red_Activewear_Headscarf.png"
    ),
    Item(
        name = "Red Backpack",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/Red_Backpack.png"
    ),
    Item(
        name = "Red Crew Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a0/Red_Crew_Socks.png"
    ),
    Item(
        name = "Red Footie Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/Red_Footie_Socks.png"
    ),
    Item(
        name = "Red Headscarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f9/Red_Headscarf.png"
    ),
    Item(
        name = "Red Jean Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d6/Red_Jean_Skirt.png"
    ),
    Item(
        name = "Red Long-Sleeved Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b2/Red_Long-Sleeved_Gown.png"
    ),
    Item(
        name = "Red Plaid Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/27/Red_Plaid_Shirt.png"
    ),
    Item(
        name = "Red Silk Gloves",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/75/Red_Silk_Gloves.png"
    ),
    Item(
        name = "Red Slip-On Boots",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/ba/Red_Slip-On_Boots.png"
    ),
    Item(
        name = "Red Tang Suit Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Red_Tang_Suit_Jacket.png"
    ),
    Item(
        name = "Red Varsity Jacket",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/58/Red_Varsity_Jacket.png"
    ),
    Item(
        name = "Santa Hat",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Santa_Hat.png"
    ),
    Item(
        name = "Short Black Heels",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Short_Black_Heels.png"
    ),
    Item(
        name = "Short Red Heels",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/40/Short_Red_Heels.png"
    ),
    Item(
        name = "Silver and Blue Jeweled Frames",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Silver_and_Blue_Jeweled_Frames.png"
    ),
    Item(
        name = "Silver Solid Bond Ring",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/19/Silver_Solid_Bond_Ring.png"
    ),
    Item(
        name = "Silver Swan-Feather Pearl Necklace",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cb/Silver_Swan-Feather_Pearl_Necklace.png"
    ),
    Item(
        name = "Simple Copper Bracelets",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8c/Simple_Copper_Bracelets.png"
    ),
    Item(
        name = "Simple Silver Bracelets",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5f/Simple_Silver_Bracelets.png"
    ),
    Item(
        name = "Straw Boater Hat with Black Ribbon",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/59/Straw_Boater_Hat_with_Black_Ribbon.png"
    ),
    Item(
        name = "Sun-and-Moon Crown",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Sun-and-Moon_Crown.png"
    ),
    Item(
        name = "Tan Chino Shorts",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/78/Tan_Chino_Shorts.png"
    ),
    Item(
        name = "Tan Pleated Skirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/94/Tan_Pleated_Skirt.png"
    ),
    Item(
        name = "Thorny Pants",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7f/Thorny_Pants.png"
    ),
    Item(
        name = "Tousled Short Hair",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Tousled_Short_Hair.png"
    ),
    Item(
        name = "Turquoise Sleeveless Turtleneck Crop Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f0/Turquoise_Sleeveless_Turtleneck_Crop_Top.png"
    ),
    Item(
        name = "White and Blue Basketball Sneakers",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6c/White_and_Blue_Basketball_Sneakers.png"
    ),
    Item(
        name = "White Ankle Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/White_Ankle_Socks.png"
    ),
    Item(
        name = "White Crew Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/99/White_Crew_Socks.png"
    ),
    Item(
        name = "White Headband",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9b/White_Headband.png"
    ),
    Item(
        name = "White Knee-High Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/White_Knee-High_Socks.png"
    ),
    Item(
        name = "White Open-Neck Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ef/White_Open-Neck_Shirt.png"
    ),
    Item(
        name = "White Rectangular Glasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9c/White_Rectangular_Glasses.png"
    ),
    Item(
        name = "White Sunglasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d9/White_Sunglasses.png"
    ),
    Item(
        name = "White Thigh-High Socks",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/White_Thigh-High_Socks.png"
    ),
    Item(
        name = "Yellow House of Dreams T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5d/Yellow_House_of_Dreams_T-Shirt.png"
    ),
    Item(
        name = "Yellow Long-Sleeved Boatneck",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fc/Yellow_Long-Sleeved_Boatneck.png"
    ),
    Item(
        name = "Yellow Round Wireframe Glasses",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/59/Yellow_Round_Wireframe_Glasses.png"
    ),
    Item(
        name = "Yellow Wide-Brimmed Fedora",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/08/Yellow_Wide-Brimmed_Fedora.png"
    ),
    Item(
        name = "Basic Backpack",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5c/Basic_Backpack.png"
    ),
    Item(
        name = "Basic Cottage Dress",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/23/Basic_Cottage_Dress.png"
    ),
    Item(
        name = "Basic Hoodie",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Basic_Hoodie.png"
    ),
    Item(
        name = "Basic Long-Sleeved Gown",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a4/Basic_Long-Sleeved_Gown.png"
    ),
    Item(
        name = "Basic Tank Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/Basic_Tank_Top.png"
    ),
    Item(
        name = "Headscarf",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/65/Headscarf.png"
    ),
    Item(
        name = "Plain White T-Shirt",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ef/Plain_White_T-Shirt.png"
    ),
    Item(
        name = "Turban",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a1/Turban.png"
    ),
    Item(
        name = "White Mickey Ears",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/92/White_Mickey_Ears.png"
    ),
    Item(
        name = "Basic Dresser",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/Basic_Dresser.png"
    ),
    Item(
        name = "Berry Bowl",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Berry_Bowl.png"
    ),
    Item(
        name = "Blue Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/79/Blue_Dining_Chair.png"
    ),
    Item(
        name = "Cactus on a Pedestal",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6b/Cactus_on_a_Pedestal.png"
    ),
    Item(
        name = "Corner Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3b/Corner_Counter.png"
    ),
    Item(
        name = "Cozy Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/16/Cozy_Armchair.png"
    ),
    Item(
        name = "Cozy Fireplace",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/83/Cozy_Fireplace.png"
    ),
    Item(
        name = "Cute Bow Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/Cute_Bow_Bed.png"
    ),
    Item(
        name = "Cute Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Cute_Window.png"
    ),
    Item(
        name = "Dartboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/12/Dartboard.png"
    ),
    Item(
        name = "Enchanted Broom",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3c/Enchanted_Broom.png"
    ),
    Item(
        name = "Enchanting Fountain",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/Enchanting_Fountain.png"
    ),
    Item(
        name = "Festive Garland",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dd/Festive_Garland.png"
    ),
    Item(
        name = "Festive Wreath Post",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/86/Festive_Wreath_Post.png"
    ),
    Item(
        name = "Grand Tree of Holiday Cheer",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/50/Grand_Tree_of_Holiday_Cheer.png"
    ),
    Item(
        name = "Light Wood Vintage Chest",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/69/Light_Wood_Vintage_Chest.png"
    ),
    Item(
        name = "Mickey Mouse Ceiling Light",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/29/Mickey_Mouse_Ceiling_Light.png"
    ),
    Item(
        name = "Mickey Mouse Jack-O'-Lantern",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Mickey_Mouse_Jack-O%27-Lantern.png"
    ),
    Item(
        name = "Mickey Mouse Painting",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/74/Mickey_Mouse_Painting.png"
    ),
    Item(
        name = "Mickey Mouse Photo in Small Frame",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/Mickey_Mouse_Photo_in_Small_Frame.png"
    ),
    Item(
        name = "Mickey Mouse Wall Clock",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/36/Mickey_Mouse_Wall_Clock.png"
    ),
    Item(
        name = "Mickey Mouse's Gloves Wardrobe",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/45/Mickey_Mouse%27s_Gloves_Wardrobe.png"
    ),
    Item(
        name = "Mickey Mouse's Rounded Photo Frame",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ad/Mickey_Mouse%27s_Rounded_Photo_Frame.png"
    ),
    Item(
        name = "Painted Vase",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fe/Painted_Vase.png"
    ),
    Item(
        name = "Purple Oval Rug",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/17/Purple_Oval_Rug.png"
    ),
    Item(
        name = "Quirky Table Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f3/Quirky_Table_Lamp.png"
    ),
    Item(
        name = "Rectangular Frame",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b4/Rectangular_Frame.png"
    ),
    Item(
        name = "Round Rug",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Round_Rug.png"
    ),
    Item(
        name = "Rounded Frame",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7d/Rounded_Frame.png"
    ),
    Item(
        name = "Scrooge McDuck Wall Sign",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/54/Scrooge_McDuck_Wall_Sign.png"
    ),
    Item(
        name = "Silly Area Rug",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/42/Silly_Area_Rug.png"
    ),
    Item(
        name = "Simple Fridge",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/55/Simple_Fridge.png"
    ),
    Item(
        name = "Small Bedside Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/17/Small_Bedside_Lamp.png"
    ),
    Item(
        name = "Snowy Festive Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0d/Snowy_Festive_Window.png"
    ),
    Item(
        name = "Sweet Abstract Painting",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Sweet_Abstract_Painting.png"
    ),
    Item(
        name = "Tea Kettle",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Tea_Kettle.png"
    ),
    Item(
        name = "Top Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Top_Cupboard.png"
    ),
    Item(
        name = "Vintage Phone",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c2/Vintage_Phone.png"
    ),
    Item(
        name = "Wooden Bookshelf",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2f/Wooden_Bookshelf.png"
    ),
    Item(
        name = "Wooden Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e9/Wooden_Side_Table.png"
    ),
    Item(
        name = "Big Pile of Books [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/00/Big_Pile_of_Books.png"
    ),
    Item(
        name = "Book Piles [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2f/Book_Piles.png"
    ),
    Item(
        name = "Melted Candles",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/34/Melted_Candles.png"
    ),
    Item(
        name = "Old Armchair [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a5/Old_Armchair.png"
    ),
    Item(
        name = "Ornate Curtain",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/Ornate_Curtain.png"
    ),
    Item(
        name = "Potion Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/32/Potion_Cupboard.png"
    ),
    Item(
        name = "Small Book Pile",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/26/Small_Book_Pile.png"
    ),
    Item(
        name = "Access Door",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/34/Access_Door.png"
    ),
    Item(
        name = "Bike Seat Stool",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/40/Bike_Seat_Stool.png"
    ),
    Item(
        name = "Clamped Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/Clamped_Side_Table.png"
    ),
    Item(
        name = "Hanging Pans",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f3/Hanging_Pans.png"
    ),
    Item(
        name = "Hovercouch",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/52/Hovercouch.png"
    ),
    Item(
        name = "Industrial Ceiling Lights",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4b/Industrial_Ceiling_Lights.png"
    ),
    Item(
        name = "Large Cooler",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/10/Large_Cooler.png"
    ),
    Item(
        name = "Lido Deck Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Lido_Deck_Table.png"
    ),
    Item(
        name = "Meal in a Cup",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Meal_in_a_Cup.png"
    ),
    Item(
        name = "Rusted Bench",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/Rusted_Bench.png"
    ),
    Item(
        name = "Spacecraft Porthole",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ea/Spacecraft_Porthole.png"
    ),
    Item(
        name = "Steward Bot",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/Steward_Bot.png"
    ),
    Item(
        name = "Tractor Island",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/39/Tractor_Island.png"
    ),
    Item(
        name = "Valise Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/93/Valise_Chair.png"
    ),
    Item(
        name = "Weather Panel",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e9/Weather_Panel.png"
    ),
    Item(
        name = "Wood Plank Seat",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Wood_Plank_Seat.png"
    ),
    Item(
        name = "Yellow Bike",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/84/Yellow_Bike.png"
    ),
    Item(
        name = "Beadlet Anemones",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/01/Beadlet_Anemones.png"
    ),
    Item(
        name = "Canopied Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a9/Canopied_Couch.png"
    ),
    Item(
        name = "Coconut Beverage",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f0/Coconut_Beverage.png"
    ),
    Item(
        name = "Conch Shell",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Conch_Shell.png"
    ),
    Item(
        name = "Coral, Shells and Rock Pillar",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Coral%2C_Shells_and_Rock_Pillar.png"
    ),
    Item(
        name = "Engraved Stone Partition",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Engraved_Stone_Partition.png"
    ),
    Item(
        name = "Giant Clam",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a4/Giant_Clam.png"
    ),
    Item(
        name = "Hanging Wicker Light",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Hanging_Wicker_Light.png"
    ),
    Item(
        name = "Island Drawings",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Island_Drawings.png"
    ),
    Item(
        name = "Medium Fern Coral",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Medium_Fern_Coral.png"
    ),
    Item(
        name = "Ornamental Palm Fronds",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0c/Ornamental_Palm_Fronds.png"
    ),
    Item(
        name = "Sea Snail Shell",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6b/Sea_Snail_Shell.png"
    ),
    Item(
        name = "Stone Sink",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5f/Stone_Sink.png"
    ),
    Item(
        name = "Te Kā Tapestry",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6e/Te_K%C4%81_Tapestry.png"
    ),
    Item(
        name = "Tropical Fruit Bowl",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6c/Tropical_Fruit_Bowl.png"
    ),
    Item(
        name = "Wicker Bar Stool",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f6/Wicker_Bar_Stool.png"
    ),
    Item(
        name = "Cheese Poster",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Cheese_Poster.png"
    ),
    Item(
        name = "Cushioned Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/86/Cushioned_Dining_Chair.png"
    ),
    Item(
        name = "Fruits Poster",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/Fruits_Poster.png"
    ),
    Item(
        name = "Hot Plate",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Hot_Plate.png"
    ),
    Item(
        name = "Large Pot",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/74/Large_Pot.png"
    ),
    Item(
        name = "Minimalistic Ceiling Lights",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6a/Minimalistic_Ceiling_Lights.png"
    ),
    Item(
        name = "Oval Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/af/Oval_Window.png"
    ),
    Item(
        name = "Pan Hanger",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/93/Pan_Hanger.png"
    ),
    Item(
        name = "Radiator",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c2/Radiator.png"
    ),
    Item(
        name = "Restaurant Furniture Kit [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Restaurant_Furniture_Kit.png"
    ),
    Item(
        name = "Rotary Phone",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/97/Rotary_Phone.png"
    ),
    Item(
        name = "Simple Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9d/Simple_Lamp.png"
    ),
    Item(
        name = "Sink and Mirror",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Sink_and_Mirror.png"
    ),
    Item(
        name = "Small Round Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Small_Round_Dining_Table.png"
    ),
    Item(
        name = "Tiled-Top Corner Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/Tiled-Top_Corner_Counter.png"
    ),
    Item(
        name = "Tiled-Top Cubby Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3d/Tiled-Top_Cubby_Counter.png"
    ),
    Item(
        name = "Black and Gold Angelic Harp",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/Black_and_Gold_Angelic_Harp.png"
    ),
    Item(
        name = "Bronze and Gold Angelic Harp",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/70/Bronze_and_Gold_Angelic_Harp.png"
    ),
    Item(
        name = "Cushioned Seat",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Cushioned_Seat.png"
    ),
    Item(
        name = "Elegant Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fa/Elegant_Armchair.png"
    ),
    Item(
        name = "Engraved Round Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c4/Engraved_Round_Table.png"
    ),
    Item(
        name = "Gaston's Antler Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Gaston%27s_Antler_Chair.png"
    ),
    Item(
        name = "Golden Vanity",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/16/Golden_Vanity.png"
    ),
    Item(
        name = "Green and Bronze Angelic Harp",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/50/Green_and_Bronze_Angelic_Harp.png"
    ),
    Item(
        name = "Lion Statue",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Lion_Statue.png"
    ),
    Item(
        name = "Mahogany Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9c/Mahogany_Table.png"
    ),
    Item(
        name = "Painting Arrangement",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b5/Painting_Arrangement.png"
    ),
    Item(
        name = "Quill and Ink",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/76/Quill_and_Ink.png"
    ),
    Item(
        name = "Romantic Painting",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/78/Romantic_Painting.png"
    ),
    Item(
        name = "Rose Four-Poster Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/40/Rose_Four-Poster_Bed.png"
    ),
    Item(
        name = "Scenic Painting",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d6/Scenic_Painting.png"
    ),
    Item(
        name = "Stained Glass Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/78/Stained_Glass_Window.png"
    ),
    Item(
        name = "Tea Trolley",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0f/Tea_Trolley.png"
    ),
    Item(
        name = "Topiary Square",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a2/Topiary_Square.png"
    ),
    Item(
        name = "Velvet Ottoman",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Velvet_Ottoman.png"
    ),
    Item(
        name = "White and Gold Angelic Harp",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/White_and_Gold_Angelic_Harp.png"
    ),
    Item(
        name = "Writing Desk",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5d/Writing_Desk.png"
    ),
    Item(
        name = "Abstract Neon Signs",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4e/Abstract_Neon_Signs.png"
    ),
    Item(
        name = "Air Hockey Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Air_Hockey_Table.png"
    ),
    Item(
        name = "Bamboo Shoots",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cc/Bamboo_Shoots.png"
    ),
    Item(
        name = "Coin-op Game",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/02/Coin-op_Game.png"
    ),
    Item(
        name = "Curvy Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Curvy_Couch.png"
    ),
    Item(
        name = "Donut Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Donut_Chair.png"
    ),
    Item(
        name = "Exec Desk",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e2/Exec_Desk.png"
    ),
    Item(
        name = "Food Stall Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0c/Food_Stall_Counter.png"
    ),
    Item(
        name = "Game Machine",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fa/Game_Machine.png"
    ),
    Item(
        name = "Geometric Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/Geometric_Coffee_Table.png"
    ),
    Item(
        name = "Holographic Bar Stool",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cf/Holographic_Bar_Stool.png"
    ),
    Item(
        name = "L-Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c5/L-Counter.png"
    ),
    Item(
        name = "Nightlight",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/71/Nightlight.png"
    ),
    Item(
        name = "Octagonal Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/60/Octagonal_Side_Table.png"
    ),
    Item(
        name = "Pixelated Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/88/Pixelated_Window.png"
    ),
    Item(
        name = "Sugar Rush Plushie Shelf",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5a/Sugar_Rush_Plushie_Shelf.png"
    ),
    Item(
        name = "Virtual Desktop",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cf/Virtual_Desktop.png"
    ),
    Item(
        name = "Azure and Gold Arched Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Azure_and_Gold_Arched_Window.png"
    ),
    Item(
        name = "Bookcase",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/52/Bookcase.png"
    ),
    Item(
        name = "Castle Painting",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/Castle_Painting.png"
    ),
    Item(
        name = "Enchanting Nightstand",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5f/Enchanting_Nightstand.png"
    ),
    Item(
        name = "Glass Slipper Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/22/Glass_Slipper_Bed.png"
    ),
    Item(
        name = "Magnificent Chandelier",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Magnificent_Chandelier.png"
    ),
    Item(
        name = "Marble Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5b/Marble_Coffee_Table.png"
    ),
    Item(
        name = "Marble Fireplace",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/12/Marble_Fireplace.png"
    ),
    Item(
        name = "Mice Vanity",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Mice_Vanity.png"
    ),
    Item(
        name = "On-the-Dot Clock",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3c/On-the-Dot_Clock.png"
    ),
    Item(
        name = "Pearly Grand Piano",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/86/Pearly_Grand_Piano.png"
    ),
    Item(
        name = "Pumpkin Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Pumpkin_Lamp.png"
    ),
    Item(
        name = "Regal Desk",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Regal_Desk.png"
    ),
    Item(
        name = "Royal Banner",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/Royal_Banner.png"
    ),
    Item(
        name = "Royal Piano Bench",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8e/Royal_Piano_Bench.png"
    ),
    Item(
        name = "Sewing Machine",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/Sewing_Machine.png"
    ),
    Item(
        name = "Throne",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/35/Throne.png"
    ),
    Item(
        name = "Tufted Chaise",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ce/Tufted_Chaise.png"
    ),
    Item(
        name = "Velvet Carpet",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/01/Velvet_Carpet.png"
    ),
    Item(
        name = "Carved Wood Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d6/Carved_Wood_Bed.png"
    ),
    Item(
        name = "Carved Wood Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3e/Carved_Wood_Table.png"
    ),
    Item(
        name = "Carved Wooden Sofa",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d9/Carved_Wooden_Sofa.png"
    ),
    Item(
        name = "Cub-Emblazoned Dresser",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/32/Cub-Emblazoned_Dresser.png"
    ),
    Item(
        name = "Floral Mirror",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/47/Floral_Mirror.png"
    ),
    Item(
        name = "Leaf Pile Rug",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/56/Leaf_Pile_Rug.png"
    ),
    Item(
        name = "Nightstand",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/93/Nightstand.png"
    ),
    Item(
        name = "Rafiki's Bowl",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e3/Rafiki%27s_Bowl.png"
    ),
    Item(
        name = "Trunk Column",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/Trunk_Column.png"
    ),
    Item(
        name = "Volcanic Stove",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2b/Volcanic_Stove.png"
    ),
    Item(
        name = "Watering Hole",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9c/Watering_Hole.png"
    ),
    Item(
        name = "Aquarium",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/Aquarium.png"
    ),
    Item(
        name = "Blue Pearly Table Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Blue_Pearly_Table_Lamp.png"
    ),
    Item(
        name = "Bubble Lights",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/aa/Bubble_Lights.png"
    ),
    Item(
        name = "Coral Jewelry Stand",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6e/Coral_Jewelry_Stand.png"
    ),
    Item(
        name = "Eric's Miniature Boat",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Eric%27s_Miniature_Boat.png"
    ),
    Item(
        name = "Lagoon Mirror",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c0/Lagoon_Mirror.png"
    ),
    Item(
        name = "Maelstrom Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Maelstrom_Armchair.png"
    ),
    Item(
        name = "Nautilus Bedside Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/26/Nautilus_Bedside_Lamp.png"
    ),
    Item(
        name = "Octopus Carpet",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fe/Octopus_Carpet.png"
    ),
    Item(
        name = "Ornamental Kelp",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Ornamental_Kelp.png"
    ),
    Item(
        name = "Poor Unfortunate Bookcase",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/Poor_Unfortunate_Bookcase.png"
    ),
    Item(
        name = "Prince Eric Statue [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7b/Prince_Eric_Statue.png"
    ),
    Item(
        name = "Queen of the Sea Mirror",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/98/Queen_of_the_Sea_Mirror.png"
    ),
    Item(
        name = "Scallop Stool",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/81/Scallop_Stool.png"
    ),
    Item(
        name = "Seashell Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/64/Seashell_Bed.png"
    ),
    Item(
        name = "Shell Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d9/Shell_Chair.png"
    ),
    Item(
        name = "Starfish Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d7/Starfish_Coffee_Table.png"
    ),
    Item(
        name = "Tentacle Pattern Floor Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/06/Tentacle_Pattern_Floor_Lamp.png"
    ),
    Item(
        name = "Undersea Seat",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Undersea_Seat.png"
    ),
    Item(
        name = "Ursula's Vanity",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/af/Ursula%27s_Vanity.png"
    ),
    Item(
        name = "Spring Reborn\" Vertical Tapestry",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3e/%22Spring_Reborn%22_Vertical_Tapestry.png"
    ),
    Item(
        name = "Anna's Picnic Set",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/76/Anna%27s_Picnic_Set.png"
    ),
    Item(
        name = "Birch L-shaped Bench",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a8/Birch_L-shaped_Bench.png"
    ),
    Item(
        name = "Birch Tub",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/48/Birch_Tub.png"
    ),
    Item(
        name = "Blue Robe Hanger",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Blue_Robe_Hanger.png"
    ),
    Item(
        name = "Candle",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/30/Candle.png"
    ),
    Item(
        name = "Chilled Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/97/Chilled_Chair.png"
    ),
    Item(
        name = "Frost Chandelier",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/73/Frost_Chandelier.png"
    ),
    Item(
        name = "Gallant Painting",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Gallant_Painting.png"
    ),
    Item(
        name = "Grandfather Clock",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/34/Grandfather_Clock.png"
    ),
    Item(
        name = "Hot Cocoa Stand",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/01/Hot_Cocoa_Stand.png"
    ),
    Item(
        name = "Ice Glazed Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0d/Ice_Glazed_Couch.png"
    ),
    Item(
        name = "Icicle Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Icicle_Dining_Table.png"
    ),
    Item(
        name = "Icy Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b4/Icy_Window.png"
    ),
    Item(
        name = "Library Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/64/Library_Side_Table.png"
    ),
    Item(
        name = "Miniature Snow Castle",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/70/Miniature_Snow_Castle.png"
    ),
    Item(
        name = "Norwegian Spruce Robe Hanger",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/41/Norwegian_Spruce_Robe_Hanger.png"
    ),
    Item(
        name = "Norwegian Spruce Toiletry Basket",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Norwegian_Spruce_Toiletry_Basket.png"
    ),
    Item(
        name = "Norwegian Spruce Water Bucket",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Norwegian_Spruce_Water_Bucket.png"
    ),
    Item(
        name = "Ornate Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d3/Ornate_Dining_Chair.png"
    ),
    Item(
        name = "Pillar",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Pillar.png"
    ),
    Item(
        name = "Royal Bookshelf with Greenery",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/75/Royal_Bookshelf_with_Greenery.png"
    ),
    Item(
        name = "Swing Painting",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/da/Swing_Painting.png"
    ),
    Item(
        name = "Vintage Phonograph",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/Vintage_Phonograph.png"
    ),
    Item(
        name = "Yule Goat",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3b/Yule_Goat.png"
    ),
    Item(
        name = "Bear Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/aa/Bear_Armchair.png"
    ),
    Item(
        name = "Day & Night Paintings",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Day_%26_Night_Paintings.png"
    ),
    Item(
        name = "Guitar",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3f/Guitar.png"
    ),
    Item(
        name = "Homey Rug",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3b/Homey_Rug.png"
    ),
    Item(
        name = "Lantern Garland",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Lantern_Garland.png"
    ),
    Item(
        name = "Mother Gothel's Standing Mirror",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Mother_Gothel%27s_Standing_Mirror.png"
    ),
    Item(
        name = "Plain Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4e/Plain_Bed.png"
    ),
    Item(
        name = "Pub Sign",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d5/Pub_Sign.png"
    ),
    Item(
        name = "Simple Stool",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e5/Simple_Stool.png"
    ),
    Item(
        name = "Brainy Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0d/Brainy_Bed.png"
    ),
    Item(
        name = "Desk Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Desk_Chair.png"
    ),
    Item(
        name = "Dorm Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/55/Dorm_Window.png"
    ),
    Item(
        name = "Funky Storage",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Funky_Storage.png"
    ),
    Item(
        name = "Gold Plaque",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/Gold_Plaque.png"
    ),
    Item(
        name = "Industrial Tree Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fb/Industrial_Tree_Lamp.png"
    ),
    Item(
        name = "Little Mikey Plush Toy",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6b/Little_Mikey_Plush_Toy.png"
    ),
    Item(
        name = "Old Bath",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/73/Old_Bath.png"
    ),
    Item(
        name = "Rectangles Mirror",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/66/Rectangles_Mirror.png"
    ),
    Item(
        name = "Spooky Speaker",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Spooky_Speaker.png"
    ),
    Item(
        name = "Studious Bookshelf",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Studious_Bookshelf.png"
    ),
    Item(
        name = "Two-Headed Desk Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1c/Two-Headed_Desk_Lamp.png"
    ),
    Item(
        name = "Vintage Television",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/60/Vintage_Television.png"
    ),
    Item(
        name = "Show Your Strength\" Test",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d2/%22Show_Your_Strength%22_Test.png"
    ),
    Item(
        name = "Arched Window to Deep Space",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/db/Arched_Window_to_Deep_Space.png"
    ),
    Item(
        name = "Chest Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Chest_Coffee_Table.png"
    ),
    Item(
        name = "Cloudy Lamp",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bf/Cloudy_Lamp.png"
    ),
    Item(
        name = "Colorful L Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Colorful_L_Couch.png"
    ),
    Item(
        name = "Graphic Sofa",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4b/Graphic_Sofa.png"
    ),
    Item(
        name = "Half-Arch Window - Right",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/34/Half-Arch_Window_-_Right.png"
    ),
    Item(
        name = "Hydrangea Bundle",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/04/Hydrangea_Bundle.png"
    ),
    Item(
        name = "Photo Booth",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Photo_Booth.png"
    ),
    Item(
        name = "Popcorn Machine",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Popcorn_Machine.png"
    ),
    Item(
        name = "Rocket Painting",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a0/Rocket_Painting.png"
    ),
    Item(
        name = "Stage Curtain - Right",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d5/Stage_Curtain_-_Right.png"
    ),
    Item(
        name = "Starry Stool",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Starry_Stool.png"
    ),
    Item(
        name = "Step-Up Stool",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bc/Step-Up_Stool.png"
    ),
    Item(
        name = "Writer Blocks Column",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/81/Writer_Blocks_Column.png"
    ),
    Item(
        name = "Blue Beach Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6e/Blue_Beach_Chair.png"
    ),
    Item(
        name = "Blue Striped Beach Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d9/Blue_Striped_Beach_Chair.png"
    ),
    Item(
        name = "Colorful Surfboards",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/62/Colorful_Surfboards.png"
    ),
    Item(
        name = "Dark Wood Picnic Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ae/Dark_Wood_Picnic_Table.png"
    ),
    Item(
        name = "Gray Ice Cream Stand",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/19/Gray_Ice_Cream_Stand.png"
    ),
    Item(
        name = "Green Striped Beach Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/Green_Striped_Beach_Chair.png"
    ),
    Item(
        name = "Island Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Island_Coffee_Table.png"
    ),
    Item(
        name = "Laundry Basket",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Laundry_Basket.png"
    ),
    Item(
        name = "Lifeguard Tower - Yellow & Blue Parasol",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/47/Lifeguard_Tower_-_Yellow_%26_Blue_Parasol.png"
    ),
    Item(
        name = "Lightning Strike Wagon",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/51/Lightning_Strike_Wagon.png"
    ),
    Item(
        name = "Palm Trees and Blue Hammock",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5a/Palm_Trees_and_Blue_Hammock.png"
    ),
    Item(
        name = "Pink Ice Cream Stand",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/Pink_Ice_Cream_Stand.png"
    ),
    Item(
        name = "Red Ice Cream Stand",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/35/Red_Ice_Cream_Stand.png"
    ),
    Item(
        name = "Stitch's Little Red Ship",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a7/Stitch%27s_Little_Red_Ship.png"
    ),
    Item(
        name = "Two-Headed Torch",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ec/Two-Headed_Torch.png"
    ),
    Item(
        name = "Washer",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b5/Washer.png"
    ),
    Item(
        name = "White Wood Veggie Stand",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/88/White_Wood_Veggie_Stand.png"
    ),
    Item(
        name = "Wooden Picnic Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e9/Wooden_Picnic_Table.png"
    ),
    Item(
        name = "Yellow Beach Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7a/Yellow_Beach_Chair.png"
    ),
    Item(
        name = "Mr. Incredible Retro Suit Display",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Mr._Incredible_Retro_Suit_Display.png"
    ),
    Item(
        name = "Burro Piñata",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Burro_Pi%C3%B1ata.png"
    ),
    Item(
        name = "Papel Picados",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e7/Papel_Picados.png"
    ),
    Item(
        name = "Piston Cup",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9a/Piston_Cup.png"
    ),
    Item(
        name = "XL-15 Spaceship Model",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/20/XL-15_Spaceship_Model.png"
    ),
    Item(
        name = "Fredricksen Fireplace",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/94/Fredricksen_Fireplace.png"
    ),
    Item(
        name = "Arched Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/18/Arched_Window.png"
    ),
    Item(
        name = "Autumn Wreath",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/Autumn_Wreath.png"
    ),
    Item(
        name = "Beige Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/45/Beige_Single_Bed.png"
    ),
    Item(
        name = "Black Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/88/Black_Armchair.png"
    ),
    Item(
        name = "Black Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/41/Black_Coffee_Table.png"
    ),
    Item(
        name = "Black Corner Counter with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/61/Black_Corner_Counter_with_Black_Marble_Top.png"
    ),
    Item(
        name = "Black Corner Counter with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/Black_Corner_Counter_with_White_Marble_Top.png"
    ),
    Item(
        name = "Black Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8c/Black_Dining_Chair.png"
    ),
    Item(
        name = "Black Double Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c4/Black_Double_Bed.png"
    ),
    Item(
        name = "Black Double-Basin Sink with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/27/Black_Double-Basin_Sink_with_Black_Marble_Top.png"
    ),
    Item(
        name = "Black Double-Door Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7c/Black_Double-Door_Counter.png"
    ),
    Item(
        name = "Black Double-Door Counter with Gray Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/70/Black_Double-Door_Counter_with_Gray_Marble_Top.png"
    ),
    Item(
        name = "Black Double-Door Glass Top Corner Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Black_Double-Door_Glass_Top_Corner_Cupboard.png"
    ),
    Item(
        name = "Black Double-Door Top Corner Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cc/Black_Double-Door_Top_Corner_Cupboard.png"
    ),
    Item(
        name = "Black Double-Door Top Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f8/Black_Double-Door_Top_Cupboard.png"
    ),
    Item(
        name = "Black Double-Drawer Counter with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Black_Double-Drawer_Counter_with_Black_Marble_Top.png"
    ),
    Item(
        name = "Black Double-Drawer Counter with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d6/Black_Double-Drawer_Counter_with_White_Marble_Top.png"
    ),
    Item(
        name = "Black Gothic Rose Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Black_Gothic_Rose_Window.png"
    ),
    Item(
        name = "Black Kitchen Island",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Black_Kitchen_Island.png"
    ),
    Item(
        name = "Black Kitchen Island with Concrete Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c3/Black_Kitchen_Island_with_Concrete_Top.png"
    ),
    Item(
        name = "Black L Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ae/Black_L_Couch.png"
    ),
    Item(
        name = "Black L Kitchen Island with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/75/Black_L_Kitchen_Island_with_Black_Marble_Top.png"
    ),
    Item(
        name = "Black L Kitchen Island with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e2/Black_L_Kitchen_Island_with_White_Marble_Top.png"
    ),
    Item(
        name = "Black Marble Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/15/Black_Marble_Dining_Table.png"
    ),
    Item(
        name = "Black Marble Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7d/Black_Marble_Side_Table.png"
    ),
    Item(
        name = "Black Marble Wardrobe",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a5/Black_Marble_Wardrobe.png"
    ),
    Item(
        name = "Black Modern Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Black_Modern_Armchair.png"
    ),
    Item(
        name = "Black Modern Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/69/Black_Modern_Dining_Chair.png"
    ),
    Item(
        name = "Black Round Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Black_Round_Dining_Table.png"
    ),
    Item(
        name = "Black Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Black_Single_Bed.png"
    ),
    Item(
        name = "Black Single-Basin Sink with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Black_Single-Basin_Sink_with_Black_Marble_Top.png"
    ),
    Item(
        name = "Black Single-Basin Sink with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b7/Black_Single-Basin_Sink_with_White_Marble_Top.png"
    ),
    Item(
        name = "Black Top Corner Piece",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f3/Black_Top_Corner_Piece.png"
    ),
    Item(
        name = "Black Triple-Drawer Counter with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/Black_Triple-Drawer_Counter_with_Black_Marble_Top.png"
    ),
    Item(
        name = "Black Triple-Drawer Counter with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3d/Black_Triple-Drawer_Counter_with_White_Marble_Top.png"
    ),
    Item(
        name = "Black-Base Black Marble Desk",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/23/Black-Base_Black_Marble_Desk.png"
    ),
    Item(
        name = "Blue Corner Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e3/Blue_Corner_Counter.png"
    ),
    Item(
        name = "Blue Double Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/77/Blue_Double_Bed.png"
    ),
    Item(
        name = "Blue Double-Door Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cf/Blue_Double-Door_Counter.png"
    ),
    Item(
        name = "Blue Double-Door Glass Top Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Blue_Double-Door_Glass_Top_Cupboard.png"
    ),
    Item(
        name = "Blue Double-Door Top Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Blue_Double-Door_Top_Cupboard.png"
    ),
    Item(
        name = "Blue Kitchen Island",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/61/Blue_Kitchen_Island.png"
    ),
    Item(
        name = "Blue Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2d/Blue_Single_Bed.png"
    ),
    Item(
        name = "Blue Single-Door Counter - Left Handle",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/60/Blue_Single-Door_Counter_-_Left_Handle.png"
    ),
    Item(
        name = "Blue Single-Door Top Cupboard - Left Handle",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5d/Blue_Single-Door_Top_Cupboard_-_Left_Handle.png"
    ),
    Item(
        name = "Blue Top Corner Piece",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4b/Blue_Top_Corner_Piece.png"
    ),
    Item(
        name = "Blue-Gray Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/Blue-Gray_Armchair.png"
    ),
    Item(
        name = "Bountiful Marigold Basket",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Bountiful_Marigold_Basket.png"
    ),
    Item(
        name = "Celestial Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a6/Celestial_Bed.png"
    ),
    Item(
        name = "Celestial Dresser",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/15/Celestial_Dresser.png"
    ),
    Item(
        name = "Celestial Pennant Light",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Celestial_Pennant_Light.png"
    ),
    Item(
        name = "Celestial Stained Glass Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/53/Celestial_Stained_Glass_Window.png"
    ),
    Item(
        name = "Charter Rug [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c3/Charter_Rug.png"
    ),
    Item(
        name = "Classic Microwave",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9a/Classic_Microwave.png"
    ),
    Item(
        name = "Cobalt Blue Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9f/Cobalt_Blue_Armchair.png"
    ),
    Item(
        name = "Concrete Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/89/Concrete_Side_Table.png"
    ),
    Item(
        name = "Concrete Wardrobe",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/Concrete_Wardrobe.png"
    ),
    Item(
        name = "Coral Pink Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Coral_Pink_Dining_Chair.png"
    ),
    Item(
        name = "Dark Purple Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9a/Dark_Purple_Single_Bed.png"
    ),
    Item(
        name = "Dark Wood Desk",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c3/Dark_Wood_Desk.png"
    ),
    Item(
        name = "Dark Wood Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/78/Dark_Wood_Dining_Table.png"
    ),
    Item(
        name = "Dark Wood Wardrobe",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Dark_Wood_Wardrobe.png"
    ),
    Item(
        name = "Deluxe Gray Fridge",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e8/Deluxe_Gray_Fridge.png"
    ),
    Item(
        name = "Deluxe Pink Fridge",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1d/Deluxe_Pink_Fridge.png"
    ),
    Item(
        name = "Dirty Chandelier",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f0/Dirty_Chandelier.png"
    ),
    Item(
        name = "Dirty Stove",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Dirty_Stove.png"
    ),
    Item(
        name = "Dusky Floral Arrangement",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/51/Dusky_Floral_Arrangement.png"
    ),
    Item(
        name = "Flat Screen TV",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a4/Flat_Screen_TV.png"
    ),
    Item(
        name = "Friendly Jack-O'-Lantern [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/10/Friendly_Jack-O%27-Lantern.png"
    ),
    Item(
        name = "Glass Double Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Glass_Double_Bed.png"
    ),
    Item(
        name = "Glass Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Glass_Single_Bed.png"
    ),
    Item(
        name = "Golden Plant",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d6/Golden_Plant.png"
    ),
    Item(
        name = "Gray Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b4/Gray_Armchair.png"
    ),
    Item(
        name = "Gray Fridge",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/55/Gray_Fridge.png"
    ),
    Item(
        name = "Gray Metallic Dresser",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/37/Gray_Metallic_Dresser.png"
    ),
    Item(
        name = "Green Trick or Treater's Bounty",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Green_Trick_or_Treater%27s_Bounty.png"
    ),
    Item(
        name = "Ground Fountain Tile",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/18/Ground_Fountain_Tile.png"
    ),
    Item(
        name = "Happy Jack-O'-Lantern",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fc/Happy_Jack-O%27-Lantern.png"
    ),
    Item(
        name = "Hewn Oak Trunk Fireplace",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7b/Hewn_Oak_Trunk_Fireplace.png"
    ),
    Item(
        name = "Holiday Feast Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/Holiday_Feast_Chair.png"
    ),
    Item(
        name = "Kinara",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7a/Kinara.png"
    ),
    Item(
        name = "Large Black Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/22/Large_Black_Couch.png"
    ),
    Item(
        name = "Large Black L Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ae/Large_Black_L_Couch.png"
    ),
    Item(
        name = "Large Black Modern Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Large_Black_Modern_Couch.png"
    ),
    Item(
        name = "Large Concrete Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Large_Concrete_Dining_Table.png"
    ),
    Item(
        name = "Large Gift Box",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/86/Large_Gift_Box.png"
    ),
    Item(
        name = "Large Gray Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Large_Gray_Couch.png"
    ),
    Item(
        name = "Large Lavish Black Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1b/Large_Lavish_Black_Couch.png"
    ),
    Item(
        name = "Large Lavish Coral Pink Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b2/Large_Lavish_Coral_Pink_Couch.png"
    ),
    Item(
        name = "Large Lavish Gray Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7b/Large_Lavish_Gray_Couch.png"
    ),
    Item(
        name = "Large Lavish Navy Blue Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Large_Lavish_Navy_Blue_Couch.png"
    ),
    Item(
        name = "Large Lavish Turquoise Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/18/Large_Lavish_Turquoise_Couch.png"
    ),
    Item(
        name = "Large Navy Blue Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/41/Large_Navy_Blue_Couch.png"
    ),
    Item(
        name = "Large Oval Black Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3d/Large_Oval_Black_Dining_Table.png"
    ),
    Item(
        name = "Large Oval Medium Wood Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/29/Large_Oval_Medium_Wood_Dining_Table.png"
    ),
    Item(
        name = "Large Oval Wood Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a5/Large_Oval_Wood_Dining_Table.png"
    ),
    Item(
        name = "Large Red Modern Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fc/Large_Red_Modern_Couch.png"
    ),
    Item(
        name = "Large Tan Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Large_Tan_Couch.png"
    ),
    Item(
        name = "Large Tan Modern Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c4/Large_Tan_Modern_Couch.png"
    ),
    Item(
        name = "Large White Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Large_White_Couch.png"
    ),
    Item(
        name = "Large White L Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d2/Large_White_L_Couch.png"
    ),
    Item(
        name = "Large White Modern Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fc/Large_White_Modern_Couch.png"
    ),
    Item(
        name = "Large Wooden Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Large_Wooden_Dining_Table.png"
    ),
    Item(
        name = "Lavish Black Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1f/Lavish_Black_Dining_Chair.png"
    ),
    Item(
        name = "Lavish Black L Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Lavish_Black_L_Couch.png"
    ),
    Item(
        name = "Lavish Navy Blue L Couch",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ce/Lavish_Navy_Blue_L_Couch.png"
    ),
    Item(
        name = "Light Gray Fridge",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0f/Light_Gray_Fridge.png"
    ),
    Item(
        name = "Memory Frame [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1d/Memory_Frame.png"
    ),
    Item(
        name = "Mischievous Jack-O'-Lantern [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/64/Mischievous_Jack-O%27-Lantern.png"
    ),
    Item(
        name = "Navy Blue Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/db/Navy_Blue_Dining_Chair.png"
    ),
    Item(
        name = "Navy Blue Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/93/Navy_Blue_Single_Bed.png"
    ),
    Item(
        name = "Oak Branch-Woven Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/50/Oak_Branch-Woven_Bed.png"
    ),
    Item(
        name = "Old Fireplace [1]",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/69/Old_Fireplace.png"
    ),
    Item(
        name = "Oval Black Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b2/Oval_Black_Coffee_Table.png"
    ),
    Item(
        name = "Oval Black Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ec/Oval_Black_Dining_Table.png"
    ),
    Item(
        name = "Oval Dark Wood Desk",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/06/Oval_Dark_Wood_Desk.png"
    ),
    Item(
        name = "Oval Pale Wood Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f9/Oval_Pale_Wood_Coffee_Table.png"
    ),
    Item(
        name = "Oval White Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e3/Oval_White_Coffee_Table.png"
    ),
    Item(
        name = "Oval Wooden Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/32/Oval_Wooden_Coffee_Table.png"
    ),
    Item(
        name = "Pale Blue Double Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c0/Pale_Blue_Double_Bed.png"
    ),
    Item(
        name = "Pale Wood Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6e/Pale_Wood_Coffee_Table.png"
    ),
    Item(
        name = "Pale Wood Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8c/Pale_Wood_Dining_Chair.png"
    ),
    Item(
        name = "Pale Wood Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1e/Pale_Wood_Side_Table.png"
    ),
    Item(
        name = "Pampas Grass Jug",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/76/Pampas_Grass_Jug.png"
    ),
    Item(
        name = "Pile of Gifts",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a9/Pile_of_Gifts.png"
    ),
    Item(
        name = "Pink Fridge",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Pink_Fridge.png"
    ),
    Item(
        name = "Playful Pumpkin Scarecrow",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Playful_Pumpkin_Scarecrow.png"
    ),
    Item(
        name = "Purple Chaise and Anchor Pillow",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/70/Purple_Chaise_and_Anchor_Pillow.png"
    ),
    Item(
        name = "Purple-Patterned Cushioned Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/67/Purple-Patterned_Cushioned_Chair.png"
    ),
    Item(
        name = "Red Corner Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ca/Red_Corner_Counter.png"
    ),
    Item(
        name = "Red Double-Door Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/06/Red_Double-Door_Counter.png"
    ),
    Item(
        name = "Red Double-Door Glass Top Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7b/Red_Double-Door_Glass_Top_Cupboard.png"
    ),
    Item(
        name = "Red Double-Door Top Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c6/Red_Double-Door_Top_Cupboard.png"
    ),
    Item(
        name = "Red Modern Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/84/Red_Modern_Armchair.png"
    ),
    Item(
        name = "Red Single-Basin Sink",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f7/Red_Single-Basin_Sink.png"
    ),
    Item(
        name = "Red Single-Door Counter - Right Handle",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Red_Single-Door_Counter_-_Right_Handle.png"
    ),
    Item(
        name = "Red Single-Door Top Cupboard - Right Handle",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4b/Red_Single-Door_Top_Cupboard_-_Right_Handle.png"
    ),
    Item(
        name = "Roughly Boarded Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ee/Roughly_Boarded_Window.png"
    ),
    Item(
        name = "Round Black Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f3/Round_Black_Side_Table.png"
    ),
    Item(
        name = "Round Festive Fir Carpet",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ef/Round_Festive_Fir_Carpet.png"
    ),
    Item(
        name = "Round Pale Wood Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/75/Round_Pale_Wood_Side_Table.png"
    ),
    Item(
        name = "Round Wintery Mickey Rug",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Round_Wintery_Mickey_Rug.png"
    ),
    Item(
        name = "Round Wooden Side Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d2/Round_Wooden_Side_Table.png"
    ),
    Item(
        name = "Rounded Dark Wood Wardrobe",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/12/Rounded_Dark_Wood_Wardrobe.png"
    ),
    Item(
        name = "Rounded White Wardrobe",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/94/Rounded_White_Wardrobe.png"
    ),
    Item(
        name = "Ruined Landscape Frame",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Ruined_Landscape_Frame.png"
    ),
    Item(
        name = "Scarlet Chaise and Anchor Pillow",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Scarlet_Chaise_and_Anchor_Pillow.png"
    ),
    Item(
        name = "Seaweed Chaise and Anchor Pillow",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/85/Seaweed_Chaise_and_Anchor_Pillow.png"
    ),
    Item(
        name = "Ship in a Bottle",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fd/Ship_in_a_Bottle.png"
    ),
    Item(
        name = "Silver Shelf of Assorted Potions",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/53/Silver_Shelf_of_Assorted_Potions.png"
    ),
    Item(
        name = "Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/25/Single_Bed.png"
    ),
    Item(
        name = "Sleek Microwave",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/Sleek_Microwave.png"
    ),
    Item(
        name = "Small Fancy Gift Box",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1e/Small_Fancy_Gift_Box.png"
    ),
    Item(
        name = "Small Round Gift Box",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fa/Small_Round_Gift_Box.png"
    ),
    Item(
        name = "Small Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3b/Small_Window.png"
    ),
    Item(
        name = "Square Black Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c9/Square_Black_Dining_Table.png"
    ),
    Item(
        name = "Square Pale Wood Dining Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1b/Square_Pale_Wood_Dining_Table.png"
    ),
    Item(
        name = "Stained-Glass Boat Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/Stained-Glass_Boat_Window.png"
    ),
    Item(
        name = "Tan Modern Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/Tan_Modern_Armchair.png"
    ),
    Item(
        name = "Thorny Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1d/Thorny_Bed.png"
    ),
    Item(
        name = "Thorny Fireplace",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/07/Thorny_Fireplace.png"
    ),
    Item(
        name = "Thorny Stained Glass Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Thorny_Stained_Glass_Window.png"
    ),
    Item(
        name = "Turquoise Armchair",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Turquoise_Armchair.png"
    ),
    Item(
        name = "Turquoise Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Turquoise_Single_Bed.png"
    ),
    Item(
        name = "Web-Snared Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/89/Web-Snared_Tree.png"
    ),
    Item(
        name = "White Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/White_Coffee_Table.png"
    ),
    Item(
        name = "White Corner Counter with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/White_Corner_Counter_with_Black_Marble_Top.png"
    ),
    Item(
        name = "White Corner Counter with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/White_Corner_Counter_with_White_Marble_Top.png"
    ),
    Item(
        name = "White Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5e/White_Dining_Chair.png"
    ),
    Item(
        name = "White Double-Basin Sink with Concrete Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ec/White_Double-Basin_Sink_with_Concrete_Top.png"
    ),
    Item(
        name = "White Double-Door Counter with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/White_Double-Door_Counter_with_Black_Marble_Top.png"
    ),
    Item(
        name = "White Double-Door Counter with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/White_Double-Door_Counter_with_White_Marble_Top.png"
    ),
    Item(
        name = "White Double-Door Glass Top Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5f/White_Double-Door_Glass_Top_Cupboard.png"
    ),
    Item(
        name = "White Double-Door Top Corner Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1b/White_Double-Door_Top_Corner_Cupboard.png"
    ),
    Item(
        name = "White Double-Door Top Cupboard",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/White_Double-Door_Top_Cupboard.png"
    ),
    Item(
        name = "White Double-Drawer Counter with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2f/White_Double-Drawer_Counter_with_Black_Marble_Top.png"
    ),
    Item(
        name = "White Double-Drawer Counter with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2a/White_Double-Drawer_Counter_with_White_Marble_Top.png"
    ),
    Item(
        name = "White Gothic Rose Window",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a3/White_Gothic_Rose_Window.png"
    ),
    Item(
        name = "White Kitchen Island with Concrete Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ae/White_Kitchen_Island_with_Concrete_Top.png"
    ),
    Item(
        name = "White L Kitchen Island with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/58/White_L_Kitchen_Island_with_Black_Marble_Top.png"
    ),
    Item(
        name = "White L Kitchen Island with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/af/White_L_Kitchen_Island_with_White_Marble_Top.png"
    ),
    Item(
        name = "White Marble Double Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/White_Marble_Double_Bed.png"
    ),
    Item(
        name = "White Marble Single Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/88/White_Marble_Single_Bed.png"
    ),
    Item(
        name = "White Metallic Dresser",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/White_Metallic_Dresser.png"
    ),
    Item(
        name = "White Modern Dining Chair",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/83/White_Modern_Dining_Chair.png"
    ),
    Item(
        name = "White Single-Basin Sink",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5e/White_Single-Basin_Sink.png"
    ),
    Item(
        name = "White Top Corner Piece",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/White_Top_Corner_Piece.png"
    ),
    Item(
        name = "White Triple-Drawer Counter",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2c/White_Triple-Drawer_Counter.png"
    ),
    Item(
        name = "White Triple-Drawer Counter with Gray Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/02/White_Triple-Drawer_Counter_with_Gray_Marble_Top.png"
    ),
    Item(
        name = "White Wardrobe",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/66/White_Wardrobe.png"
    ),
    Item(
        name = "Winter Carpet",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Winter_Carpet.png"
    ),
    Item(
        name = "Wooden Coffee Table",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/00/Wooden_Coffee_Table.png"
    ),
    Item(
        name = "Wooden Lamppost with Green Light",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fd/Wooden_Lamppost_with_Green_Light.png"
    ),
    Item(
        name = "Yellow Double Bed",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/41/Yellow_Double_Bed.png"
    ),
    Item(
        name = "Magic Mirror Item(On the Wall)",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c6/Magic_Mirror_%28On_the_Wall%29.png"
    ),
    Item(
        name = "Black Single-Door Counter Item(Left Handle) with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a4/Black_Single-Door_Counter_%28Left_Handle%29_with_Black_Marble_Top.png"
    ),
    Item(
        name = "Black Single-Door Counter Item(Left Handle) with Gray Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0d/Black_Single-Door_Counter_%28Left_Handle%29_with_Gray_Marble_Top.png"
    ),
    Item(
        name = "Black Single-Door Counter Item(Left Handle) with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/17/Black_Single-Door_Counter_%28Left_Handle%29_with_White_Marble_Top.png"
    ),
    Item(
        name = "Black Single-Door Counter Item(Right Handle) with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/aa/Black_Single-Door_Counter_%28Right_Handle%29_with_Black_Marble_Top.png"
    ),
    Item(
        name = "Black Single-Door Counter Item(Right Handle) with Gray Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/82/Black_Single-Door_Counter_%28Right_Handle%29_with_Gray_Marble_Top.png"
    ),
    Item(
        name = "Black Single-Door Counter Item(Right Handle) with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Black_Single-Door_Counter_%28Right_Handle%29_with_White_Marble_Top.png"
    ),
    Item(
        name = "White Single-Door Counter Item(Left Handle) with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c9/White_Single-Door_Counter_%28Left_Handle%29_with_Black_Marble_Top.png"
    ),
    Item(
        name = "White Single-Door Counter Item(Left Handle) with Gray Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a3/White_Single-Door_Counter_%28Left_Handle%29_with_Gray_Marble_Top.png"
    ),
    Item(
        name = "White Single-Door Counter Item(Left Handle) with White Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d4/White_Single-Door_Counter_%28Left_Handle%29_with_White_Marble_Top.png"
    ),
    Item(
        name = "White Single-Door Counter Item(Right Handle) with Black Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/39/White_Single-Door_Counter_%28Right_Handle%29_with_Black_Marble_Top.png"
    ),
    Item(
        name = "White Single-Door Counter Item(Right Handle) with Gray Marble Top",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/White_Single-Door_Counter_%28Right_Handle%29_with_Gray_Marble_Top.png"
    ),
    Item(
        name = "Asparagus",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/45/Asparagus.png"
    ),
    Item(
        name = "Bell Pepper",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e2/Bell_Pepper.png"
    ),
    Item(
        name = "Carrot",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c3/Carrot.png"
    ),
    Item(
        name = "Chili Pepper",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ab/Chili_Pepper.png"
    ),
    Item(
        name = "Corn",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f8/Corn.png"
    ),
    Item(
        name = "Cucumber",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/59/Cucumber.png"
    ),
    Item(
        name = "Eggplant",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Eggplant.png"
    ),
    Item(
        name = "Leek",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/Leek.png"
    ),
    Item(
        name = "Lettuce",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/da/Lettuce.png"
    ),
    Item(
        name = "Mushroom",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8c/Mushroom.png"
    ),
    Item(
        name = "Okra",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e7/Okra.png"
    ),
    Item(
        name = "Onion",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/51/Onion.png"
    ),
    Item(
        name = "Potato",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c2/Potato.png"
    ),
    Item(
        name = "Pumpkin",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/64/Pumpkin.png"
    ),
    Item(
        name = "Spinach",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/60/Spinach.png"
    ),
    Item(
        name = "Tomato",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9d/Tomato.png"
    ),
    Item(
        name = "Zucchini",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f6/Zucchini.png"
    ),
    Item(
        name = "Apple",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7d/Apple.png"
    ),
    Item(
        name = "Banana",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/69/Banana.png"
    ),
    Item(
        name = "Blueberry",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Blueberry.png"
    ),
    Item(
        name = "Cherry",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/20/Cherry.png"
    ),
    Item(
        name = "Coffee Bean",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Coffee_Bean.png"
    ),
    Item(
        name = "Coconut",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2f/Coconut.png"
    ),
    Item(
        name = "Gooseberry",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d2/Gooseberry.png"
    ),
    Item(
        name = "Lemon",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/35/Lemon.png"
    ),
    Item(
        name = "Raspberry",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1f/Raspberry.png"
    ),
    Item(
        name = "Rice",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/da/Rice.png"
    ),
    Item(
        name = "Wheat",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e2/Wheat.png"
    ),
    Item(
        name = "Butter",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Butter.png"
    ),
    Item(
        name = "Canola",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/79/Canola.png"
    ),
    Item(
        name = "Cheese",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a5/Cheese.png"
    ),
    Item(
        name = "Egg",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/26/Egg.png"
    ),
    Item(
        name = "Milk",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/92/Milk.png"
    ),
    Item(
        name = "Peanut",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f6/Peanut.png"
    ),
    Item(
        name = "Soya",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/00/Soya.png"
    ),
    Item(
        name = "Basil",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6e/Basil.png"
    ),
    Item(
        name = "Garlic",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cc/Garlic.png"
    ),
    Item(
        name = "Ginger",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/85/Ginger.png"
    ),
    Item(
        name = "Mint",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Mint.png"
    ),
    Item(
        name = "Oregano",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e3/Oregano.png"
    ),
    Item(
        name = "Cocoa Bean",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Cocoa_Bean.png"
    ),
    Item(
        name = "Sugarcane",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/03/Sugarcane.png"
    ),
    Item(
        name = "Vanilla",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d5/Vanilla.png"
    ),
    Item(
        name = "Slush Ice",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c0/Slush_Ice.png"
    ),
    Item(
        name = "Clam",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ed/Clam.png"
    ),
    Item(
        name = "Oyster",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/54/Oyster.png"
    ),
    Item(
        name = "Scallop",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cf/Scallop.png"
    ),
    Item(
        name = "Arendellian Pickled Herring",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c5/Arendellian_Pickled_Herring.png"
    ),
    Item(
        name = "Bell Pepper Puffs",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Bell_Pepper_Puffs.png"
    ),
    Item(
        name = "Cheese Platter",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Cheese_Platter.png"
    ),
    Item(
        name = "Chili Pepper Puffs",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b5/Chili_Pepper_Puffs.png"
    ),
    Item(
        name = "Coffee",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e9/Coffee.png"
    ),
    Item(
        name = "Crackers",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d4/Crackers.png"
    ),
    Item(
        name = "Creamy Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/51/Creamy_Soup.png"
    ),
    Item(
        name = "Crudités",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/26/Crudit%C3%A9s.png"
    ),
    Item(
        name = "Eggplant Puffs",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/Eggplant_Puffs.png"
    ),
    Item(
        name = "French Fries",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8e/French_Fries.png"
    ),
    Item(
        name = "Gazpacho",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0f/Gazpacho.png"
    ),
    Item(
        name = "Green Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7a/Green_Salad.png"
    ),
    Item(
        name = "Grilled Vegetables",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cc/Grilled_Vegetables.png"
    ),
    Item(
        name = "Grilled Veggie Platter",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/92/Grilled_Veggie_Platter.png"
    ),
    Item(
        name = "Hard-Boiled Eggs",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2b/Hard-Boiled_Eggs.png"
    ),
    Item(
        name = "Large Seafood Platter",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Large_Seafood_Platter.png"
    ),
    Item(
        name = "Latte",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2c/Latte.png"
    ),
    Item(
        name = "Marinated Herring",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/67/Marinated_Herring.png"
    ),
    Item(
        name = "Mocha",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/48/Mocha.png"
    ),
    Item(
        name = "Okra Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Okra_Soup.png"
    ),
    Item(
        name = "Onion Puffs",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/66/Onion_Puffs.png"
    ),
    Item(
        name = "Oyster Platter",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/Oyster_Platter.png"
    ),
    Item(
        name = "Pickled Herring",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/84/Pickled_Herring.png"
    ),
    Item(
        name = "Potato Leek Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fe/Potato_Leek_Soup.png"
    ),
    Item(
        name = "Potato Puffs",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Potato_Puffs.png"
    ),
    Item(
        name = "Pottage",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/65/Pottage.png"
    ),
    Item(
        name = "Pumpkin Puffs",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Pumpkin_Puffs.png"
    ),
    Item(
        name = "Pumpkin Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/59/Pumpkin_Soup.png"
    ),
    Item(
        name = "Purée",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/de/Pur%C3%A9e.png"
    ),
    Item(
        name = "Roasted Asparagus",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/17/Roasted_Asparagus.png"
    ),
    Item(
        name = "Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7e/Salad.png"
    ),
    Item(
        name = "Sautéed Mushrooms",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ab/Saut%C3%A9ed_Mushrooms.png"
    ),
    Item(
        name = "Seafood Appetizer",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f0/Seafood_Appetizer.png"
    ),
    Item(
        name = "Seafood Platter",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/48/Seafood_Platter.png"
    ),
    Item(
        name = "Soufflé",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/Souffl%C3%A9.png"
    ),
    Item(
        name = "Tomato Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/Tomato_Soup.png"
    ),
    Item(
        name = "Vegetable Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cd/Vegetable_Soup.png"
    ),
    Item(
        name = "Zucchini Puffs",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/61/Zucchini_Puffs.png"
    ),
    Item(
        name = "Apple-Cider-Glazed Salmon",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3b/Apple-Cider-Glazed_Salmon.png"
    ),
    Item(
        name = "Baked Carp",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/34/Baked_Carp.png"
    ),
    Item(
        name = "Basil Omelet",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Basil_Omelet.png"
    ),
    Item(
        name = "Bouillabaisse",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9d/Bouillabaisse.png"
    ),
    Item(
        name = "Carp Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a1/Carp_Salad.png"
    ),
    Item(
        name = "Cheesy Crispy Baked Cod",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/63/Cheesy_Crispy_Baked_Cod.png"
    ),
    Item(
        name = "Chowder",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/95/Chowder.png"
    ),
    Item(
        name = "Creamy Garlic Scallops",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/16/Creamy_Garlic_Scallops.png"
    ),
    Item(
        name = "Crispy Baked Cod",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1d/Crispy_Baked_Cod.png"
    ),
    Item(
        name = "Fish Creole",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cc/Fish_Creole.png"
    ),
    Item(
        name = "Fish 'n' Chips",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4f/Fish_%27n%27_Chips.png"
    ),
    Item(
        name = "Fish Pasta",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/08/Fish_Pasta.png"
    ),
    Item(
        name = "Fish Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ec/Fish_Pie.png"
    ),
    Item(
        name = "Fish Risotto",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2b/Fish_Risotto.png"
    ),
    Item(
        name = "Fish Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8e/Fish_Salad.png"
    ),
    Item(
        name = "Fish Sandwiches",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/53/Fish_Sandwiches.png"
    ),
    Item(
        name = "Fish Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/be/Fish_Soup.png"
    ),
    Item(
        name = "Fish Steak",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a1/Fish_Steak.png"
    ),
    Item(
        name = "Fish Tacos",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/af/Fish_Tacos.png"
    ),
    Item(
        name = "Fugu Sushi",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Fugu_Sushi.png"
    ),
    Item(
        name = "Greek Pizza",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Greek_Pizza.png"
    ),
    Item(
        name = "Grilled Fish",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dd/Grilled_Fish.png"
    ),
    Item(
        name = "Grilled Fish Entree",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a5/Grilled_Fish_Entree.png"
    ),
    Item(
        name = "Gumbo",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/10/Gumbo.png"
    ),
    Item(
        name = "Hearty Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1a/Hearty_Salad.png"
    ),
    Item(
        name = "Hors d'Oeuvres",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/92/Hors_d%27Oeuvres.png"
    ),
    Item(
        name = "Kappa Maki",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/29/Kappa_Maki.png"
    ),
    Item(
        name = "Kronk's Spinach Puffs",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Kronk%27s_Spinach_Puffs.png"
    ),
    Item(
        name = "Lancetfish Paella",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/80/Lancetfish_Paella.png"
    ),
    Item(
        name = "Leek Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/39/Leek_Soup.png"
    ),
    Item(
        name = "Lemon Garlic Swordfish",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Lemon_Garlic_Swordfish.png"
    ),
    Item(
        name = "Lobster Roll",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/63/Lobster_Roll.png"
    ),
    Item(
        name = "Maguro Sushi",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2f/Maguro_Sushi.png"
    ),
    Item(
        name = "Maki",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Maki.png"
    ),
    Item(
        name = "Margherita Pizza",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1b/Margherita_Pizza.png"
    ),
    Item(
        name = "Mediterranean Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/73/Mediterranean_Salad.png"
    ),
    Item(
        name = "Mushroom Pizza",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e9/Mushroom_Pizza.png"
    ),
    Item(
        name = "Mushu's Congee",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0d/Mushu%27s_Congee.png"
    ),
    Item(
        name = "Omelet",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/12/Omelet.png"
    ),
    Item(
        name = "Pan-Fried Angler Fish",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/Pan-Fried_Angler_Fish.png"
    ),
    Item(
        name = "Pan-Fried Bass & Vegetables",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Pan-Fried_Bass_%26_Vegetables.png"
    ),
    Item(
        name = "Pan-Fried Tilapia & Vegetables",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/59/Pan-Fried_Tilapia_%26_Vegetables.png"
    ),
    Item(
        name = "Pasta",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d8/Pasta.png"
    ),
    Item(
        name = "Peanut Butter Sandwich",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/af/Peanut_Butter_Sandwich.png"
    ),
    Item(
        name = "Pizza",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f4/Pizza.png"
    ),
    Item(
        name = "Poached Basil-Butter Sturgeon",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Poached_Basil-Butter_Sturgeon.png"
    ),
    Item(
        name = "Porridge",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5d/Porridge.png"
    ),
    Item(
        name = "Porridge with Fruits",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/84/Porridge_with_Fruits.png"
    ),
    Item(
        name = "Ranch Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6c/Ranch_Salad.png"
    ),
    Item(
        name = "Ratatouille",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Ratatouille.png"
    ),
    Item(
        name = "Sake Maki",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1a/Sake_Maki.png"
    ),
    Item(
        name = "Sake Sushi",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f0/Sake_Sushi.png"
    ),
    Item(
        name = "Savory Fish",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0e/Savory_Fish.png"
    ),
    Item(
        name = "Scrambled Egg",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Scrambled_Egg.png"
    ),
    Item(
        name = "Seafood Pasta",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1a/Seafood_Pasta.png"
    ),
    Item(
        name = "Seafood Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/98/Seafood_Pie.png"
    ),
    Item(
        name = "Seafood Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/69/Seafood_Salad.png"
    ),
    Item(
        name = "Seafood Soup",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/Seafood_Soup.png"
    ),
    Item(
        name = "Seared Rainbow Trout",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/20/Seared_Rainbow_Trout.png"
    ),
    Item(
        name = "Simple Fried Perch",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/Simple_Fried_Perch.png"
    ),
    Item(
        name = "Smoked Peanuts and Anglerfish",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e2/Smoked_Peanuts_and_Anglerfish.png"
    ),
    Item(
        name = "Sole Meuniére",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f3/Sole_Meuni%C3%A9re.png"
    ),
    Item(
        name = "Spaghetti Arrabbiata",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4d/Spaghetti_Arrabbiata.png"
    ),
    Item(
        name = "Spicy Baked Bream",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f6/Spicy_Baked_Bream.png"
    ),
    Item(
        name = "Steamed Fugu",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Steamed_Fugu.png"
    ),
    Item(
        name = "Sushi",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6d/Sushi.png"
    ),
    Item(
        name = "Sweet & Sour Kingfish Steak",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bb/Sweet_%26_Sour_Kingfish_Steak.png"
    ),
    Item(
        name = "Tamagoyaki",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/22/Tamagoyaki.png"
    ),
    Item(
        name = "Tasty Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/84/Tasty_Salad.png"
    ),
    Item(
        name = "Tasty Veggies",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/87/Tasty_Veggies.png"
    ),
    Item(
        name = "Tekka Maki",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Tekka_Maki.png"
    ),
    Item(
        name = "Teriyaki Salmon",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/61/Teriyaki_Salmon.png"
    ),
    Item(
        name = "Tuna Burger",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/00/Tuna_Burger.png"
    ),
    Item(
        name = "Vegetarian Pizza",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/83/Vegetarian_Pizza.png"
    ),
    Item(
        name = "Vegetarian Stew",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/36/Vegetarian_Stew.png"
    ),
    Item(
        name = "Vegetarian Taco",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/90/Vegetarian_Taco.png"
    ),
    Item(
        name = "Veggie Casserole",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ad/Veggie_Casserole.png"
    ),
    Item(
        name = "Veggie Pasta",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Veggie_Pasta.png"
    ),
    Item(
        name = "Veggie Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/48/Veggie_Pie.png"
    ),
    Item(
        name = "Veggie Skewers",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/db/Veggie_Skewers.png"
    ),
    Item(
        name = "Walleye en Papillote",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2a/Walleye_en_Papillote.png"
    ),
    Item(
        name = "My Hero\" Cookie",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/05/%22My_Hero%22_Cookie.png"
    ),
    Item(
        name = "Apple Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fb/Apple_Pie.png"
    ),
    Item(
        name = "Apple Sorbet",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5b/Apple_Sorbet.png"
    ),
    Item(
        name = "Aurora's Cake",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f5/Aurora%27s_Cake.png"
    ),
    Item(
        name = "Banana Ice Cream",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/79/Banana_Ice_Cream.png"
    ),
    Item(
        name = "Banana Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/75/Banana_Pie.png"
    ),
    Item(
        name = "Banana Split",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Banana_Split.png"
    ),
    Item(
        name = "Beignets",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4f/Beignets.png"
    ),
    Item(
        name = "Berry Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8d/Berry_Salad.png"
    ),
    Item(
        name = "Birthday Cake",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e3/Birthday_Cake.png"
    ),
    Item(
        name = "Biscuits",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f5/Biscuits.png"
    ),
    Item(
        name = "Blueberry Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/32/Blueberry_Pie.png"
    ),
    Item(
        name = "Boba Tea",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0a/Boba_Tea.png"
    ),
    Item(
        name = "Candy",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1c/Candy.png"
    ),
    Item(
        name = "Caramel Apples",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c6/Caramel_Apples.png"
    ),
    Item(
        name = "Carrot Cake",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dd/Carrot_Cake.png"
    ),
    Item(
        name = "Cheesecake",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2d/Cheesecake.png"
    ),
    Item(
        name = "Cherry Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/70/Cherry_Pie.png"
    ),
    Item(
        name = "Chocolate Chip Cookies",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6f/Chocolate_Chip_Cookies.png"
    ),
    Item(
        name = "Chocolate Ice Cream",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/41/Chocolate_Ice_Cream.png"
    ),
    Item(
        name = "Chocolate Waffles",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4d/Chocolate_Waffles.png"
    ),
    Item(
        name = "Coconut Boba Tea",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/50/Coconut_Boba_Tea.png"
    ),
    Item(
        name = "Coconut Cake",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5c/Coconut_Cake.png"
    ),
    Item(
        name = "Coconut Ice Cream",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d9/Coconut_Ice_Cream.png"
    ),
    Item(
        name = "Crepe",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/62/Crepe.png"
    ),
    Item(
        name = "Fruit Salad",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Fruit_Salad.png"
    ),
    Item(
        name = "Fruit Sorbet",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/Fruit_Sorbet.png"
    ),
    Item(
        name = "Fruitcake",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Fruitcake.png"
    ),
    Item(
        name = "Gingerbread House",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1d/Gingerbread_House.png"
    ),
    Item(
        name = "Gooseberry Boba Tea",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/df/Gooseberry_Boba_Tea.png"
    ),
    Item(
        name = "Gray Stuff",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/17/Gray_Stuff.png"
    ),
    Item(
        name = "Hot Cocoa",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7c/Hot_Cocoa.png"
    ),
    Item(
        name = "Ice Cream",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5d/Ice_Cream.png"
    ),
    Item(
        name = "Jam Waffles",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/53/Jam_Waffles.png"
    ),
    Item(
        name = "Lemon Sorbet",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d8/Lemon_Sorbet.png"
    ),
    Item(
        name = "Meringue Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/54/Meringue_Pie.png"
    ),
    Item(
        name = "Minnie's Gingerbread Cookies",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Minnie%27s_Gingerbread_Cookies.png"
    ),
    Item(
        name = "Mint Boba Tea",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/37/Mint_Boba_Tea.png"
    ),
    Item(
        name = "Mint Candy",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7a/Mint_Candy.png"
    ),
    Item(
        name = "Mint Chocolate",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3f/Mint_Chocolate.png"
    ),
    Item(
        name = "Mint Sorbet",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Mint_Sorbet.png"
    ),
    Item(
        name = "Pastry Cream and Fruits",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ef/Pastry_Cream_and_Fruits.png"
    ),
    Item(
        name = "Pawpsicle",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/de/Pawpsicle.png"
    ),
    Item(
        name = "Peanut Butter Waffles",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/ba/Peanut_Butter_Waffles.png"
    ),
    Item(
        name = "Plain Snow Cones",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/16/Plain_Snow_Cones.png"
    ),
    Item(
        name = "Raspberry Boba Tea",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Raspberry_Boba_Tea.png"
    ),
    Item(
        name = "Red Fruit Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fd/Red_Fruit_Pie.png"
    ),
    Item(
        name = "Red Fruit Sorbet",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/07/Red_Fruit_Sorbet.png"
    ),
    Item(
        name = "Root Beer",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/01/Root_Beer.png"
    ),
    Item(
        name = "Shake",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/71/Shake.png"
    ),
    Item(
        name = "Snow White's Gooseberry Pie",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/10/Snow_White%27s_Gooseberry_Pie.png"
    ),
    Item(
        name = "Sour Snow Cones",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/be/Sour_Snow_Cones.png"
    ),
    Item(
        name = "Sweet Slush",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a4/Sweet_Slush.png"
    ),
    Item(
        name = "Tropical Pop",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/85/Tropical_Pop.png"
    ),
    Item(
        name = "Vanilla Ice Cream",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/15/Vanilla_Ice_Cream.png"
    ),
    Item(
        name = "Waffles",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e8/Waffles.png"
    ),
    Item(
        name = "Wedding Cake",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6f/Wedding_Cake.png"
    ),
    Item(
        name = "Wonderland Cookies",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/37/Wonderland_Cookies.png"
    ),
    Item(
        name = "Yule Log",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dd/Yule_Log.png"
    ),
    Item(
        name = "Mickey Mouse Hardwood Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b7/Mickey_Mouse_Hardwood_Flooring.png"
    ),
    Item(
        name = "Modern Mickey Mouse Gray Tile Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Wonky Wooden Floor",
        imageUrl = ""
    ),
    Item(
        name = "Marble-Tiled Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/78/Marble-Tiled_Floor.png"
    ),
    Item(
        name = "Starry Marble-Tiled Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/09/Starry_Marble-Tiled_Floor.png"
    ),
    Item(
        name = "Dark Axiom Starliner Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/87/Dark_Axiom_Starliner_Flooring.png"
    ),
    Item(
        name = "Pale Axiom Starliner Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a8/Pale_Axiom_Starliner_Flooring.png"
    ),
    Item(
        name = "Rusted Steel Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f0/Rusted_Steel_Floor.png"
    ),
    Item(
        name = "Mint and Vanilla Candy Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/8a/Mint_and_Vanilla_Candy_Tile_Flooring.png"
    ),
    Item(
        name = "Strawberry and Chocolate Candy Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e4/Strawberry_and_Chocolate_Candy_Tile_Flooring.png"
    ),
    Item(
        name = "Strawberry and Chocolate Sprinkle Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9a/Strawberry_and_Chocolate_Sprinkle_Flooring.png"
    ),
    Item(
        name = "Strawberry Candy Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/01/Strawberry_Candy_Tile_Flooring.png"
    ),
    Item(
        name = "Fancy Black Marble Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3f/Fancy_Black_Marble_Flooring.png"
    ),
    Item(
        name = "Fancy Brown Marble Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/1f/Fancy_Brown_Marble_Flooring.png"
    ),
    Item(
        name = "Green Marble French Manor Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c2/Green_Marble_French_Manor_Floor.png"
    ),
    Item(
        name = "Foam Mat Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Star Command Geometric Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/86/Star_Command_Geometric_Flooring.png"
    ),
    Item(
        name = "Blue Galactic Federation Mothership Containment Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9c/Blue_Galactic_Federation_Mothership_Containment_Flooring.png"
    ),
    Item(
        name = "Green Galactic Federation Mothership Containment Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/dd/Green_Galactic_Federation_Mothership_Containment_Flooring.png"
    ),
    Item(
        name = "Basket Weave Pale Wooden Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a6/Basket_Weave_Pale_Wooden_Floor.png"
    ),
    Item(
        name = "Basket Weave Wooden Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/56/Basket_Weave_Wooden_Floor.png"
    ),
    Item(
        name = "Black and White Checkered Marble Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5a/Black_and_White_Checkered_Marble_Floor.png"
    ),
    Item(
        name = "Black Lined Double-Diamond Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/ae/Black_Lined_Double-Diamond_Tile_Flooring.png"
    ),
    Item(
        name = "Black Starry Linoleum Tile Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Blue and Green Marble Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2b/Blue_and_Green_Marble_Flooring.png"
    ),
    Item(
        name = "Blue Carpeted Floor",
        imageUrl = ""
    ),
    Item(
        name = "Blue Silver-Inlay Marble Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6a/Blue_Silver-Inlay_Marble_Flooring.png"
    ),
    Item(
        name = "Blue Watercolor Honeycomb Tile Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Brick and Wood Barn Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5a/Brick_and_Wood_Barn_Flooring.png"
    ),
    Item(
        name = "Bright Marble Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/08/Bright_Marble_Flooring.png"
    ),
    Item(
        name = "Bright Rustic Tile Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Broken and Dirty Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d8/Broken_and_Dirty_Tile_Flooring.png"
    ),
    Item(
        name = "Brown and White Checkered Marble Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/ac/Brown_and_White_Checkered_Marble_Floor.png"
    ),
    Item(
        name = "Brown Basic Square Tile Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/59/Brown_Basic_Square_Tile_Floor.png"
    ),
    Item(
        name = "Brown Tatami Mat Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Celestial-Balance Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e0/Celestial-Balance_Tile_Flooring.png"
    ),
    Item(
        name = "Celestial-Sunshine Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/fa/Celestial-Sunshine_Tile_Flooring.png"
    ),
    Item(
        name = "Cool-Gray Small Herringbone Carpeted Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0a/Cool-Gray_Small_Herringbone_Carpeted_Flooring.png"
    ),
    Item(
        name = "Dark Brick and Wood Barn Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7d/Dark_Brick_and_Wood_Barn_Flooring.png"
    ),
    Item(
        name = "Dark Hexagonal Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/86/Dark_Hexagonal_Tile_Flooring.png"
    ),
    Item(
        name = "Dark Marble Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Dark Terrazzo Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/07/Dark_Terrazzo_Flooring.png"
    ),
    Item(
        name = "Dark Wooden Chantilly Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a4/Dark_Wooden_Chantilly_Floor.png"
    ),
    Item(
        name = "Dark Wooden Chevron Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/93/Dark_Wooden_Chevron_Floor.png"
    ),
    Item(
        name = "Dark Wooden Double-Herringbone Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/01/Dark_Wooden_Double-Herringbone_Floor.png"
    ),
    Item(
        name = "Dark Wooden Floor",
        imageUrl = ""
    ),
    Item(
        name = "Dark Wooden Herringbone Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c2/Dark_Wooden_Herringbone_Floor.png"
    ),
    Item(
        name = "Dark Wooden Mosaic Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/76/Dark_Wooden_Mosaic_Floor.png"
    ),
    Item(
        name = "Dark Wooden Versailles Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b3/Dark_Wooden_Versailles_Floor.png"
    ),
    Item(
        name = "Diamond-Patterned Mahogany Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/4d/Diamond-Patterned_Mahogany_Flooring.png"
    ),
    Item(
        name = "Double Basket Weave Dark Wooden Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f5/Double_Basket_Weave_Dark_Wooden_Floor.png"
    ),
    Item(
        name = "Double Basket Weave Pale Wooden Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b6/Double_Basket_Weave_Pale_Wooden_Floor.png"
    ),
    Item(
        name = "Eerie Mauve Marbled Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/91/Eerie_Mauve_Marbled_Flooring.png"
    ),
    Item(
        name = "Gold Art Deco Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2d/Gold_Art_Deco_Flooring.png"
    ),
    Item(
        name = "Gray Basic Square Tile Floor",
        imageUrl = ""
    ),
    Item(
        name = "Gray Lined Double-Diamond Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b2/Gray_Lined_Double-Diamond_Tile_Flooring.png"
    ),
    Item(
        name = "Gray Wooden Puzzle Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ef/Gray_Wooden_Puzzle_Flooring.png"
    ),
    Item(
        name = "Green Gold-Inlay Marble Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/1a/Green_Gold-Inlay_Marble_Flooring.png"
    ),
    Item(
        name = "Green Light Terrazzo Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/8c/Green_Light_Terrazzo_Flooring.png"
    ),
    Item(
        name = "Green Watercolor Honeycomb Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/18/Green_Watercolor_Honeycomb_Tile_Flooring.png"
    ),
    Item(
        name = "Large Brown Stone Tilework",
        imageUrl = ""
    ),
    Item(
        name = "Large Gray Stone Tilework",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3b/Large_Gray_Stone_Tilework.png"
    ),
    Item(
        name = "Light Cork Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/dd/Light_Cork_Flooring.png"
    ),
    Item(
        name = "Light Terrazzo Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a9/Light_Terrazzo_Flooring.png"
    ),
    Item(
        name = "Mid-Tone Cork Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c7/Mid-Tone_Cork_Flooring.png"
    ),
    Item(
        name = "Muted Rustic Tile Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Pale Brick and Wood Barn Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/92/Pale_Brick_and_Wood_Barn_Flooring.png"
    ),
    Item(
        name = "Pale Gray Starry Linoleum Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e2/Pale_Gray_Starry_Linoleum_Tile_Flooring.png"
    ),
    Item(
        name = "Pale Hexagonal Tile Floor",
        imageUrl = ""
    ),
    Item(
        name = "Pale Rough Plank Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/72/Pale_Rough_Plank_Floor.png"
    ),
    Item(
        name = "Pale Wood Strip Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/aa/Pale_Wood_Strip_Floor.png"
    ),
    Item(
        name = "Pale Wooden Chantilly Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2b/Pale_Wooden_Chantilly_Floor.png"
    ),
    Item(
        name = "Pale Wooden Chevron Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/52/Pale_Wooden_Chevron_Floor.png"
    ),
    Item(
        name = "Pale Wooden Double-Herringbone Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/07/Pale_Wooden_Double-Herringbone_Floor.png"
    ),
    Item(
        name = "Pale Wooden Floor",
        imageUrl = ""
    ),
    Item(
        name = "Pale Wooden Herringbone Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9e/Pale_Wooden_Herringbone_Floor.png"
    ),
    Item(
        name = "Pale Wooden Mosaic Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e0/Pale_Wooden_Mosaic_Floor.png"
    ),
    Item(
        name = "Pale Wooden Puzzle Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Pale Wooden Versailles Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/4d/Pale_Wooden_Versailles_Floor.png"
    ),
    Item(
        name = "Pink Watercolor Honeycomb Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/51/Pink_Watercolor_Honeycomb_Tile_Flooring.png"
    ),
    Item(
        name = "Pointillist Tile Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Red Carpeted Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/33/Red_Carpeted_Floor.png"
    ),
    Item(
        name = "Rough Plank Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/31/Rough_Plank_Floor.png"
    ),
    Item(
        name = "Rough Stone Tile Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e5/Rough_Stone_Tile_Floor.png"
    ),
    Item(
        name = "Silver Art Deco Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ed/Silver_Art_Deco_Flooring.png"
    ),
    Item(
        name = "Small Dark-Gray Mosaic Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a4/Small_Dark-Gray_Mosaic_Flooring.png"
    ),
    Item(
        name = "Small Medium-Gray Mosaic Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/90/Small_Medium-Gray_Mosaic_Flooring.png"
    ),
    Item(
        name = "Small Pale-Gray Mosaic Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e0/Small_Pale-Gray_Mosaic_Flooring.png"
    ),
    Item(
        name = "Sunny Rustic Tile Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b1/Sunny_Rustic_Tile_Flooring.png"
    ),
    Item(
        name = "Warm Rustic Tile Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Warm-Gray Large Herringbone Carpeted Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5c/Warm-Gray_Large_Herringbone_Carpeted_Flooring.png"
    ),
    Item(
        name = "Warm-Gray Small Herringbone Carpeted Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/be/Warm-Gray_Small_Herringbone_Carpeted_Flooring.png"
    ),
    Item(
        name = "Wood Strip Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e3/Wood_Strip_Floor.png"
    ),
    Item(
        name = "Wooden Chantilly Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/8f/Wooden_Chantilly_Floor.png"
    ),
    Item(
        name = "Wooden Chevron Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/83/Wooden_Chevron_Floor.png"
    ),
    Item(
        name = "Wooden Double-Herringbone Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c3/Wooden_Double-Herringbone_Floor.png"
    ),
    Item(
        name = "Wooden Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0d/Wooden_Floor.png"
    ),
    Item(
        name = "Wooden Herringbone Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f6/Wooden_Herringbone_Floor.png"
    ),
    Item(
        name = "Wooden Mosaic Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e8/Wooden_Mosaic_Floor.png"
    ),
    Item(
        name = "Wooden Puzzle Flooring",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/db/Wooden_Puzzle_Flooring.png"
    ),
    Item(
        name = "Wooden Versailles Floor",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/dd/Wooden_Versailles_Floor.png"
    ),
    Item(
        name = "Yellow Tatami Mat Flooring",
        imageUrl = ""
    ),
    Item(
        name = "Mickey Mouse Mod-Melange Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/02/Mickey_Mouse_Mod-Melange_Wallpaper.png"
    ),
    Item(
        name = "Mickey Mouse Synergy Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3b/Mickey_Mouse_Synergy_Wallpaper.png"
    ),
    Item(
        name = "Pale Blue Starry Night Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d8/Pale_Blue_Starry_Night_Wallpaper.png"
    ),
    Item(
        name = "Purple Starry Night Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b7/Purple_Starry_Night_Wallpaper.png"
    ),
    Item(
        name = "Axiom Starliner Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a7/Axiom_Starliner_Wallpaper.png"
    ),
    Item(
        name = "Rusted Steel and Stickers Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/21/Rusted_Steel_and_Stickers_Wallpaper.png"
    ),
    Item(
        name = "Carved Wooden Posts Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/32/Carved_Wooden_Posts_Wallpaper.png"
    ),
    Item(
        name = "Dark Painted-Earth Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/54/Dark_Painted-Earth_Wallpaper.png"
    ),
    Item(
        name = "Dark Tropical Leaf Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/bc/Dark_Tropical_Leaf_Wallpaper.png"
    ),
    Item(
        name = "Light Painted-Earth Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/de/Light_Painted-Earth_Wallpaper.png"
    ),
    Item(
        name = "Pale Carved Wooden Posts Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/98/Pale_Carved_Wooden_Posts_Wallpaper.png"
    ),
    Item(
        name = "Reed Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "Tropical Leaf Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/ba/Tropical_Leaf_Wallpaper.png"
    ),
    Item(
        name = "Chambre de Bonne Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/54/Chambre_de_Bonne_Wallpaper.png"
    ),
    Item(
        name = "Periwinkle French Castle Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7a/Periwinkle_French_Castle_Wallpaper.png"
    ),
    Item(
        name = "Pink French Castle Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a9/Pink_French_Castle_Wallpaper.png"
    ),
    Item(
        name = "Soft Green French Castle Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9a/Soft_Green_French_Castle_Wallpaper.png"
    ),
    Item(
        name = "White French Castle Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/76/White_French_Castle_Wallpaper.png"
    ),
    Item(
        name = "Caramel-Covered Strawberry-Chocolate Cake Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b1/Caramel-Covered_Strawberry-Chocolate_Cake_Wall.png"
    ),
    Item(
        name = "Caramel-Covered Strawberry-Vanilla Cake Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b9/Caramel-Covered_Strawberry-Vanilla_Cake_Wall.png"
    ),
    Item(
        name = "Chocolate-Covered Strawberry-Chocolate Cake Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/44/Chocolate-Covered_Strawberry-Chocolate_Cake_Wall.png"
    ),
    Item(
        name = "Chocolate-Covered Strawberry-Vanilla Cake Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a9/Chocolate-Covered_Strawberry-Vanilla_Cake_Wall.png"
    ),
    Item(
        name = "Blue Gold-Embossed Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b4/Blue_Gold-Embossed_Wall.png"
    ),
    Item(
        name = "White Gold-Embossed Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d2/White_Gold-Embossed_Wall.png"
    ),
    Item(
        name = "Savanna Landscape Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/96/Savanna_Landscape_Wallpaper.png"
    ),
    Item(
        name = "Blue Underwater Landscape Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d5/Blue_Underwater_Landscape_Wallpaper.png"
    ),
    Item(
        name = "Pink Grand Dining Hall Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ec/Pink_Grand_Dining_Hall_Wallpaper.png"
    ),
    Item(
        name = "Purple Underwater Landscape Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6d/Purple_Underwater_Landscape_Wallpaper.png"
    ),
    Item(
        name = "White Grand Dining Hall Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d8/White_Grand_Dining_Hall_Wallpaper.png"
    ),
    Item(
        name = "Arendelle Hallway Hall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/40/Arendelle_Hallway_Hall.png"
    ),
    Item(
        name = "Arendelle Library Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/55/Arendelle_Library_Wall.png"
    ),
    Item(
        name = "Blue Icy Castle Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a5/Blue_Icy_Castle_Wallpaper.png"
    ),
    Item(
        name = "Purple Icy Castle Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e4/Purple_Icy_Castle_Wallpaper.png"
    ),
    Item(
        name = "Cluster of Funky Doors Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f6/Cluster_of_Funky_Doors_Wallpaper.png"
    ),
    Item(
        name = "Amoozing Pattern",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c8/Amoozing_Pattern.png"
    ),
    Item(
        name = "Cloudy Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/21/Cloudy_Wallpaper.png"
    ),
    Item(
        name = "Infinity and Beyond Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/1f/Infinity_and_Beyond_Wallpaper.png"
    ),
    Item(
        name = "Outer Space Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f8/Outer_Space_Wallpaper.png"
    ),
    Item(
        name = "Red and White Striped Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/01/Red_and_White_Striped_Wallpaper.png"
    ),
    Item(
        name = "Star Command Geometric Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/45/Star_Command_Geometric_Wall.png"
    ),
    Item(
        name = "Blue Galactic Federation Mothership Containment Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/15/Blue_Galactic_Federation_Mothership_Containment_Wall.png"
    ),
    Item(
        name = "Blue-Painted Tin Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5f/Blue-Painted_Tin_Wall.png"
    ),
    Item(
        name = "Cream-Painted Tin Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0f/Cream-Painted_Tin_Wall.png"
    ),
    Item(
        name = "Green Galactic Federation Mothership Containment Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/96/Green_Galactic_Federation_Mothership_Containment_Wall.png"
    ),
    Item(
        name = "Lilo's Dance Class Curtain Wall",
        imageUrl = ""
    ),
    Item(
        name = "Lit Galactic Federation Mothership Hallway Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ef/Lit_Galactic_Federation_Mothership_Hallway_Wall.png"
    ),
    Item(
        name = "Pink-Painted Tin Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/47/Pink-Painted_Tin_Wall.png"
    ),
    Item(
        name = "Red Alert Galactic Federation Mothership Hallway Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/de/Red_Alert_Galactic_Federation_Mothership_Hallway_Wall.png"
    ),
    Item(
        name = "Unlit Galactic Federation Mothership Hallway Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b9/Unlit_Galactic_Federation_Mothership_Hallway_Wall.png"
    ),
    Item(
        name = "Worn Blue-Painted Wood Plank Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c7/Worn_Blue-Painted_Wood_Plank_Wall.png"
    ),
    Item(
        name = "Worn Green-Painted Wood Plank Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/64/Worn_Green-Painted_Wood_Plank_Wall.png"
    ),
    Item(
        name = "Worn White-Painted Wood Plank Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e2/Worn_White-Painted_Wood_Plank_Wall.png"
    ),
    Item(
        name = "Bamboo-Thatched Wall",
        imageUrl = ""
    ),
    Item(
        name = "Black and White Beadboard Wainscotting Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b8/Black_and_White_Beadboard_Wainscotting_Wall.png"
    ),
    Item(
        name = "Black and White Wainscotting Wall",
        imageUrl = ""
    ),
    Item(
        name = "Black Board and Batten Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/38/Black_Board_and_Batten_Wall.png"
    ),
    Item(
        name = "Black Herringbone Board and Batten Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d2/Black_Herringbone_Board_and_Batten_Wall.png"
    ),
    Item(
        name = "Black Raised-Panel Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a5/Black_Raised-Panel_Wall.png"
    ),
    Item(
        name = "Black Zigzag Tile Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9e/Black_Zigzag_Tile_Wall.png"
    ),
    Item(
        name = "Blue Mermaid-Scale Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6e/Blue_Mermaid-Scale_Wallpaper.png"
    ),
    Item(
        name = "Blue Wood-Patterned Simple Baseboard Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/43/Blue_Wood-Patterned_Simple_Baseboard_Wallpaper.png"
    ),
    Item(
        name = "Bold Shapes and Plants Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/95/Bold_Shapes_and_Plants_Wallpaper.png"
    ),
    Item(
        name = "Bright Shapes and Plants Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/33/Bright_Shapes_and_Plants_Wallpaper.png"
    ),
    Item(
        name = "Celestial Splendor Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/60/Celestial_Splendor_Wall.png"
    ),
    Item(
        name = "Cool Gray Honeycomb Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e1/Cool_Gray_Honeycomb_Tile_Wallpaper.png"
    ),
    Item(
        name = "Cream Fan-Tile Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/73/Cream_Fan-Tile_Wall.png"
    ),
    Item(
        name = "Dark Bamboo Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3b/Dark_Bamboo_Wall.png"
    ),
    Item(
        name = "Dark Gray Grated Tile Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "Dark Gray Precise Geometric Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6e/Dark_Gray_Precise_Geometric_Tile_Wallpaper.png"
    ),
    Item(
        name = "Dark Gray Textured Geometric Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e6/Dark_Gray_Textured_Geometric_Tile_Wallpaper.png"
    ),
    Item(
        name = "Dark Gray Wavy Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/97/Dark_Gray_Wavy_Tile_Wallpaper.png"
    ),
    Item(
        name = "Dark Wood Shoji Screen Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/50/Dark_Wood_Shoji_Screen_Wallpaper.png"
    ),
    Item(
        name = "Desaturated Shapes and Plants Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d1/Desaturated_Shapes_and_Plants_Wallpaper.png"
    ),
    Item(
        name = "Eerie Wood Paneling Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b1/Eerie_Wood_Paneling_Wall.png"
    ),
    Item(
        name = "Earthy Shapes and Plants Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2d/Earthy_Shapes_and_Plants_Wallpaper.png"
    ),
    Item(
        name = "Gilded Soaring Clouds Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/af/Gilded_Soaring_Clouds_Wall.png"
    ),
    Item(
        name = "Golden Pastel Geode Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ef/Golden_Pastel_Geode_Wall.png"
    ),
    Item(
        name = "Gold-Trimmed Gray Stone Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/47/Gold-Trimmed_Gray_Stone_Wallpaper.png"
    ),
    Item(
        name = "Gold-Trimmed Pale Gray Stone Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ef/Gold-Trimmed_Pale_Gray_Stone_Wallpaper.png"
    ),
    Item(
        name = "Gray Arches Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5c/Gray_Arches_Wallpaper.png"
    ),
    Item(
        name = "Gray Board and Batten Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a1/Gray_Board_and_Batten_Wall.png"
    ),
    Item(
        name = "Gray Concrete and Black Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/36/Gray_Concrete_and_Black_Tile_Wallpaper.png"
    ),
    Item(
        name = "Gray Concrete and Pale Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/fd/Gray_Concrete_and_Pale_Tile_Wallpaper.png"
    ),
    Item(
        name = "Gray Concrete Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "Gray Fan-Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/33/Gray_Fan-Tile_Wallpaper.png"
    ),
    Item(
        name = "Gray Perforated Concrete Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/08/Gray_Perforated_Concrete_Wall.png"
    ),
    Item(
        name = "Gray Raised-Panel Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/49/Gray_Raised-Panel_Wall.png"
    ),
    Item(
        name = "Gray Zigzag Tile Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/29/Gray_Zigzag_Tile_Wall.png"
    ),
    Item(
        name = "Green Arches Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/bb/Green_Arches_Wallpaper.png"
    ),
    Item(
        name = "Green Bamboo Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2b/Green_Bamboo_Wall.png"
    ),
    Item(
        name = "Green Damaged Baseboard Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "Green Simple Baseboard Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/44/Green_Simple_Baseboard_Wallpaper.png"
    ),
    Item(
        name = "Green Terrazzo Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/41/Green_Terrazzo_Wallpaper.png"
    ),
    Item(
        name = "Herringbone-Patterned Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "Intricate Thorn and Lattice Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/88/Intricate_Thorn_and_Lattice_Wall.png"
    ),
    Item(
        name = "Large Red Brick Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5f/Large_Red_Brick_Wallpaper.png"
    ),
    Item(
        name = "Large Gray Brick Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/45/Large_Gray_Brick_Wallpaper.png"
    ),
    Item(
        name = "Light Bamboo Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/62/Light_Bamboo_Wall.png"
    ),
    Item(
        name = "Marble and Gold Diamond Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c0/Marble_and_Gold_Diamond_Tile_Wallpaper.png"
    ),
    Item(
        name = "Marble and Silver Diamond Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7a/Marble_and_Silver_Diamond_Tile_Wallpaper.png"
    ),
    Item(
        name = "Old Plaster and Brick Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/59/Old_Plaster_and_Brick_Wallpaper.png"
    ),
    Item(
        name = "Painted Tower Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2b/Painted_Tower_Wall.png"
    ),
    Item(
        name = "Pale Blue Terrazzo Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c1/Pale_Blue_Terrazzo_Wallpaper.png"
    ),
    Item(
        name = "Pale Gray Grated Tile Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "Pale Gray Precise Geometric Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/19/Pale_Gray_Precise_Geometric_Tile_Wallpaper.png"
    ),
    Item(
        name = "Pale Gray Textured Geometric Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/27/Pale_Gray_Textured_Geometric_Tile_Wallpaper.png"
    ),
    Item(
        name = "Pale Gray Wavy Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d0/Pale_Gray_Wavy_Tile_Wallpaper.png"
    ),
    Item(
        name = "Pale Wood Tea Room Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "Pink Mermaid-Scale Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/16/Pink_Mermaid-Scale_Wallpaper.png"
    ),
    Item(
        name = "Pixilated Wrecked Brick Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/1e/Pixilated_Wrecked_Brick_Wall.png"
    ),
    Item(
        name = "Red Show Curtain Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/36/Red_Show_Curtain_Wallpaper.png"
    ),
    Item(
        name = "Rough Stone Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "Rustic Tavern Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/67/Rustic_Tavern_Wallpaper.png"
    ),
    Item(
        name = "Rustic Tavern with Stone Baseboard Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d8/Rustic_Tavern_with_Stone_Baseboard_Wallpaper.png"
    ),
    Item(
        name = "Sculpted Ceiling and Stony Baseboard Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/4f/Sculpted_Ceiling_and_Stony_Baseboard_Wallpaper.png"
    ),
    Item(
        name = "Silver-Trimmed Diamond Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6b/Silver-Trimmed_Diamond_Tile_Wallpaper.png"
    ),
    Item(
        name = "Silver-Trimmed Gray Stone Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/db/Silver-Trimmed_Gray_Stone_Wallpaper.png"
    ),
    Item(
        name = "Silver-Trimmed Pale Gray Stone Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2a/Silver-Trimmed_Pale_Gray_Stone_Wallpaper.png"
    ),
    Item(
        name = "Simple Gray-Blue Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/83/Simple_Gray-Blue_Wallpaper.png"
    ),
    Item(
        name = "Simple Green Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a8/Simple_Green_Wallpaper.png"
    ),
    Item(
        name = "Simple Icy Blue Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/87/Simple_Icy_Blue_Wallpaper.png"
    ),
    Item(
        name = "Simple Orange Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f3/Simple_Orange_Wallpaper.png"
    ),
    Item(
        name = "Simple Pink Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/94/Simple_Pink_Wallpaper.png"
    ),
    Item(
        name = "Simple Purple Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/04/Simple_Purple_Wallpaper.png"
    ),
    Item(
        name = "Simple Red Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6b/Simple_Red_Wallpaper.png"
    ),
    Item(
        name = "Simple White Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/ce/Simple_White_Wallpaper.png"
    ),
    Item(
        name = "Striped Show Curtain Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0a/Striped_Show_Curtain_Wallpaper.png"
    ),
    Item(
        name = "Warm Gray Honeycomb Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2f/Warm_Gray_Honeycomb_Tile_Wallpaper.png"
    ),
    Item(
        name = "White and Black Half-Brick Wall",
        imageUrl = ""
    ),
    Item(
        name = "White and Gray Beadboard Wainscotting Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/49/White_and_Gray_Beadboard_Wainscotting_Wall.png"
    ),
    Item(
        name = "White and Gray Half-Brick Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/ad/White_and_Gray_Half-Brick_Wall.png"
    ),
    Item(
        name = "White and Gray Wainscotting Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2f/White_and_Gray_Wainscotting_Wall.png"
    ),
    Item(
        name = "White Beadboard Wainscotting Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/09/White_Beadboard_Wainscotting_Wall.png"
    ),
    Item(
        name = "White Board and Batten Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/46/White_Board_and_Batten_Wall.png"
    ),
    Item(
        name = "White Concrete and Black Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a3/White_Concrete_and_Black_Tile_Wallpaper.png"
    ),
    Item(
        name = "White Concrete and Green Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a3/White_Concrete_and_Green_Tile_Wallpaper.png"
    ),
    Item(
        name = "White Concrete and Pale Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5b/White_Concrete_and_Pale_Tile_Wallpaper.png"
    ),
    Item(
        name = "White Concrete and Yellow Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7f/White_Concrete_and_Yellow_Tile_Wallpaper.png"
    ),
    Item(
        name = "White Concrete Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "White Grated Tile Wallpaper",
        imageUrl = ""
    ),
    Item(
        name = "White Half-Brick Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/41/White_Half-Brick_Wall.png"
    ),
    Item(
        name = "White Herringbone Board and Batten Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/89/White_Herringbone_Board_and_Batten_Wall.png"
    ),
    Item(
        name = "White Perforated Concrete Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/92/White_Perforated_Concrete_Wall.png"
    ),
    Item(
        name = "White Precise Geometric Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/38/White_Precise_Geometric_Tile_Wallpaper.png"
    ),
    Item(
        name = "White Raised-Panel Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/37/White_Raised-Panel_Wall.png"
    ),
    Item(
        name = "White Terrazzo Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/96/White_Terrazzo_Wallpaper.png"
    ),
    Item(
        name = "White Textured Geometric Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/19/White_Textured_Geometric_Tile_Wallpaper.png"
    ),
    Item(
        name = "White Wainscotting Wall",
        imageUrl = ""
    ),
    Item(
        name = "White Wavy Tile Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f1/White_Wavy_Tile_Wallpaper.png"
    ),
    Item(
        name = "White Zigzag Tile Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/dc/White_Zigzag_Tile_Wall.png"
    ),
    Item(
        name = "Worn Brick Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7a/Worn_Brick_Wallpaper.png"
    ),
    Item(
        name = "Yellow Mermaid-Scale Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/85/Yellow_Mermaid-Scale_Wallpaper.png"
    ),
    Item(
        name = "Yellow Simple Baseboard Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/34/Yellow_Simple_Baseboard_Wallpaper.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3a/Mickey_Mouse_Logo_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Mickey_Mouse_Portrait.png"
    ),
    Item(
        name = "Mickey Mouse Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/af/Classic_Mickey_Motif.png"
    ),
    Item(
        name = "Mickey Mouse Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/95/Mickey_Shadow_Motif.png"
    ),
    Item(
        name = "Minnie Mouse Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/19/Bow_Motif.png"
    ),
    Item(
        name = "Minnie Mouse Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e4/Mouse_Balloon_Motif.png"
    ),
    Item(
        name = "Mickey Mouse Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a3/Classic_Mickey_Mouse_Motif.png"
    ),
    Item(
        name = "Donald Duck Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/Donald_Duck_Laughing_Motif.png"
    ),
    Item(
        name = "Donald Duck Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/de/Donald_Duck_Winking_Motif.png"
    ),
    Item(
        name = "Goofy Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/Goofy_Portrait_Motif.png"
    ),
    Item(
        name = "Goofy Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d3/Goofy_Shrugging_Motif.png"
    ),
    Item(
        name = "Goofy Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5e/Goofy_Fishing_Motif.png"
    ),
    Item(
        name = "Scrooge McDuck Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/Scrooge_Motif.png"
    ),
    Item(
        name = "Scrooge McDuck Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/03/Scrooge_in_Money_Motif.png"
    ),
    Item(
        name = "Scrooge McDuck Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/65/Scrooge_Jumping_Motif.png"
    ),
    Item(
        name = "Minnie Mouse Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/96/Looking-Sharp_Minnie_Motif.png"
    ),
    Item(
        name = "Founder's Pack - Standard Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d2/Mickey_Mouse_Modern_Portrait.png"
    ),
    Item(
        name = "Founder's Pack - Standard Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d9/Minnie_Mouse_Modern_Portrait.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7f/Pluto_Holiday_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1c/Mickey_Sweater_Pattern_Motif.png"
    ),
    Item(
        name = "Merlin Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Sword_in_the_Stone_Motif.png"
    ),
    Item(
        name = "Merlin Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/90/Bag_of_Tricks_Motif.png"
    ),
    Item(
        name = "Merlin Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/10/Owl_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9c/The_Sword_in_the_Stone_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2e/Spinning_Plate_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/WALL-E_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/50/WALL-E_Boot_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/96/EVE_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bf/WALL-E_Portrait_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e9/WALL-E_Boot_Plant_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fa/WALL-E_Flying_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/BnL_Motif.png"
    ),
    Item(
        name = "WALL-E Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/79/Security_Robot_Motif.png"
    ),
    Item(
        name = "WALL-E Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9d/Twinky_Motif.png"
    ),
    Item(
        name = "WALL-E Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/22/WALL-E_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/EVE_Lights_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Moana_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c8/Moana_Pattern_Motif.png"
    ),
    Item(
        name = "Moana Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d7/Flower_Motif.png"
    ),
    Item(
        name = "Moana Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dd/Heart_of_Te_Fiti_Motif.png"
    ),
    Item(
        name = "Moana Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7d/Sailing_Motif.png"
    ),
    Item(
        name = "Maui Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f5/Maui_Motif.png"
    ),
    Item(
        name = "Maui Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7d/Maui_Eagle_Motif.png"
    ),
    Item(
        name = "Maui Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/88/Crab_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f6/Te_Fiti_Motif.png"
    ),
    Item(
        name = "Remy Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3f/Chef_Remy_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/67/Whiskers_Chef_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Chef_Hat_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/10/Hanging_Pot_Shelf_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Eiffel_Tower_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b1/Little_Chef_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a3/Little_Chef_Plate_Motif.png"
    ),
    Item(
        name = "Remy Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Remy_Motif.png"
    ),
    Item(
        name = "Remy Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6f/Rat_and_Spoon_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/03/Beast_Shadow_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/03/Magic_Mirror_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Teapot_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/84/Covered_Rose_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Beauty_and_the_Beast_Rose_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/37/Rose_Stitching_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Lumiere_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d3/Rose_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Wreck-It_Ralph_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Pixel_Heart_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/55/Pixel_Cloud_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b8/Ralph_Shadow_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Candy_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/97/My_Hero_Cookie_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7f/Glitched_Out_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ce/BFF_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/35/Cinderella_Slipper_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Pumpkin_Carriage_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8d/Magic_Wand_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/56/Cinderella_Castle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/19/Glass_Slipper_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/89/Cinderella_Bubble_Motif.png"
    ),
    Item(
        name = "Founder's Pack - Ultimate Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6e/Royal_Pumpkin_Emblem.png"
    ),
    Item(
        name = "Founder's Pack - Ultimate Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/02/Royal_Crown_Motif.png"
    ),
    Item(
        name = "Founder's Pack - Ultimate Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fe/Cinderella_Clock_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6e/Simba_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fc/Lion_Prints_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/eb/The_Lion_King_Pattern_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/The_Lion_King_Time_Passing_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/11/Simba_Drawing_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/26/Green_Fan_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/55/Grubs_Motif.png"
    ),
    Item(
        name = "Scar Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/46/Scar_Motif.png"
    ),
    Item(
        name = "Scar Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4f/Be_Prepared_Motif.png"
    ),
    Item(
        name = "Scar Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8d/Ed_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/52/The_Little_Mermaid_Motif.png"
    ),
    Item(
        name = "Ariel Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a2/Fork_Motif.png"
    ),
    Item(
        name = "Ariel Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a1/Bubbles_Motif.png"
    ),
    Item(
        name = "Prince Eric Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3a/Kiss_the_Girl_Motif.png"
    ),
    Item(
        name = "Ursula Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/49/Seashell_Motif.png"
    ),
    Item(
        name = "Ariel Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/50/Ariel_Silhouette_Motif.png"
    ),
    Item(
        name = "Prince Eric Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/04/Max_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/90/Splash_Motif.png"
    ),
    Item(
        name = "Prince Eric Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/14/Sailing_Ship_Motif.png"
    ),
    Item(
        name = "Ursula Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Trident_Motif.png"
    ),
    Item(
        name = "Ursula Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Sea_Witch_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/Frozen_Snowflake_Motif.png"
    ),
    Item(
        name = "Anna Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b6/Arendelle_Decoration_Motif.png"
    ),
    Item(
        name = "Anna Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c8/Anna_Motif.png"
    ),
    Item(
        name = "Elsa Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c5/Elsa_Motif.png"
    ),
    Item(
        name = "Elsa Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b7/The_Nokk_Portrait_Motif.png"
    ),
    Item(
        name = "Kristoff Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5e/Sven_Motif.png"
    ),
    Item(
        name = "Kristoff Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d5/Sven_Portrait_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8a/Snowflake_Motif_2.png"
    ),
    Item(
        name = "Anna Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Arendelle_Crest_Motif.png"
    ),
    Item(
        name = "Elsa Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/eb/Snowflake_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Pink_Crest_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b5/Purple_Crest_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8c/Light_Blue_Crest_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bf/Blue_Crest_Motif.png"
    ),
    Item(
        name = "Kristoff Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/74/Tree_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c2/Tangled_Emblem.png"
    ),
    Item(
        name = "Mother Gothel Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/85/Dagger_Motif.png"
    ),
    Item(
        name = "Mother Gothel Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7e/Pub_Sign_Motif.png"
    ),
    Item(
        name = "Mother Gothel Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Sundrop_Flower_Portrait_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5a/Sun_Lanterns_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Sun_Lantern_Group_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2b/Tangled_Crown_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/be/Monsters%2C_Inc._Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7c/Monster_Badge_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b2/Mike_Emblem_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c9/Monster_Face_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1c/Monsters_University_Logo_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/37/Monsters%2C_Inc._Door_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/89/Monsters%2C_Inc._Green_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/36/Monsters%2C_Inc._Blue_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/47/Monsters%2C_Inc._Patch_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/26/Toy_Story_Alien_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/65/Star_Command_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Luxo_Ball_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/58/Cowboy_Boot_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Lasso_Motif.png"
    ),
    Item(
        name = "Founder's Pack - Deluxe Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3e/Modern_Buzz_Lightyear_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c0/Jesse_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/34/Star_Command_Patch_Motif.png"
    ),
    Item(
        name = "Buzz Lightyear Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/Buzz_Buttons_Motif.png"
    ),
    Item(
        name = "Buzz Lightyear Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Zerg_Motif.png"
    ),
    Item(
        name = "Buzz Lightyear Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/54/Buzz_Portrait_Motif.png"
    ),
    Item(
        name = "Woody Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/Sheriff_Star_Motif.png"
    ),
    Item(
        name = "Woody Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f3/Snake_in_my_Boot_Motif.png"
    ),
    Item(
        name = "Woody Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2a/Woody_Portrait_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Alien_Santa_Motif_2.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Lilo_%26_Stitch_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/96/Palm_Leaf_Emblem.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5c/Fish_Sandwich_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/62/Stitch_Turtle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b3/Lilo_%26_Stitch_Music_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ce/Stitch_in_Sand_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a9/Stitch_The_King_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Lilo_%26_Stitch_Photo_Motif.png"
    ),
    Item(
        name = "Stitch Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e4/Stitch_Sitting_Motif.png"
    ),
    Item(
        name = "Stitch Level 6",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/31/Stitch_Drawing_Motif.png"
    ),
    Item(
        name = "Stitch Level 9",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/95/Stitch_Reading_to_Ducklings_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Stitch_Lights_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/43/Alien_Santa_Motif.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/37/Incredibles_Emblem.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8c/Edna_E_Mode_Emblem.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a9/Jack_Jack_Emblem.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c8/Hades_Portrait_Motif.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a5/Coco_Banner.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e1/Coco_Guitar_Colors.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Miguel_with_Face_Paint.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Lightning_McQueen_Decal.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c2/Piston_Cup_Emblem.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8d/Lightning_McQueen_Pose.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cb/Space_Ranger_Emblem.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/83/SOX_Portrait.png"
    ),
    Item(
        name = "Founder's Pack - Deluxe Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d6/Star_Circle.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/02/Grape_Soda_Pin.png"
    ),
    Item(
        name = "Pixar Fest Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7a/Up%21_House.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e8/Maleficent_Portrait_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fd/Poison_Apple_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e4/Poison_Apple_Color_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/12/Magic_Mirror_Face_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/17/Cheshire_Cat_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/96/Night_on_Bald_Mountain_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/10/Circle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7b/Hollow_Circle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ce/Square_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/75/Hollow_Square_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Triangle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1c/Hollow_Triangle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3d/Half-Circle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3b/Hollow_Half-Circle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Default_Motif_Hexagon.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/93/Default_Motif_Hollow_Hexagon.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3a/Default_Motif_Star.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e5/Default_Motif_Hollow_Star.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a6/Default_Motif_Ten_Point_Star.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cd/Default_Motif_Rectangle.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/da/Default_Motif_Curve.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3a/Default_Motif_Diagonal_Oval.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a0/Default_Motif_Three_Point_Star.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cd/Heart_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Diamond_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Smile_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Skull_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Flower_Motif_2.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a3/Crescent_Moon_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/df/Star_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/ef/Hollow_Star_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/Star_Burst_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4a/Space_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b9/Ring_Planet_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Apple_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/02/Cherry_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Music_Note_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d6/Music_Double-Note_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/ff/Music_Clef_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b6/Cloud_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6e/Rain_Drop_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c2/Lightning_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1a/Sun_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4c/Cat_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6c/Dog_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4a/Wolf_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/69/Headphones_Motif.png"
    ),
    Item(
        name = "Donald Duck Level 3",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Ship_Wheel_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5f/Pirate_Emblem_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/eb/Pirate_Sword_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4b/Scared_Cat_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/85/Witch_Hat_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/92/Spider_Web_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Jack-O-Lantern_Face_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/65/Ribcage_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/05/Flying_Bat_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4f/Flapping_Bat_Motif.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/98/Flying_Bat_Motif_2.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9a/Flying_Bat_Motif_3.png"
    ),
    Item(
        name = "Villains' Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/27/Flames_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bc/Gingerbread_Mickey.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/27/Purple_Wreath_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c7/Fir_Tree_Sweater_Pattern_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/19/Snowflake_Motif_3.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4a/Festive_Goat_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/81/Snowflake_Motif_4.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Christmas_Tree_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b5/Candy_Cane_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8b/Hot_Cocoa_Motif.png"
    ),
    Item(
        name = "Festive Star Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a0/Snowman_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7e/Alien_Text_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/76/Villains_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f5/Long_Stem_Rose_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Rose_Line_Art_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Decorative_Lines_Motif_1.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5c/Decorative_Lines_Motif_2.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/82/White_Leaf_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/10/Default_Motif_Short_Fade_Box.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0d/Default_Motif_Tall_Fade_Box.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/16/Default_Motif_Glitter_Triangle.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/da/Pink_Flower_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/74/Pink_Flower_Bundle_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d5/Pink_Bubble.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Planets_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/Heart_of_the_Valley_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b2/Strawberry_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fe/Watermelon_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ab/Watermelons_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a1/Pomegranate_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f4/Orange_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/23/Rainbow_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/50/Mushroom_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/57/Snake_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/52/Star_Wolf_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/7b/Raven_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f1/Tiger_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/49/Tinkerbell_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/44/Wear_Motif_1.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/42/Wear_Motif_2.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/13/Angled_Pocket_Motif.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0d/Square_Pocket_Motif.png"
    ),
    Item(
        name = "Founder's Pack - Deluxe Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/38/Luxo_Ball_Emblem.png"
    ),
    Item(
        name = "Founder's Pack - Standard Edition",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2b/Modern_Fireworks.png"
    ),
    Item(
        name = "Motif",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/98/Rainbow_Castle_Motif.png"
    ),
    Item(
        name = "Bare-Limbed Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3b/Bare-Limbed_Tree.png"
    ),
    Item(
        name = "Bent Palm Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/52/Bent_Palm_Tree.png"
    ),
    Item(
        name = "Bent Sunlit Plateau Palm Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6c/Bent_Sunlit_Plateau_Palm_Tree.png"
    ),
    Item(
        name = "Curved Sunlit Plateau Palm Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/99/Curved_Sunlit_Plateau_Palm_Tree.png"
    ),
    Item(
        name = "Dead Bush",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1f/Dead_Bush.png"
    ),
    Item(
        name = "Dead Forgotten Lands Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/12/Dead_Forgotten_Lands_Tree.png"
    ),
    Item(
        name = "Dead Pine Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Dead_Pine_Tree.png"
    ),
    Item(
        name = "Fallen Trunk",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/51/Fallen_Trunk.png"
    ),
    Item(
        name = "Fir",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c5/Fir.png"
    ),
    Item(
        name = "Frozen Dead Bush",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f8/Frozen_Dead_Bush.png"
    ),
    Item(
        name = "Frozen Twisted Dead Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/ca/Frozen_Twisted_Dead_Tree.png"
    ),
    Item(
        name = "Frozen Willow Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/78/Frozen_Willow_Tree.png"
    ),
    Item(
        name = "High Snowy Fir",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/da/High_Snowy_Fir.png"
    ),
    Item(
        name = "Large Plaza Hedge",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c5/Large_Plaza_Hedge.png"
    ),
    Item(
        name = "Large Plaza Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/8/8f/Large_Plaza_Tree.png"
    ),
    Item(
        name = "Light Birch Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/95/Light_Birch_Tree.png"
    ),
    Item(
        name = "Lush Dragon Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cd/Lush_Dragon_Tree.png"
    ),
    Item(
        name = "Lush Sinister Fir",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/68/Lush_Sinister_Fir.png"
    ),
    Item(
        name = "Lush Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/af/Lush_Tree.png"
    ),
    Item(
        name = "Meager Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/32/Meager_Tree.png"
    ),
    Item(
        name = "Moss-Covered Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/35/Moss-Covered_Tree.png"
    ),
    Item(
        name = "Mossy Root Arch",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b5/Mossy_Root_Arch.png"
    ),
    Item(
        name = "Plaza Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Plaza_Tree.png"
    ),
    Item(
        name = "Root Arch",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bc/Root_Arch.png"
    ),
    Item(
        name = "Round Palm Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f6/Round_Palm_Tree.png"
    ),
    Item(
        name = "Round Sunlit Plateau Palm Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5e/Round_Sunlit_Plateau_Palm_Tree.png"
    ),
    Item(
        name = "Scraggly Bush",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Scraggly_Bush.png"
    ),
    Item(
        name = "Short Japanese Maple",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/06/Short_Japanese_Maple.png"
    ),
    Item(
        name = "Simple Maple",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Simple_Maple.png"
    ),
    Item(
        name = "Sinister Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b7/Sinister_Tree.png"
    ),
    Item(
        name = "Slender Sinister Fir",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/be/Slender_Sinister_Fir.png"
    ),
    Item(
        name = "Small Oak",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/24/Small_Oak.png"
    ),
    Item(
        name = "Small Plaza Hedge",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ab/Small_Plaza_Hedge.png"
    ),
    Item(
        name = "Snowy Dead Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/09/Snowy_Dead_Tree.png"
    ),
    Item(
        name = "Squat Tree Stump",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Squat_Tree_Stump.png"
    ),
    Item(
        name = "Swamp Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/fb/Swamp_Tree.png"
    ),
    Item(
        name = "Swamp Willow Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b0/Swamp_Willow_Tree.png"
    ),
    Item(
        name = "Tall Acacia Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e9/Tall_Acacia_Tree.png"
    ),
    Item(
        name = "Tall Birch Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/33/Tall_Birch_Tree.png"
    ),
    Item(
        name = "Tall Black Maple",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/72/Tall_Black_Maple.png"
    ),
    Item(
        name = "Tall Sunlit Plateau Palm Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/65/Tall_Sunlit_Plateau_Palm_Tree.png"
    ),
    Item(
        name = "Three-Limbed Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b4/Three-Limbed_Tree.png"
    ),
    Item(
        name = "Tree Trunk",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Tree_Trunk.png"
    ),
    Item(
        name = "Tropical Beach Greenery",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/6b/Tropical_Beach_Greenery.png"
    ),
    Item(
        name = "Tropical Greenery",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Tropical_Greenery.png"
    ),
    Item(
        name = "Wide Baobab Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e4/Wide_Baobab_Tree.png"
    ),
    Item(
        name = "Wide Swamp Tree",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d3/Wide_Swamp_Tree.png"
    ),
    Item(
        name = "Large Dazzle Beach Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/18/Large_Dazzle_Beach_Rock.png"
    ),
    Item(
        name = "Large Mossy Forest of Valor Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3f/Large_Mossy_Forest_of_Valor_Rock.png"
    ),
    Item(
        name = "Large Mossy Forgotten Lands Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/45/Large_Mossy_Forgotten_Lands_Rock.png"
    ),
    Item(
        name = "Large Mossy Glade of Trust Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/dc/Large_Mossy_Glade_of_Trust_Rock.png"
    ),
    Item(
        name = "Large Mossy Peaceful Meadow Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a2/Large_Mossy_Peaceful_Meadow_Rock.png"
    ),
    Item(
        name = "Large Mossy Sunlit Plateau Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/cf/Large_Mossy_Sunlit_Plateau_Rock.png"
    ),
    Item(
        name = "Large Snowy Frosted Heights Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/7/78/Large_Snowy_Frosted_Heights_Rock.png"
    ),
    Item(
        name = "Large Sunlit Plateau Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Large_Sunlit_Plateau_Rock.png"
    ),
    Item(
        name = "Large Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/64/Large_Rock.png"
    ),
    Item(
        name = "Mossy Forest of Valor Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9c/Mossy_Forest_of_Valor_Rock.png"
    ),
    Item(
        name = "Mossy Forest of Valor Rock with Mushrooms",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d1/Mossy_Forest_of_Valor_Rock_with_Mushrooms.png"
    ),
    Item(
        name = "Mossy Forgotten Lands Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/46/Mossy_Forgotten_Lands_Rock.png"
    ),
    Item(
        name = "Mossy Glade of Trust Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/4d/Mossy_Glade_of_Trust_Rock.png"
    ),
    Item(
        name = "Mossy Peaceful Meadow Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a9/Mossy_Peaceful_Meadow_Rock.png"
    ),
    Item(
        name = "Mossy Plaza Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Mossy_Plaza_Rock.png"
    ),
    Item(
        name = "Mossy Rock and Trunk from the Forest of Valor",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d5/Mossy_Rock_and_Trunk_from_the_Forest_of_Valor.png"
    ),
    Item(
        name = "Mossy Sunlit Plateau Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Mossy_Sunlit_Plateau_Rock.png"
    ),
    Item(
        name = "Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/0/0b/Rock.png"
    ),
    Item(
        name = "Small Dazzle Beach Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/68/Small_Dazzle_Beach_Rock.png"
    ),
    Item(
        name = "Small Mossy Forest of Valor Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/ac/Small_Mossy_Forest_of_Valor_Rock.png"
    ),
    Item(
        name = "Small Mossy Forgotten Lands Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/2d/Small_Mossy_Forgotten_Lands_Rock.png"
    ),
    Item(
        name = "Small Mossy Glade of Trust Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/a/a1/Small_Mossy_Glade_of_Trust_Rock.png"
    ),
    Item(
        name = "Small Mossy Peaceful Meadow Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/22/Small_Mossy_Peaceful_Meadow_Rock.png"
    ),
    Item(
        name = "Small Mossy Sunlit Plateau Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/Small_Mossy_Sunlit_Plateau_Rock.png"
    ),
    Item(
        name = "Small Plaza Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/63/Small_Plaza_Rock.png"
    ),
    Item(
        name = "Small Dazzle Beach Stone Cluster",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/67/Small_Dazzle_Beach_Stone_Cluster.png"
    ),
    Item(
        name = "Small Forest of Valor Stone Cluster",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f3/Small_Forest_of_Valor_Stone_Cluster.png"
    ),
    Item(
        name = "Small Forgotten Lands Stone Cluster",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/91/Small_Forgotten_Lands_Stone_Cluster.png"
    ),
    Item(
        name = "Small Glade of Trust Stone Cluster",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9d/Small_Glade_of_Trust_Stone_Cluster.png"
    ),
    Item(
        name = "Small Peaceful Meadow Stone Cluster",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/9e/Small_Peaceful_Meadow_Stone_Cluster.png"
    ),
    Item(
        name = "Small Plaza Stone Cluster",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/32/Small_Plaza_Stone_Cluster.png"
    ),
    Item(
        name = "Small Snowy Frosted Heights Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/3e/Small_Snowy_Frosted_Heights_Rock.png"
    ),
    Item(
        name = "Small Snowy Frosted Heights Stone Cluster",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/20/Small_Snowy_Frosted_Heights_Stone_Cluster.png"
    ),
    Item(
        name = "Small Sunlit Plateau Stone Cluster",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e0/Small_Sunlit_Plateau_Stone_Cluster.png"
    ),
    Item(
        name = "Snowy Frosted Heights Rock",
        imageUrl = "https://dreamlightvalleywiki.com//images/6/61/Snowy_Frosted_Heights_Rock.png"
    ),
    Item(
        name = "Snowy Frosted Heights Rock with Branches",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1a/Snowy_Frosted_Heights_Rock_with_Branches.png"
    ),
    Item(
        name = "Tropical Greenery",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/bd/Tropical_Greenery.png"
    ),
    Item(
        name = "Asphalt",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d7/Asphalt.png"
    ),
    Item(
        name = "Brick Road",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/92/Brick_Road.png"
    ),
    Item(
        name = "Gem & Opal Road",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d5/Gem_%26_Opal_Road.png"
    ),
    Item(
        name = "Gold & Opal Road",
        imageUrl = "https://dreamlightvalleywiki.com//images/4/45/Gold_%26_Opal_Road.png"
    ),
    Item(
        name = "Golden Brick Road",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/21/Golden_Brick_Road.png"
    ),
    Item(
        name = "Leaf-Strewn Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/f/f2/Leaf-Strewn_Path.png"
    ),
    Item(
        name = "Loose Gravel Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/d/d4/Loose_Gravel_Path.png"
    ),
    Item(
        name = "Muddy Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e6/Muddy_Path.png"
    ),
    Item(
        name = "Natural Rock Path",
        imageUrl = "https://dreamlightvalleywiki.com//images/2/28/Natural_Rock_Path.png"
    ),
    Item(
        name = "Sinister Brick Road",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/19/Sinister_Brick_Road.png"
    ),
    Item(
        name = "Snowy Brick Road",
        imageUrl = "https://dreamlightvalleywiki.com//images/9/96/Snowy_Brick_Road.png"
    ),
    Item(
        name = "Sun-Baked Earthen Road",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c1/Sun-Baked_Earthen_Road.png"
    ),
    Item(
        name = "Dark Wire Mesh Fence",
        imageUrl = "https://dreamlightvalleywiki.com//images/5/5a/Dark_Wire_Mesh_Fence.png"
    ),
    Item(
        name = "Dark Wood Fence",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/ba/Dark_Wood_Fence.png"
    ),
    Item(
        name = "Green Bamboo Fence",
        imageUrl = "https://dreamlightvalleywiki.com//images/1/1d/Green_Bamboo_Fence.png"
    ),
    Item(
        name = "Iron Spike and Brick Fence",
        imageUrl = "https://dreamlightvalleywiki.com//images/3/37/Iron_Spike_and_Brick_Fence.png"
    ),
    Item(
        name = "Metal Spike Fence",
        imageUrl = "https://dreamlightvalleywiki.com//images/e/e7/Metal_Spike_Fence.png"
    ),
    Item(
        name = "White Bamboo Fence",
        imageUrl = "https://dreamlightvalleywiki.com//images/b/b4/White_Bamboo_Fence.png"
    ),
    Item(
        name = "Wire Mesh Fence",
        imageUrl = "https://dreamlightvalleywiki.com//images/c/c0/Wire_Mesh_Fence.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/12/Dreamlight_Valley_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/30/Dreamlight_Valley_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/ad/Dreamlight_Valley_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2b/Dreamlight_Valley_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c3/Dreamlight_Valley_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/ca/Dreamlight_Valley_Memory_6.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/44/Dreamlight_Valley_Memory_16.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/1d/Dreamlight_Valley_Memory_8.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d3/Dreamlight_Valley_Memory_10.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/4b/Dreamlight_Valley_Memory_11.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f4/Dreamlight_Valley_Memory_12.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/83/Dreamlight_Valley_Memory_13.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3a/Dreamlight_Valley_Memory_14.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a8/Dreamlight_Valley_Memory_17.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a8/Dreamlight_Valley_Memory_15.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/57/WALL-E_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/33/WALL-E_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b6/WALL-E_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/07/WALL-E_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c1/WALL-E_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/08/Moana_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/59/Moana_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ef/Moana_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2b/Moana_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/46/Moana_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/4b/Ratatouille_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9a/Ratatouille_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c8/Ratatouille_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/99/Ratatouille_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a0/Ratatouille_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/18/Beauty_and_the_Beast_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c8/Beauty_and_the_Beast_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6e/Beauty_and_the_Beast_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e6/Beauty_and_the_Beast_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0c/Beauty_and_the_Beast_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3c/Wreck-It_Ralph_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b1/Wreck-It_Ralph_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e8/Wreck-It_Ralph_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/49/Wreck-It_Ralph_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/99/Wreck-It_Ralph_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/35/Cinderella_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f3/Cinderella_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d1/Cinderella_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/69/Cinderella_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7d/Cinderella_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3f/The_Lion_King_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e4/The_Lion_King_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6e/The_Lion_King_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/17/The_Lion_King_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c2/The_Lion_King_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/51/The_Little_Mermaid_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/04/The_Little_Mermaid_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/ac/The_Little_Mermaid_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d3/The_Little_Mermaid_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/8a/The_Little_Mermaid_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/35/Frozen_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/cd/Frozen_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6d/Frozen_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/29/Frozen_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9d/Frozen_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/8c/Tangled_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/84/Tangled_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c4/Tangled_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/45/Tangled_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7b/Tangled_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/2a/Monsters%2C_Inc._Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c8/Monsters%2C_Inc._Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/86/Monsters%2C_Inc._Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f1/Monsters%2C_Inc._Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c3/Monsters%2C_Inc._Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5b/Toy_Story_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/23/Toy_Story_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/21/Toy_Story_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/da/Toy_Story_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a3/Toy_Story_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a7/Mickey_%26_Friends_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ef/Mickey_%26_Friends_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/55/Mickey_%26_Friends_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/bb/Mickey_%26_Friends_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/16/Mickey_%26_Friends_Memory_5.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/77/The_Sword_in_the_Stone_Memory_1.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/bd/The_Sword_in_the_Stone_Memory_2.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b2/The_Sword_in_the_Stone_Memory_3.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d8/The_Sword_in_the_Stone_Memory_4.png"
    ),
    Item(
        name = "Memory",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0b/The_Sword_in_the_Stone_Memory_5.png"
    )

)
