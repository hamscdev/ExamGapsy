package com.hamscdev.examgapsy.data.model

import com.google.gson.annotations.SerializedName
data class ResponseService(
    @SerializedName("item")
    var item: Item
)

data class Item(
    @SerializedName("props")
    var props: Props
)

data class Props(
    @SerializedName("pageProps")
    var pageProps: PageProps
)

data class PageProps(
    @SerializedName("initialData")
    var initialData: InitialData
)

data class InitialData(
    @SerializedName("searchResult")
    var searchResult: SearchResult
)

data class SearchResult(
    @SerializedName("itemStacks")
    var itemStacks: List<ItemStack>
)

data class ItemStack(
    @SerializedName("count")
    var count: Int, // 166183
    @SerializedName("items")
    var items: List<ItemX>,
    @SerializedName("layoutEnum")
    var layoutEnum: String, // GRID
    @SerializedName("meta")
    var meta: Meta,
    @SerializedName("queryUsedForSearchResults")
    var queryUsedForSearchResults: Any?, // null
    @SerializedName("title")
    var title: String, // Results for "sony"
    @SerializedName("titleKey")
    var titleKey: Any?, // null
    @SerializedName("totalItemCountDisplay")
    var totalItemCountDisplay: String // (1000+)
)

data class ItemX(
    @SerializedName("adUuid")
    var adUuid: Any?, // null
    @SerializedName("annualEvent")
    var annualEvent: Boolean?, // false
    @SerializedName("annualEventV2")
    var annualEventV2: Boolean?, // false
    @SerializedName("arExperiences")
    var arExperiences: ArExperiences?,
    @SerializedName("aspectInfo")
    var aspectInfo: AspectInfo?,
    @SerializedName("availabilityStatusDisplayValue")
    var availabilityStatusDisplayValue: String?, // In stock
    @SerializedName("availabilityStatusV2")
    var availabilityStatusV2: AvailabilityStatusV2?,
    @SerializedName("averageRating")
    var averageRating: Double?, // 4.6
    @SerializedName("badge")
    var badge: Badge?,
    @SerializedName("badges")
    var badges: Badges?,
    @SerializedName("buyBoxSuppression")
    var buyBoxSuppression: Boolean?, // false
    @SerializedName("canAddToCart")
    var canAddToCart: Boolean?, // true
    @SerializedName("canonicalUrl")
    var canonicalUrl: String?, // /ip/Sony-65-Class-BRAVIA-XR-X90K-4K-HDR-Full-Array-LED-with-Smart-Google-TV-XR65X90K-2022-Model/816556308
    @SerializedName("category")
    var category: Category?,
    @SerializedName("checkStoreAvailabilityATC")
    var checkStoreAvailabilityATC: Boolean?, // false
    @SerializedName("classType")
    var classType: String?, // REGULAR
    @SerializedName("description")
    var description: String?,
    @SerializedName("displayName")
    var displayName: String?, // options
    @SerializedName("earlyAccessEvent")
    var earlyAccessEvent: Boolean?, // false
    @SerializedName("esrb")
    var esrb: String?, // EVERYONE
    @SerializedName("eventAttributes")
    var eventAttributes: EventAttributes?,
    @SerializedName("externalInfo")
    var externalInfo: Any?, // null
    @SerializedName("externalInfoUrl")
    var externalInfoUrl: String?,
    @SerializedName("flag")
    var flag: String?,
    @SerializedName("fulfillmentBadgeGroups")
    var fulfillmentBadgeGroups: List<FulfillmentBadgeGroup>?,
    @SerializedName("fulfillmentBadges")
    var fulfillmentBadges: List<Any>?,
    @SerializedName("fulfillmentIcon")
    var fulfillmentIcon: FulfillmentIcon?,
    @SerializedName("fulfillmentSpeed")
    var fulfillmentSpeed: List<String>?,
    @SerializedName("fulfillmentSummary")
    var fulfillmentSummary: List<FulfillmentSummary>?,
    @SerializedName("fulfillmentTitle")
    var fulfillmentTitle: String?, // title_shipToHome_not_available
    @SerializedName("fulfillmentType")
    var fulfillmentType: String?, // MARKETPLACE
    @SerializedName("groupMetaData")
    var groupMetaData: GroupMetaData?,
    @SerializedName("hasCarePlans")
    var hasCarePlans: Boolean?, // true
    @SerializedName("hasVideo")
    var hasVideo: Any?, // null
    @SerializedName("id")
    var id: String?, // 3UNIXDA6GWVQ
    @SerializedName("image")
    var image: String?, // https://i5.walmartimages.com/seo/Sony-65-Class-BRAVIA-XR-X90K-4K-HDR-Full-Array-LED-with-Smart-Google-TV-XR65X90K-2022-Model_821df545-378c-4edb-897a-0a6e96cc2a10.51cb353cf6da5fd2526b20d3aff6869c.jpeg?odnHeight=180&odnWidth=180&odnBg=FFFFFF
    @SerializedName("imageID")
    var imageID: String?, // 24BD16B74A494F6FB1C146EBAF33F604
    @SerializedName("imageInfo")
    var imageInfo: ImageInfo?,
    @SerializedName("imageName")
    var imageName: String?, // Sony-65-Class-BRAVIA-XR-X90K-4K-HDR-Full-Array-LED-with-Smart-Google-TV-XR65X90K-2022-Model_821df545-378c-4edb-897a-0a6e96cc2a10.51cb353cf6da5fd2526b20d3aff6869c.jpeg
    @SerializedName("imageSize")
    var imageSize: String?, // 290-392
    @SerializedName("isAtfMarker")
    var isAtfMarker: Boolean?, // false
    @SerializedName("isEarlyAccessItem")
    var isEarlyAccessItem: Boolean?, // false
    @SerializedName("isOutOfStock")
    var isOutOfStock: Boolean?, // false
    @SerializedName("isPreowned")
    var isPreowned: Any?, // null
    @SerializedName("isSponsoredFlag")
    var isSponsoredFlag: Boolean?, // true
    @SerializedName("isVariantTypeSwatch")
    var isVariantTypeSwatch: Boolean?, // false
    @SerializedName("itemType")
    var itemType: Any?, // null
    @SerializedName("lazy")
    var lazy: String?, // 700
    @SerializedName("moduleInfo")
    var moduleInfo: Any?, // null
    @SerializedName("moduleLocation")
    var moduleLocation: String?, // middle
    @SerializedName("name")
    var name: String?, // Sony 65” Class BRAVIA XR X90K 4K HDR Full Array LED with Smart Google TV XR65X90K- 2022 Model
    @SerializedName("newConditionProductId")
    var newConditionProductId: Any?, // null
    @SerializedName("numberOfReviews")
    var numberOfReviews: Int?, // 190
    @SerializedName("offerId")
    var offerId: String?, // DA48609BE39D4ADBB624BC07A444FAA9
    @SerializedName("pac")
    var pac: Any?, // null
    @SerializedName("petRx")
    var petRx: PetRx?,
    @SerializedName("pglsCondition")
    var pglsCondition: Any?, // null
    @SerializedName("preOrder")
    var preOrder: PreOrder?,
    @SerializedName("price")
    var price: Int?, // 1298
    @SerializedName("priceFlip")
    var priceFlip: Boolean?, // false
    @SerializedName("priceInfo")
    var priceInfo: PriceInfo?,
    @SerializedName("productLocation")
    var productLocation: Any?, // null
    @SerializedName("promoDiscount")
    var promoDiscount: Any?, // null
    @SerializedName("quickShop")
    var quickShop: Any?, // null
    @SerializedName("quickShopCTALabel")
    var quickShopCTALabel: Any?, // null
    @SerializedName("rating")
    var rating: Rating?,
    @SerializedName("rewards")
    var rewards: Any?, // null
    @SerializedName("salesUnit")
    var salesUnit: String?, // EACH
    @SerializedName("salesUnitType")
    var salesUnitType: String?, // EACH
    @SerializedName("seeShippingEligibility")
    var seeShippingEligibility: Boolean?, // false
    @SerializedName("sellerId")
    var sellerId: String?, // 6FD4D0E074FB48BC916993E753B4D6C0
    @SerializedName("sellerName")
    var sellerName: String?, // Walts TV
    @SerializedName("shortDescription")
    var shortDescription: String?, // <li>Industry-leading noise canceling</li><a href="https://dealersource.sel.sony.com/ds/s/product/pim-9775?owasp_csrftoken=c298-khgv-dnq7-o0o6-8f7c-cf33-n55o-itud#footnote_1">1</a></sup>
    @SerializedName("shouldLazyLoad")
    var shouldLazyLoad: Boolean?, // false
    @SerializedName("showAtc")
    var showAtc: Boolean?, // true
    @SerializedName("showBuyNow")
    var showBuyNow: Boolean?, // false
    @SerializedName("showExploreOtherConditionsCTA")
    var showExploreOtherConditionsCTA: Any?, // null
    @SerializedName("showOptions")
    var showOptions: Boolean?, // false
    @SerializedName("similarItems")
    var similarItems: Boolean?, // false
    @SerializedName("snapEligible")
    var snapEligible: Boolean?, // false
    @SerializedName("specialBuy")
    var specialBuy: Boolean?, // false
    @SerializedName("sponsoredProduct")
    var sponsoredProduct: SponsoredProduct?,
    @SerializedName("subscription")
    var subscription: Subscription?,
    @SerializedName("topResult")
    var topResult: Any?, // null
    @SerializedName("type")
    var type: String, // REGULAR
    @SerializedName("__typename")
    var typename: String, // Product
    @SerializedName("usItemId")
    var usItemId: String?, // 816556308
    @SerializedName("variantCriteria")
    var variantCriteria: List<VariantCriteria>?,
    @SerializedName("variantList")
    var variantList: List<VariantX>?,
    @SerializedName("vision")
    var vision: Vision?,
    @SerializedName("weightIncrement")
    var weightIncrement: Int? // 1
)

