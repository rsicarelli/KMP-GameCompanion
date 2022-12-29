package app.dreamlightpal.list

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import app.dreamlightpal.list.ListComponent.ListState
import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@Stable
interface ListComponent {

    val state: StateFlow<ListState>

    @Immutable
    data class ListState(
        val collectionItems: List<CollectionListItem>,
    ) {

        @Immutable
        data class CollectionListItem(
            val localizedNameKey: String,
            val imageUrl: String,
        )
    }
}

internal class ListComponentHolder(
    componentContext: ComponentContext,
    onItemSelected: OnItemSelected,
) : ListComponent, ComponentContext by componentContext {

    private val _state = MutableStateFlow(ListState(collectionItems = Fake_Collections))
    override val state: StateFlow<ListState> = _state.asStateFlow()
}

val Fake_Collections = listOf(
    ListState.CollectionListItem(
        localizedNameKey = "Clay",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a2/Clay.png",
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Brick",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/58/Brick.png",
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Jubilant Topiary",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/25/Jubilant_Topiary.png",
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Gold Ingot",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/22/Gold_Ingot.png",
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Golden Brick Road",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/21/Golden_Brick_Road.png",
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Blue Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c9/Blue_Raven.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Brown Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/51/Brown_Raven.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Classic Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/bd/Classic_Raven.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Red Raven",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d4/Red_Raven.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Classic Fox",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/88/Classic_Fox.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Red Fox",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/21/Red_Fox.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Blue Raccoon",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7e/Blue_Raccoon.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Red Raccoon",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/31/Red_Raccoon.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Golden Crocodile",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/84/Golden_Crocodile.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Red Squirrel",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f9/Red_Squirrel.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Black Squirrel",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9e/Black_Squirrel.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Golden Sunbird",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/92/Golden_Sunbird.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Red Sunbird",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/fe/Red_Sunbird.png?20220918111052"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Shiny Garnet",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f1/Shiny_Garnet.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Ruby",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a9/Ruby.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Shiny Sapphire",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/74/Shiny_Sapphire.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Shiny Tourmaline",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/87/Shiny_Tourmaline.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Shiny Topaz",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/fc/Shiny_Topaz.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Vitalys Crystal",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d5/Vitalys_Crystal.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Alexandrite",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c9/Alexandrite.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Blue Zircon",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b2/Blue_Zircon.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Shiny Diamond",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/ea/Shiny_Diamond.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Shiny Amethyst",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/26/Shiny_Amethyst.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Purple Impatiens",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/73/Purple_Impatiens.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Purple Rising Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0b/Purple_Rising_Penstemon.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Red Falling Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3a/Red_Falling_Penstemon.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Red Nasturtium",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/74/Red_Nasturtium.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "White & Red Hydrangea",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/8e/White_%26_Red_Hydrangea.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "White Daisy",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/44/White_Daisy.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "White Marsh Milkweed",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/5f/White_Marsh_Milkweed.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Yellow Nasturtium",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/21/Yellow_Nasturtium.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Blue Passion Lily",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7a/Blue_Passion_Lily.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Blue Falling Penstemon",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/4d/Blue_Falling_Penstemon.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Black Passion Lily",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/23/Black_Passion_Lily.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Bell Pepper Puffs",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/ff/Bell_Pepper_Puffs.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Crackers",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d4/Crackers.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Crudités",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/26/Crudit%C3%A9s.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Salad",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/7e/Salad.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Pumpkin Puffs",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0e/Pumpkin_Puffs.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Seafood Appetizer",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f0/Seafood_Appetizer.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Seafood Platter",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/48/Seafood_Platter.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Soufflé",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e0/Souffl%C3%A9.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Basil Omelet",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/09/Basil_Omelet.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Cheesy Crispy Baked Cod",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/63/Cheesy_Crispy_Baked_Cod.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Fish Salad",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/8e/Fish_Salad.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Grilled Fish Entree",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a5/Grilled_Fish_Entree.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Gumbo",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/10/Gumbo.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Lemon Garlic Swordfish",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/33/Lemon_Garlic_Swordfish.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Mushroom Pizza",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e9/Mushroom_Pizza.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Ratatouille",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b0/Ratatouille.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Seared Rainbow Trout",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/20/Seared_Rainbow_Trout.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Simple Fried Perch",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b3/Simple_Fried_Perch.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Tekka Maki",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e6/Tekka_Maki.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "https://dreamlightvalleywiki.com/images/f/f5/Aurora%27s_Cake.png",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f5/Aurora%27s_Cake.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Banana Ice Cream",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/79/Banana_Ice_Cream.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Boba Tea",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/0a/Boba_Tea.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Lemon Sorbet",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d8/Lemon_Sorbet.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Wedding Cake",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/6f/Wedding_Cake.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Wonderland Cookies",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/37/Wonderland_Cookies.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Lenses of Shadows",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/03/Lenses_of_Shadows.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Green Woven Shorts",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/cb/Green_Woven_Shorts.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Straw Sunhat with Orange Band",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/4e/Straw_Sunhat_with_Orange_Band.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "White Checkered Chef Pants",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/89/White_Checkered_Chef_Pants.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Off-Shoulder Bag",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f1/Off-Shoulder_Bag.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Gold Leaf-Rimmed Watch",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/4e/Gold_Leaf-Rimmed_Watch.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Gold Cocorico Rings",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d7/Gold_Cocorico_Rings.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Ornate White Wristwatch",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/32/Ornate_White_Wristwatch.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Intricate Pink Floral Heels",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f5/Intricate_Pink_Floral_Heels.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Green Cropped Camo Hoodie",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/56/Green_Cropped_Camo_Hoodie.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Candy Racer Helmet",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/94/Candy_Racer_Helmet.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Blue Tech Bracelets",
        imageUrl = "https://dreamlightvalleywiki.com/images/8/89/Blue_Tech_Bracelets.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Pink Ita Bag",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/bf/Pink_Ita_Bag.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Gray Claw Top",
        imageUrl = "https://dreamlightvalleywiki.com/images/1/12/Gray_Claw_Top.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Silver and Purple Watch",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d4/Silver_and_Purple_Watch.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Shimmering Pink Scaled Pants",
        imageUrl = "https://dreamlightvalleywiki.com/images/3/3c/Shimmering_Pink_Scaled_Pants.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Gray Button-Up Vest",
        imageUrl = "https://dreamlightvalleywiki.com/images/e/e4/Gray_Button-Up_Vest.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Green Star Command Turtleneck",
        imageUrl = "https://dreamlightvalleywiki.com/images/6/62/Green_Star_Command_Turtleneck.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Space Shoes",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/d7/Space_Shoes.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Woody's Pull String",
        imageUrl = "https://dreamlightvalleywiki.com/images/c/c4/Woody%27s_Pull_String.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Space Ranger Helmet",
        imageUrl = "https://dreamlightvalleywiki.com/images/9/9f/Space_Ranger_Helmet.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Thorny Wings",
        imageUrl = "https://dreamlightvalleywiki.com/images/d/db/Thorny_Wings.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "White Knitted Winter Gloves",
        imageUrl = "https://dreamlightvalleywiki.com/images/7/70/White_Knitted_Winter_Gloves.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "White Minnie Ears",
        imageUrl = "https://dreamlightvalleywiki.com/images/0/00/White_Minnie_Ears.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Dark Tropical Leaf Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/bc/Dark_Tropical_Leaf_Wallpaper.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Pink French Castle Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a9/Pink_French_Castle_Wallpaper.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Blue Gold-Embossed Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/b/b4/Blue_Gold-Embossed_Wall.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Chocolate-Covered Strawberry-Chocolate Cake Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/4/44/Chocolate-Covered_Strawberry-Chocolate_Cake_Wall.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Arendelle Library Wall",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/55/Arendelle_Library_Wall.png"
    ),
    ListState.CollectionListItem(
        localizedNameKey = "Cluster of Funky Doors Wallpaper",
        imageUrl = "https://dreamlightvalleywiki.com/images/f/f6/Cluster_of_Funky_Doors_Wallpaper.png"
    )
)