data class Meta(
    @SerializedName("adsBeacon")
    var adsBeacon: AdsBeacon,
    @SerializedName("borderColor")
    var borderColor: Any?, // null
    @SerializedName("iconUrl")
    var iconUrl: Any?, // null
    @SerializedName("isPartialResult")
    var isPartialResult: Boolean, // false
    @SerializedName("layoutEnum")
    var layoutEnum: String, // GRID
    @SerializedName("query")
    var query: String, // sony
    @SerializedName("queryUsedForSearchResults")
    var queryUsedForSearchResults: Any?, // null
    @SerializedName("spBeaconInfo")
    var spBeaconInfo: Any?, // null
    @SerializedName("stackId")
    var stackId: Int, // 0
    @SerializedName("stackName")
    var stackName: Any?, // null
    @SerializedName("stackType")
    var stackType: String, // DEFAULT
    @SerializedName("subTitle")
    var subTitle: Any?, // null
    @SerializedName("title")
    var title: String, // Results for "sony"
    @SerializedName("titleKey")
    var titleKey: Any?, // null
    @SerializedName("totalItemCount")
    var totalItemCount: Int, // 166183
    @SerializedName("totalItemCountDisplay")
    var totalItemCountDisplay: String // (1000+)
)

data class ArExperiences(
    @SerializedName("isARHome")
    var isARHome: Boolean, // false
    @SerializedName("isAROptical")
    var isAROptical: Boolean, // false
    @SerializedName("isZeekit")
    var isZeekit: Boolean // false
)

data class AspectInfo(
    @SerializedName("header")
    var header: Any?, // null
    @SerializedName("id")
    var id: Any?, // null
    @SerializedName("name")
    var name: Any?, // null
    @SerializedName("snippet")
    var snippet: Any? // null
)

data class AvailabilityStatusV2(
    @SerializedName("display")
    var display: String, // In stock
    @SerializedName("value")
    var value: String // IN_STOCK
)

data class Badge(
    @SerializedName("bundleId")
    var bundleId: String?,
    @SerializedName("id")
    var id: String,
    @SerializedName("key")
    var key: String,
    @SerializedName("styleId")
    var styleId: Any?, // null
    @SerializedName("text")
    var text: String,
    @SerializedName("type")
    var type: String,
    @SerializedName("__typename")
    var typename: String? // BaseBadge
)

data class Badges(
    @SerializedName("flags")
    var flags: List<Flag>?,
    @SerializedName("groups")
    var groups: List<Group>,
    @SerializedName("tags")
    var tags: List<Tag>
)

data class Category(
    @SerializedName("path")
    var path: Any? // null
)

data class EventAttributes(
    @SerializedName("priceFlip")
    var priceFlip: Boolean, // false
    @SerializedName("specialBuy")
    var specialBuy: Boolean // false
)

data class FulfillmentBadgeGroup(
    @SerializedName("className")
    var className: String, // dark-gray
    @SerializedName("isSlaTextBold")
    var isSlaTextBold: Boolean, // true
    @SerializedName("slaText")
    var slaText: String, // in 3+ days
    @SerializedName("templates")
    var templates: Any?, // null
    @SerializedName("text")
    var text: String // Free shipping, arrives
)

data class FulfillmentIcon(
    @SerializedName("key")
    var key: String, // SAVE_WITH_W_PLUS
    @SerializedName("label")
    var label: String // Save with
)

data class FulfillmentSummary(
    @SerializedName("deliveryDate")
    var deliveryDate: String?, // 2023-08-19T21:00:00.000Z
    @SerializedName("storeId")
    var storeId: String // 0
)

data class GroupMetaData(
    @SerializedName("groupComponents")
    var groupComponents: Any?, // null
    @SerializedName("groupSubType")
    var groupSubType: Any?, // null
    @SerializedName("groupType")
    var groupType: Any?, // null
    @SerializedName("numberOfComponents")
    var numberOfComponents: Int // 0
)

data class ImageInfo(
    @SerializedName("id")
    var id: String, // 24BD16B74A494F6FB1C146EBAF33F604
    @SerializedName("name")
    var name: String, // Sony-65-Class-BRAVIA-XR-X90K-4K-HDR-Full-Array-LED-with-Smart-Google-TV-XR65X90K-2022-Model_821df545-378c-4edb-897a-0a6e96cc2a10.51cb353cf6da5fd2526b20d3aff6869c.jpeg
    @SerializedName("size")
    var size: String, // 290-392
    @SerializedName("thumbnailUrl")
    var thumbnailUrl: String // https://i5.walmartimages.com/seo/Sony-65-Class-BRAVIA-XR-X90K-4K-HDR-Full-Array-LED-with-Smart-Google-TV-XR65X90K-2022-Model_821df545-378c-4edb-897a-0a6e96cc2a10.51cb353cf6da5fd2526b20d3aff6869c.jpeg?odnHeight=180&odnWidth=180&odnBg=FFFFFF
)

data class PetRx(
    @SerializedName("eligible")
    var eligible: Boolean, // false
    @SerializedName("singleDispense")
    var singleDispense: Any? // null
)

data class PreOrder(
    @SerializedName("isPreOrder")
    var isPreOrder: Boolean, // false
    @SerializedName("streetDate")
    var streetDate: Any?, // null
    @SerializedName("streetDateDisplayable")
    var streetDateDisplayable: Any?, // null
    @SerializedName("streetDateType")
    var streetDateType: Any? // null
)

data class PriceInfo(
    @SerializedName("eaPricingPreText")
    var eaPricingPreText: String,
    @SerializedName("eaPricingText")
    var eaPricingText: String,
    @SerializedName("finalCostByWeight")
    var finalCostByWeight: Boolean, // false
    @SerializedName("itemPrice")
    var itemPrice: String,
    @SerializedName("linePrice")
    var linePrice: String, // $1,298.00
    @SerializedName("linePriceDisplay")
    var linePriceDisplay: String, // $1,298.00
    @SerializedName("memberPriceString")
    var memberPriceString: String,
    @SerializedName("minPrice")
    var minPrice: Double, // 249.99
    @SerializedName("minPriceForVariant")
    var minPriceForVariant: String,
    @SerializedName("priceDisplayCondition")
    var priceDisplayCondition: String,
    @SerializedName("priceRangeString")
    var priceRangeString: String,
    @SerializedName("savings")
    var savings: String,
    @SerializedName("shipPrice")
    var shipPrice: String,
    @SerializedName("submapType")
    var submapType: String,
    @SerializedName("subscriptionDualPrice")
    var subscriptionDualPrice: Any?, // null
    @SerializedName("subscriptionPercentage")
    var subscriptionPercentage: Any?, // null
    @SerializedName("subscriptionPrice")
    var subscriptionPrice: String,
    @SerializedName("subscriptionString")
    var subscriptionString: String,
    @SerializedName("unitPrice")
    var unitPrice: String,
    @SerializedName("wasPrice")
    var wasPrice: String
)

data class Rating(
    @SerializedName("averageRating")
    var averageRating: Int, // 4
    @SerializedName("numberOfReviews")
    var numberOfReviews: Int // 190
)

data class SponsoredProduct(
    @SerializedName("clickBeacon")
    var clickBeacon: String, // https://wrd.walmart.com/track?adUid=1cc123e1-a5d4-435e-8288-4b6af663ac0d&pgId=sony&spQs=j7p0c7Yjpg7yFgJDMIiN-iCtL21Ue5YeL9dfPAYe1QbNGJdUCU8GDhpLm4Ox2KsSTJh0G3YS5-hTuwMMnTJbt-FyMBvobzKEqwZoyIat-k0ee28t8wYZLuCmRAkFnB7v0XGfzAkQ6tfp6terKWRu--kU38mVaMzZvWWHKAbShxXENFCZe4YjcfM9I3H8R0HkVou3_w1O7zcNkYR_bljlY5J3mITg_xivqsJYeFpsNJI&storeId=3371&pt=search&mloc=sp-search-middle&bkt=ace_2908%7Ccoldstart_off%7Csearch_default&pltfm=desktop&rdf=0&plmt=__plmt__&eventST=__eventST__&pos=__pos__&bt=__bt__&tax=3944_133251_1095191_1231498_1231501&et=head_torso&st=torso
    @SerializedName("spQs")
    var spQs: String, // j7p0c7Yjpg7yFgJDMIiN-iCtL21Ue5YeL9dfPAYe1QbNGJdUCU8GDhpLm4Ox2KsSTJh0G3YS5-hTuwMMnTJbt-FyMBvobzKEqwZoyIat-k0ee28t8wYZLuCmRAkFnB7v0XGfzAkQ6tfp6terKWRu--kU38mVaMzZvWWHKAbShxXENFCZe4YjcfM9I3H8R0HkVou3_w1O7zcNkYR_bljlY5J3mITg_xivqsJYeFpsNJI
    @SerializedName("spTags")
    var spTags: Any?, // null
    @SerializedName("viewBeacon")
    var viewBeacon: Any? // null
)

data class Subscription(
    @SerializedName("subscriptionEligible")
    var subscriptionEligible: Boolean, // false
    @SerializedName("__typename")
    var typename: String // SubscriptionData
)

data class VariantCriteria(
    @SerializedName("displayName")
    var displayName: String, // options
    @SerializedName("id")
    var id: Any?, // null
    @SerializedName("isVariantTypeSwatch")
    var isVariantTypeSwatch: Boolean, // true
    @SerializedName("name")
    var name: String, // actual_color
    @SerializedName("type")
    var type: String, // LOCATOR
    @SerializedName("variantList")
    var variantList: List<Variant>
)

data class VariantX(
    @SerializedName("canonicalUrl")
    var canonicalUrl: String, // /ip/Sony-WH-1000XM4-Wireless-Noise-Canceling-Over-the-Ear-Headphones-with-Google-Assistant-Black/310157752?variantFieldId=actual_color
    @SerializedName("image")
    var image: String, // https://i5.walmartimages.com/asr/0dfeda7b-df98-488a-a190-67b54d2fb40d.2bc50af0f21a464edd51076af3c85e92.jpeg?odnHeight=180&odnWidth=180&odnBg=ffffff
    @SerializedName("name")
    var name: String, // Black
    @SerializedName("productId")
    var productId: String, // 58BYGX03ZG1X
    @SerializedName("swatchImageUrl")
    var swatchImageUrl: String, // https://i5.walmartimages.com/asr/6e2c8c45-3e2d-4b61-b7a6-a5185db074b2.70e88b98417e196a50fe7dc5895ec143.png?odnHeight=30&odnWidth=30&odnBg=ffffff
    @SerializedName("usItemId")
    var usItemId: String // 310157752
)

data class Vision(
    @SerializedName("ageGroup")
    var ageGroup: Any?, // null
    @SerializedName("visionCenterApproved")
    var visionCenterApproved: Boolean // false
)

data class Flag(
    @SerializedName("id")
    var id: String, // L1600
    @SerializedName("key")
    var key: String, // BESTSELLER
    @SerializedName("styleId")
    var styleId: Any?, // null
    @SerializedName("text")
    var text: String, // Best seller
    @SerializedName("type")
    var type: String, // LABEL
    @SerializedName("__typename")
    var typename: String // BaseBadge
)

data class Group(
    @SerializedName("members")
    var members: List<Member>,
    @SerializedName("name")
    var name: String, // fulfillment
    @SerializedName("__typename")
    var typename: String // UnifiedBadgeGroup
)

data class Tag(
    @SerializedName("key")
    var key: String, // SAVE_WITH_W_PLUS
    @SerializedName("text")
    var text: String, // Save with
    @SerializedName("type")
    var type: String, // ICON
    @SerializedName("__typename")
    var typename: String // BaseBadge
)

data class Member(
    @SerializedName("id")
    var id: String, // L1053
    @SerializedName("key")
    var key: String, // FF_SHIPPING
    @SerializedName("memberType")
    var memberType: String, // badge
    @SerializedName("rank")
    var rank: Int, // 1
    @SerializedName("slaText")
    var slaText: String, // in 3+ days
    @SerializedName("styleId")
    var styleId: String, // FF_STYLE
    @SerializedName("templates")
    var templates: Any?, // null
    @SerializedName("text")
    var text: String, // Free shipping, arrives
    @SerializedName("type")
    var type: String, // LABEL
    @SerializedName("__typename")
    var typename: String // BadgeGroupMember
)

data class Variant(
    @SerializedName("availabilityStatus")
    var availabilityStatus: String, // AVAILABLE
    @SerializedName("id")
    var id: Any?, // null
    @SerializedName("images")
    var images: List<String>,
    @SerializedName("name")
    var name: String, // Black
    @SerializedName("products")
    var products: List<String>,
    @SerializedName("rank")
    var rank: Int, // 10000000
    @SerializedName("selectedProduct")
    var selectedProduct: SelectedProduct,
    @SerializedName("swatchImageUrl")
    var swatchImageUrl: String // https://i5.walmartimages.com/asr/6e2c8c45-3e2d-4b61-b7a6-a5185db074b2.70e88b98417e196a50fe7dc5895ec143.png?odnHeight=30&odnWidth=30&odnBg=ffffff
)

data class SelectedProduct(
    @SerializedName("canonicalUrl")
    var canonicalUrl: String, // /ip/Sony-WH-1000XM4-Wireless-Noise-Canceling-Over-the-Ear-Headphones-with-Google-Assistant-Black/310157752
    @SerializedName("usItemId")
    var usItemId: String // 310157752
)

data class AdsBeacon(
    @SerializedName("adUuid")
    var adUuid: String, // 1cc123e1-a5d4-435e-8288-4b6af663ac0d
    @SerializedName("max_ads")
    var maxAds: Int, // 9
    @SerializedName("moduleInfo")
    var moduleInfo: String // {"adUuid":"1cc123e1-a5d4-435e-8288-4b6af663ac0d","facet":false,"intent":true,"affinity":"default","sorting":"best_match","bucketId":"ace_2908|coldstart_off|search_default","engagementTraffic":"head_torso","sessionTraffic":"torso"}
)