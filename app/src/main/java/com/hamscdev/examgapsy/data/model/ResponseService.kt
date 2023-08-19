package com.hamscdev.examgapsy.data.model
import com.google.gson.annotations.SerializedName


data class ResponseService(
    @SerializedName("domainCode")
    var domainCode: String, // com
    @SerializedName("item")
    var item: Item,
    @SerializedName("keyword")
    var keyword: String, // computer
    @SerializedName("responseMessage")
    var responseMessage: String, // Product successfully found!
    @SerializedName("responseStatus")
    var responseStatus: String, // PRODUCT_FOUND_RESPONSE
    @SerializedName("sortStrategy")
    var sortStrategy: String // best_match
)

data class Item(
    @SerializedName("appGip")
    var appGip: Boolean, // true
    @SerializedName("assetPrefix")
    var assetPrefix: String, // https://i5.walmartimages.com/dfw/63fd9f59-4dec/4554fe87-3c60-4abb-8839-7753b6cfbb2e/v2/en-US
    @SerializedName("buildId")
    var buildId: String, // production_20230817T190812187Z-en-US
    @SerializedName("customServer")
    var customServer: Boolean, // true
    @SerializedName("defaultLocale")
    var defaultLocale: String, // en
    @SerializedName("dynamicIds")
    var dynamicIds: List<String>,
    @SerializedName("gip")
    var gip: Boolean, // true
    @SerializedName("isFallback")
    var isFallback: Boolean, // false
    @SerializedName("locale")
    var locale: String, // en
    @SerializedName("locales")
    var locales: List<String>,
    @SerializedName("page")
    var page: String, // /search
    @SerializedName("props")
    var props: Props,
    @SerializedName("query")
    var query: Query,
    @SerializedName("runtimeConfig")
    var runtimeConfig: RuntimeConfig,
    @SerializedName("scriptLoader")
    var scriptLoader: List<Any>
)

data class Props(
    @SerializedName("pageProps")
    var pageProps: PageProps
)

data class Query(
    @SerializedName("page")
    var page: String, // 1
    @SerializedName("query")
    var query: String, // computer
    @SerializedName("sort")
    var sort: String // best_match
)

data class RuntimeConfig(
    @SerializedName("ads")
    var ads: AdsX,
    @SerializedName("appSha")
    var appSha: String, // 267988ea3a649f353410389be71fc08e30f39931
    @SerializedName("appVersion")
    var appVersion: String, // main-1.94.0-e1296d-0817T1858
    @SerializedName("dataCenter")
    var dataCenter: String, // wus2
    @SerializedName("enableLatencyTrace")
    var enableLatencyTrace: Boolean, // true
    @SerializedName("endpointMappings")
    var endpointMappings: EndpointMappings,
    @SerializedName("googleMaps")
    var googleMaps: GoogleMaps,
    @SerializedName("identity")
    var identity: Identity,
    @SerializedName("isDev")
    var isDev: Boolean, // false
    @SerializedName("membershipConfig")
    var membershipConfig: MembershipConfig,
    @SerializedName("moatIvt")
    var moatIvt: String, // https://www.walmart.com/swag/v2/ip-rd
    @SerializedName("mock")
    var mock: Boolean, // true
    @SerializedName("mockURL")
    var mockURL: String, // http://mock-backend.dev.walmart.com/
    @SerializedName("nxApplicationName")
    var nxApplicationName: String, // US-JOURNEY
    @SerializedName("paymentsChooserPageUrl")
    var paymentsChooserPageUrl: String, // https://wallet.walmart.com/payments/chooser
    @SerializedName("paymentsPageUrl")
    var paymentsPageUrl: String, // https://wallet.walmart.com/payments?wv=main
    @SerializedName("perimeterX")
    var perimeterX: PerimeterX,
    @SerializedName("profile")
    var profile: String, // production
    @SerializedName("pulseBeacon")
    var pulseBeacon: PulseBeacon,
    @SerializedName("queryContext")
    var queryContext: QueryContext,
    @SerializedName("rewardsTravelUrl")
    var rewardsTravelUrl: String, // https://walmartplustravel.com/trips
    @SerializedName("tenant")
    var tenant: String, // WM_GLASS
    @SerializedName("tenantV2")
    var tenantV2: TenantV2,
    @SerializedName("threatMetrix")
    var threatMetrix: ThreatMetrix,
    @SerializedName("tmxOrgId")
    var tmxOrgId: String, // hgy2n0ks
    @SerializedName("vid")
    var vid: String, // oaoh
    @SerializedName("walletPageUrl")
    var walletPageUrl: String // https://wallet.walmart.com/payments/wallet
)

data class PageProps(
    @SerializedName("adSessionId")
    var adSessionId: String, // d4e3889576829cb598d86aefb262ac2e
    @SerializedName("bootstrapData")
    var bootstrapData: BootstrapData,
    @SerializedName("dehydratedSearchCv")
    var dehydratedSearchCv: DehydratedSearchCv,
    @SerializedName("enableGqlCsrRedirect")
    var enableGqlCsrRedirect: Boolean, // true
    @SerializedName("excludeBeacon")
    var excludeBeacon: Boolean, // false
    @SerializedName("initialData")
    var initialData: InitialData,
    @SerializedName("initialSearchQueryVariables")
    var initialSearchQueryVariables: InitialSearchQueryVariables,
    @SerializedName("isCaching")
    var isCaching: Boolean, // false
    @SerializedName("isNextPublicMocksEnabled")
    var isNextPublicMocksEnabled: Boolean, // false
    @SerializedName("isomorphicSessionId")
    var isomorphicSessionId: String, // EOxSss3m8Cks7B9HLL6uC
    @SerializedName("nonce")
    var nonce: String, // wU13iuDqb3XmEl0J
    @SerializedName("persistedQueriesConfig")
    var persistedQueriesConfig: PersistedQueriesConfig,
    @SerializedName("psych")
    var psych: Psych,
    @SerializedName("queryContextCacheId")
    var queryContextCacheId: Int, // 4199
    @SerializedName("trace")
    var trace: Trace
)

data class BootstrapData(
    @SerializedName("account")
    var account: Account,
    @SerializedName("cv")
    var cv: Cv,
    @SerializedName("footer")
    var footer: FooterX,
    @SerializedName("header")
    var header: HeaderX,
    @SerializedName("membership")
    var membership: Membership
)

data class DehydratedSearchCv(
    @SerializedName("enableLCPHighFetchPriority")
    var enableLCPHighFetchPriority: Boolean, // true
    @SerializedName("enableLCPSingleImagePrefetch")
    var enableLCPSingleImagePrefetch: Boolean // false
)

data class InitialData(
    @SerializedName("contentLayout")
    var contentLayout: ContentLayoutXX,
    @SerializedName("layoutContainerData")
    var layoutContainerData: LayoutContainerData,
    @SerializedName("moduleDataByZone")
    var moduleDataByZone: ModuleDataByZone,
    @SerializedName("pageMetadata")
    var pageMetadata: PageMetadataX,
    @SerializedName("searchResult")
    var searchResult: SearchResult
)

data class InitialSearchQueryVariables(
    @SerializedName("additionalQueryParams")
    var additionalQueryParams: AdditionalQueryParams,
    @SerializedName("beShelfId")
    var beShelfId: String,
    @SerializedName("catId")
    var catId: String,
    @SerializedName("dealsId")
    var dealsId: String,
    @SerializedName("enableFacetCount")
    var enableFacetCount: Boolean, // true
    @SerializedName("enableFashionTopNav")
    var enableFashionTopNav: Boolean, // false
    @SerializedName("enableFlattenedFitment")
    var enableFlattenedFitment: Boolean, // true
    @SerializedName("enableMultiSave")
    var enableMultiSave: Boolean, // false
    @SerializedName("enablePortableFacets")
    var enablePortableFacets: Boolean, // true
    @SerializedName("enableRelatedSearches")
    var enableRelatedSearches: Boolean, // true
    @SerializedName("facet")
    var facet: String,
    @SerializedName("fetchDac")
    var fetchDac: Boolean, // false
    @SerializedName("fetchGallery")
    var fetchGallery: Boolean, // false
    @SerializedName("fetchMarquee")
    var fetchMarquee: Boolean, // true
    @SerializedName("fetchSbaTop")
    var fetchSbaTop: Boolean, // true
    @SerializedName("fetchSkyline")
    var fetchSkyline: Boolean, // true
    @SerializedName("fitmentFieldParams")
    var fitmentFieldParams: FitmentFieldParams,
    @SerializedName("fitmentSearchParams")
    var fitmentSearchParams: FitmentSearchParams,
    @SerializedName("id")
    var id: String,
    @SerializedName("limit")
    var limit: Int, // 40
    @SerializedName("max_price")
    var maxPrice: String,
    @SerializedName("min_price")
    var minPrice: String,
    @SerializedName("module_search")
    var moduleSearch: String,
    @SerializedName("page")
    var page: Int, // 1
    @SerializedName("prg")
    var prg: String, // desktop
    @SerializedName("ps")
    var ps: Int, // 40
    @SerializedName("ptss")
    var ptss: String,
    @SerializedName("query")
    var query: String, // computer
    @SerializedName("rawFacet")
    var rawFacet: String,
    @SerializedName("recall_set")
    var recallSet: String,
    @SerializedName("searchArgs")
    var searchArgs: SearchArgsX,
    @SerializedName("seoPath")
    var seoPath: String,
    @SerializedName("sort")
    var sort: String, // best_match
    @SerializedName("storeSlotBooked")
    var storeSlotBooked: String,
    @SerializedName("tenant")
    var tenant: String, // WM_GLASS
    @SerializedName("trsp")
    var trsp: String
)

data class PersistedQueriesConfig(
    @SerializedName("allowList")
    var allowList: List<String>,
    @SerializedName("blackList")
    var blackList: List<String>,
    @SerializedName("enableAllowList")
    var enableAllowList: Boolean, // false
    @SerializedName("enablePersistedQueries")
    var enablePersistedQueries: Boolean // true
)

data class Psych(
    @SerializedName("isBot")
    var isBot: Boolean, // false
    @SerializedName("isDesktop")
    var isDesktop: Boolean, // true
    @SerializedName("isMobile")
    var isMobile: Boolean, // false
    @SerializedName("previousAppVersion")
    var previousAppVersion: String, // main-1.94.0-0d575c-0814T0405
    @SerializedName("trafficType")
    var trafficType: String, // customer
    @SerializedName("visitType")
    var visitType: String // rv_u
)

data class Trace(
    @SerializedName("spanId")
    var spanId: String, // ce912e77ac1c39df
    @SerializedName("traceFlags")
    var traceFlags: Int, // 0
    @SerializedName("traceId")
    var traceId: String // 1740c4b9e7f848d87bd7e387f85bd496
)

data class Account(
    @SerializedName("data")
    var `data`: Data
)

data class Cv(
    @SerializedName("account")
    var account: AccountX,
    @SerializedName("ads")
    var ads: Ads,
    @SerializedName("bookslot")
    var bookslot: Bookslot,
    @SerializedName("cart")
    var cart: Cart,
    @SerializedName("footer")
    var footer: Footer,
    @SerializedName("header")
    var header: Header,
    @SerializedName("pulse")
    var pulse: Pulse,
    @SerializedName("search")
    var search: Search,
    @SerializedName("shared")
    var shared: Shared
)

data class FooterX(
    @SerializedName("data")
    var `data`: DataX,
    @SerializedName("headers")
    var headers: Headers
)

data class HeaderX(
    @SerializedName("data")
    var `data`: DataXX
)

data class Membership(
    @SerializedName("data")
    var `data`: DataXXX
)

class Data

data class AccountX(
    @SerializedName("_all_")
    var all: All
)

data class Ads(
    @SerializedName("_all_")
    var all: AllX
)

data class Bookslot(
    @SerializedName("_all_")
    var all: AllXX
)

data class Cart(
    @SerializedName("_all_")
    var all: AllXXX
)

data class Footer(
    @SerializedName("_all_")
    var all: AllXXXX
)

data class Header(
    @SerializedName("_all_")
    var all: AllXXXXX
)

data class Pulse(
    @SerializedName("_all_")
    var all: AllXXXXXX
)

data class Search(
    @SerializedName("_all_")
    var all: AllXXXXXXX
)

data class Shared(
    @SerializedName("_all_")
    var all: AllXXXXXXXX
)

data class All(
    @SerializedName("autoCareCenterUrl")
    var autoCareCenterUrl: String, // https://www.walmart.com/cp/auto-services/1087266
    @SerializedName("ccpaNewRequestUrl")
    var ccpaNewRequestUrl: String, // https://www.walmart.com/account/api/ccpa-intake?native=false&amp;type=access
    @SerializedName("ccpaUrl")
    var ccpaUrl: String, // /account/ccpa-reporting
    @SerializedName("communicationAndPrivacyUrl")
    var communicationAndPrivacyUrl: String, // /account/communications-and-privacy
    @SerializedName("customCakeUrl")
    var customCakeUrl: String, // https://www.walmart.com/order-ahead/cake
    @SerializedName("digitalRewardsUrl")
    var digitalRewardsUrl: String, // https://www.walmart.com/cp/8301756
    @SerializedName("disableGuestUserAutocomplete")
    var disableGuestUserAutocomplete: Boolean, // false
    @SerializedName("eBookUrl")
    var eBookUrl: String, // https://www.walmart.com/account/redirect/kobo?page=library
    @SerializedName("enableAVSOverrideGoogleAutoComplete")
    var enableAVSOverrideGoogleAutoComplete: Boolean, // true
    @SerializedName("enableAccountDWeb")
    var enableAccountDWeb: Boolean, // true
    @SerializedName("enableAccountMWeb")
    var enableAccountMWeb: Boolean, // true
    @SerializedName("enableAccountWallet")
    var enableAccountWallet: Boolean, // true
    @SerializedName("enableAddressLineOneAutofill")
    var enableAddressLineOneAutofill: Boolean, // false
    @SerializedName("enableAvsOverride")
    var enableAvsOverride: Boolean, // true
    @SerializedName("enableCharityOfChoice")
    var enableCharityOfChoice: Boolean, // true
    @SerializedName("enableDigitalRewards")
    var enableDigitalRewards: Boolean, // false
    @SerializedName("enableFeatureCommsAndPrivacy")
    var enableFeatureCommsAndPrivacy: Boolean, // true
    @SerializedName("enableGarage")
    var enableGarage: Boolean, // true
    @SerializedName("enableGoogleAutoComplete")
    var enableGoogleAutoComplete: Boolean, // true
    @SerializedName("enableHSAFSA")
    var enableHSAFSA: Boolean, // false
    @SerializedName("enableInHomeAddress")
    var enableInHomeAddress: Boolean, // true
    @SerializedName("enableInHomeEdit")
    var enableInHomeEdit: Boolean, // true
    @SerializedName("enableItemSubscription")
    var enableItemSubscription: Boolean, // true
    @SerializedName("enableItemSubscriptionRamp")
    var enableItemSubscriptionRamp: Boolean, // false
    @SerializedName("enableLanguageSelection")
    var enableLanguageSelection: Boolean, // false
    @SerializedName("enableLocationAutoComplete")
    var enableLocationAutoComplete: Boolean, // true
    @SerializedName("enableMultipleInHomeAddresses")
    var enableMultipleInHomeAddresses: Boolean, // false
    @SerializedName("enableMyItemsMenu")
    var enableMyItemsMenu: Boolean, // true
    @SerializedName("enableNextBestAction")
    var enableNextBestAction: Boolean, // true
    @SerializedName("enablePaidBusinessPlusPlan")
    var enablePaidBusinessPlusPlan: Boolean, // false
    @SerializedName("enablePetHubPage")
    var enablePetHubPage: Boolean, // false
    @SerializedName("enablePetRx")
    var enablePetRx: Boolean, // true
    @SerializedName("enablePetRxAutoRefill")
    var enablePetRxAutoRefill: Boolean, // true
    @SerializedName("enablePetRxWebUrl")
    var enablePetRxWebUrl: String, // https://www.walmart.com
    @SerializedName("enablePetsCarousel")
    var enablePetsCarousel: Boolean, // true
    @SerializedName("enablePetsLink")
    var enablePetsLink: Boolean, // false
    @SerializedName("enablePhoneCollection")
    var enablePhoneCollection: Boolean, // true
    @SerializedName("enablePostalCodeMessage")
    var enablePostalCodeMessage: Boolean, // false
    @SerializedName("enablePostalCodeOnly")
    var enablePostalCodeOnly: Boolean, // false
    @SerializedName("enableRemovePWState")
    var enableRemovePWState: Boolean, // true
    @SerializedName("enableSubscriptionModule")
    var enableSubscriptionModule: Boolean, // true
    @SerializedName("enableValueTracker")
    var enableValueTracker: Boolean, // false
    @SerializedName("enableWPlusMembershipMode")
    var enableWPlusMembershipMode: Boolean, // true
    @SerializedName("enableWalmartPlus")
    var enableWalmartPlus: Boolean, // true
    @SerializedName("enableWalmartPlusPreference")
    var enableWalmartPlusPreference: Boolean, // true
    @SerializedName("enableYourProfileSection")
    var enableYourProfileSection: Boolean, // true
    @SerializedName("enableZipcodeInAddressSelector")
    var enableZipcodeInAddressSelector: Boolean, // false
    @SerializedName("enchancedAccountPharmacyUrl")
    var enchancedAccountPharmacyUrl: String, // https://www.walmart.com/cp/5431
    @SerializedName("isFCShippingEnabled")
    var isFCShippingEnabled: Boolean, // true
    @SerializedName("isInHomeEnabled")
    var isInHomeEnabled: Boolean, // true
    @SerializedName("isLoginRedirectionEnabled")
    var isLoginRedirectionEnabled: Boolean, // false
    @SerializedName("isMobileVerificationEnabled")
    var isMobileVerificationEnabled: Boolean, // false
    @SerializedName("isRewardsEnabled")
    var isRewardsEnabled: Boolean, // true
    @SerializedName("itemSubscriptionUrl")
    var itemSubscriptionUrl: String, // https://www.walmart.com/m/deals/subscriptions/manage
    @SerializedName("listsUrl")
    var listsUrl: String, // /lists
    @SerializedName("pharmacyUrl")
    var pharmacyUrl: String, // https://www.walmart.com/pharmacy/dashboard
    @SerializedName("placeholder")
    var placeholder: Int, // 1
    @SerializedName("protectionPlanUrl")
    var protectionPlanUrl: String, // /protection-plans
    @SerializedName("registriesUrl")
    var registriesUrl: String, // /my-registries
    @SerializedName("reorderUrl")
    var reorderUrl: String, // https://www.walmart.com/my-items
    @SerializedName("shouldUpdateCartAfterUpdateZipcode")
    var shouldUpdateCartAfterUpdateZipcode: Boolean, // true
    @SerializedName("showSignInNudgeDweb")
    var showSignInNudgeDweb: Boolean, // true
    @SerializedName("showSignInNudgeMWeb")
    var showSignInNudgeMWeb: Boolean, // true
    @SerializedName("vuduLibraryUrl")
    var vuduLibraryUrl: String, // https://video.walmart.com/content/account/purchasehistory
    @SerializedName("walmartAssociateUrl")
    var walmartAssociateUrl: String, // https://www.walmart.com/account/associate-discount
    @SerializedName("walmartPlusUrl")
    var walmartPlusUrl: String // https://www.walmart.com/grocery/account/plus/overview
)

data class AllX(
    @SerializedName("adCategoryTakeoverCheck")
    var adCategoryTakeoverCheck: Boolean, // true
    @SerializedName("adManualShelfIdCheck")
    var adManualShelfIdCheck: Boolean, // true
    @SerializedName("adPreviewMode")
    var adPreviewMode: Boolean, // false
    @SerializedName("adPreviousResponseNullCheck")
    var adPreviousResponseNullCheck: Boolean, // false
    @SerializedName("adResponseBeaconEnable")
    var adResponseBeaconEnable: Boolean, // true
    @SerializedName("adResponseBeaconRefactorEnable")
    var adResponseBeaconRefactorEnable: Boolean, // true
    @SerializedName("adSPIncrementDecrementCheck")
    var adSPIncrementDecrementCheck: Boolean, // true
    @SerializedName("adShowAtcFieldEnable")
    var adShowAtcFieldEnable: Boolean, // true
    @SerializedName("adSpBuyNowBeaconEnable")
    var adSpBuyNowBeaconEnable: Boolean, // false
    @SerializedName("adSpClipBeaconEnable")
    var adSpClipBeaconEnable: Boolean, // true
    @SerializedName("adViewableGmBeaconCheck")
    var adViewableGmBeaconCheck: Boolean, // true
    @SerializedName("addSpVideoNaBeacon")
    var addSpVideoNaBeacon: Boolean, // false
    @SerializedName("adsControlGroupXpa")
    var adsControlGroupXpa: String, // T0FRM,HP1Ng,YJYo7,YzvhK
    @SerializedName("adsHpControlGroupXpa")
    var adsHpControlGroupXpa: String, // T0FRM,HP1Ng,YJYo7,YzvhK
    @SerializedName("adsQuickshopBeaconEnable")
    var adsQuickshopBeaconEnable: Boolean, // true
    @SerializedName("adsXpa")
    var adsXpa: String, // uzqvZ,CIp98,MczYX,fMDaZ,Cxex4,jfBfA,L08SY,FVa_h,gy6TO,pPfKs,T0FRM,pGmuy,WWzc1,HP1Ng,R2Fan,qk7Ja,YzvhK,prFpU,YJYo7,Sn9ey,ZwAjn,sarso,eN87W,lWnym,rmvIk,pLKtx,ZgSVh,8nAQE,MjQX0,OBGuB,cqHgG,LQslS,mC9MV,Vs9Gq
    @SerializedName("blockInternal")
    var blockInternal: Boolean, // true
    @SerializedName("bpBigMeasure1PEnable")
    var bpBigMeasure1PEnable: Boolean, // true
    @SerializedName("bpGalMeasure1PEnable")
    var bpGalMeasure1PEnable: Boolean, // false
    @SerializedName("bpGalMeasure3PEnable")
    var bpGalMeasure3PEnable: Boolean, // false
    @SerializedName("bpGalRenderEnable")
    var bpGalRenderEnable: Boolean, // false
    @SerializedName("bpGalReqEnable")
    var bpGalReqEnable: Boolean, // false
    @SerializedName("bpMq1DSPEnable")
    var bpMq1DSPEnable: Boolean, // true
    @SerializedName("bpMq1FeedbackEnable")
    var bpMq1FeedbackEnable: Boolean, // false
    @SerializedName("bpMq1Measure1PEnable")
    var bpMq1Measure1PEnable: Boolean, // true
    @SerializedName("bpMq1Measure3PEnable")
    var bpMq1Measure3PEnable: Boolean, // true
    @SerializedName("bpMq1RenderEnable")
    var bpMq1RenderEnable: Boolean, // true
    @SerializedName("bpMq1ReqEnable")
    var bpMq1ReqEnable: Boolean, // true
    @SerializedName("bpMq2DSPEnable")
    var bpMq2DSPEnable: Boolean, // true
    @SerializedName("bpMq2FeedbackEnable")
    var bpMq2FeedbackEnable: Boolean, // false
    @SerializedName("bpMq2Measure1PEnable")
    var bpMq2Measure1PEnable: Boolean, // true
    @SerializedName("bpMq2Measure3PEnable")
    var bpMq2Measure3PEnable: Boolean, // true
    @SerializedName("bpMq2RenderEnable")
    var bpMq2RenderEnable: Boolean, // true
    @SerializedName("bpMq2ReqEnable")
    var bpMq2ReqEnable: Boolean, // true
    @SerializedName("bpMqEnableAdsBtfCmpV3")
    var bpMqEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("bpSigFeedbackEnable")
    var bpSigFeedbackEnable: Boolean, // false
    @SerializedName("bpSigFeedbackMobileEnable")
    var bpSigFeedbackMobileEnable: Boolean, // false
    @SerializedName("bpSkDSPEnable")
    var bpSkDSPEnable: Boolean, // true
    @SerializedName("bpSkEnableAdsBtfCmpV3")
    var bpSkEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("bpSkFeedbackEnable")
    var bpSkFeedbackEnable: Boolean, // false
    @SerializedName("bpSkMeasure1PEnable")
    var bpSkMeasure1PEnable: Boolean, // true
    @SerializedName("bpSkMeasure3PEnable")
    var bpSkMeasure3PEnable: Boolean, // true
    @SerializedName("bpSkRenderEnable")
    var bpSkRenderEnable: Boolean, // true
    @SerializedName("bpSkReqEnable")
    var bpSkReqEnable: Boolean, // true
    @SerializedName("bpSpc1Measure1PEnable")
    var bpSpc1Measure1PEnable: Boolean, // true
    @SerializedName("bpSpc1ReqEnable")
    var bpSpc1ReqEnable: Boolean, // true
    @SerializedName("bpSpcEnableAdsBtfCmpV3")
    var bpSpcEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("buyBoxVariations")
    var buyBoxVariations: String, // 3
    @SerializedName("cacheBusterTimeDiffMs")
    var cacheBusterTimeDiffMs: Int, // 180000
    @SerializedName("cartP13nMeasure1PEnable")
    var cartP13nMeasure1PEnable: Boolean, // true
    @SerializedName("contentPageClickBeaconEnable")
    var contentPageClickBeaconEnable: Boolean, // true
    @SerializedName("cpMq1RenderEnable")
    var cpMq1RenderEnable: Boolean, // false
    @SerializedName("cpMq2RenderEnable")
    var cpMq2RenderEnable: Boolean, // false
    @SerializedName("cpSkRenderEnable")
    var cpSkRenderEnable: Boolean, // false
    @SerializedName("currCpSafeframeURL")
    var currCpSafeframeURL: String, // https://i5.walmartimages.com/dfw/63fd9f59-afe1/7adb6fe1-4149-4ebe-b4c7-2ea1921d4a19/v12/safeframe-content-page.html
    @SerializedName("defaultLocationStateCode")
    var defaultLocationStateCode: String,
    @SerializedName("defaultLocationZipCode")
    var defaultLocationZipCode: String,
    @SerializedName("disableLowPriorityBeacons")
    var disableLowPriorityBeacons: Boolean, // false
    @SerializedName("display3PVisibilityCheck")
    var display3PVisibilityCheck: Boolean, // true
    @SerializedName("displayAddlInfo")
    var displayAddlInfo: Boolean, // true
    @SerializedName("displayCheckIp")
    var displayCheckIp: Boolean, // false
    @SerializedName("displayDeduplication")
    var displayDeduplication: Boolean, // true
    @SerializedName("displayIdentifyAdServer")
    var displayIdentifyAdServer: Boolean, // true
    @SerializedName("displayOrderDeduplication")
    var displayOrderDeduplication: Boolean, // true
    @SerializedName("displayPPMMode")
    var displayPPMMode: Boolean, // true
    @SerializedName("displayPoVAdBlockerEnable")
    var displayPoVAdBlockerEnable: Boolean, // true
    @SerializedName("displayPreviousRenderCheck")
    var displayPreviousRenderCheck: Boolean, // true
    @SerializedName("displayProductPos")
    var displayProductPos: Boolean, // true
    @SerializedName("displayProductsPos")
    var displayProductsPos: Boolean, // false
    @SerializedName("displaySbaLogospQs")
    var displaySbaLogospQs: Boolean, // true
    @SerializedName("displaySpMyItems")
    var displaySpMyItems: Boolean, // true
    @SerializedName("displayUnitWrapperUnmount")
    var displayUnitWrapperUnmount: Boolean, // true
    @SerializedName("dspProcessingEnable")
    var dspProcessingEnable: Boolean, // true
    @SerializedName("dspViewabilityTracking")
    var dspViewabilityTracking: Boolean, // true
    @SerializedName("enableAdSmilePricing")
    var enableAdSmilePricing: Boolean, // true
    @SerializedName("enableAdUnitVersion")
    var enableAdUnitVersion: Boolean, // false
    @SerializedName("enableAdsBtfCmpV3")
    var enableAdsBtfCmpV3: Boolean, // false
    @SerializedName("enableBlendedSpAdsVariation")
    var enableBlendedSpAdsVariation: Boolean, // false
    @SerializedName("enableBrandBoxEarlyLoad")
    var enableBrandBoxEarlyLoad: Boolean, // false
    @SerializedName("enableCenterAlignBrandBox")
    var enableCenterAlignBrandBox: Boolean, // false
    @SerializedName("enableDisclaimerIconVar1")
    var enableDisclaimerIconVar1: Boolean, // true
    @SerializedName("enableGalleryItemChanges")
    var enableGalleryItemChanges: Boolean, // true
    @SerializedName("enableGalleryMultipleLocations")
    var enableGalleryMultipleLocations: Boolean, // true
    @SerializedName("enableGalleryReRender")
    var enableGalleryReRender: Boolean, // false
    @SerializedName("enableGalleryTitle")
    var enableGalleryTitle: Boolean, // true
    @SerializedName("enableGalleryV2Design")
    var enableGalleryV2Design: Boolean, // true
    @SerializedName("enableGetPvId")
    var enableGetPvId: Boolean, // true
    @SerializedName("enableHpRedesignXPA")
    var enableHpRedesignXPA: Boolean, // true
    @SerializedName("enableLegalDisclaimerSponsored")
    var enableLegalDisclaimerSponsored: Boolean, // true
    @SerializedName("enableMyitemsAtcSortPlacementBeacon")
    var enableMyitemsAtcSortPlacementBeacon: Boolean, // true
    @SerializedName("enableMyitemsBlending")
    var enableMyitemsBlending: Boolean, // false
    @SerializedName("enableMyitemsSortPlacementBeacon")
    var enableMyitemsSortPlacementBeacon: Boolean, // true
    @SerializedName("enableProductBrandOnBeacon")
    var enableProductBrandOnBeacon: Boolean, // false
    @SerializedName("enableSearchGalleryMaxWidth")
    var enableSearchGalleryMaxWidth: Boolean, // false
    @SerializedName("enableSeasonalColorOption")
    var enableSeasonalColorOption: Boolean, // false
    @SerializedName("enableSponsoredRedirectParam")
    var enableSponsoredRedirectParam: Boolean, // true
    @SerializedName("enableStackedRecallTracking")
    var enableStackedRecallTracking: Boolean, // true
    @SerializedName("enableSvTestAds")
    var enableSvTestAds: Boolean, // false
    @SerializedName("enableVideoTracker")
    var enableVideoTracker: Boolean, // false
    @SerializedName("enableVideoUIErrorState")
    var enableVideoUIErrorState: Boolean, // false
    @SerializedName("feedbackForVideoRefactor")
    var feedbackForVideoRefactor: Boolean, // false
    @SerializedName("fillEmptyLocWithProductLocEnable")
    var fillEmptyLocWithProductLocEnable: Boolean, // false
    @SerializedName("hpFontStyleFix")
    var hpFontStyleFix: Boolean, // true
    @SerializedName("hpGalEnableAdsBtfCmpV3")
    var hpGalEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("hpGalMeasure1PEnable")
    var hpGalMeasure1PEnable: Boolean, // true
    @SerializedName("hpGalMeasure3PEnable")
    var hpGalMeasure3PEnable: Boolean, // true
    @SerializedName("hpGalMiddleMeasure1PEnable")
    var hpGalMiddleMeasure1PEnable: Boolean, // true
    @SerializedName("hpGalMiddleMeasure3PEnable")
    var hpGalMiddleMeasure3PEnable: Boolean, // true
    @SerializedName("hpGalMiddleRenderEnable")
    var hpGalMiddleRenderEnable: Boolean, // true
    @SerializedName("hpGalMiddleReqEnable")
    var hpGalMiddleReqEnable: Boolean, // true
    @SerializedName("hpGalRenderEnable")
    var hpGalRenderEnable: Boolean, // true
    @SerializedName("hpGalReqEnable")
    var hpGalReqEnable: Boolean, // true
    @SerializedName("hpGpbFs1Measure1PEnable")
    var hpGpbFs1Measure1PEnable: Boolean, // true
    @SerializedName("hpGpbFs1Measure3PEnable")
    var hpGpbFs1Measure3PEnable: Boolean, // true
    @SerializedName("hpGpbFs1RenderEnable")
    var hpGpbFs1RenderEnable: Boolean, // true
    @SerializedName("hpGpbFs1ReqEnable")
    var hpGpbFs1ReqEnable: Boolean, // true
    @SerializedName("hpGpbFs2Measure1PEnable")
    var hpGpbFs2Measure1PEnable: Boolean, // true
    @SerializedName("hpGpbFs2Measure3PEnable")
    var hpGpbFs2Measure3PEnable: Boolean, // true
    @SerializedName("hpGpbFs2RenderEnable")
    var hpGpbFs2RenderEnable: Boolean, // true
    @SerializedName("hpGpbFs2ReqEnable")
    var hpGpbFs2ReqEnable: Boolean, // true
    @SerializedName("hpGpbFs3Measure1PEnable")
    var hpGpbFs3Measure1PEnable: Boolean, // true
    @SerializedName("hpGpbFs3Measure3PEnable")
    var hpGpbFs3Measure3PEnable: Boolean, // true
    @SerializedName("hpGpbFs3RenderEnable")
    var hpGpbFs3RenderEnable: Boolean, // true
    @SerializedName("hpGpbFs3ReqEnable")
    var hpGpbFs3ReqEnable: Boolean, // true
    @SerializedName("hpMq1DSPEnable")
    var hpMq1DSPEnable: Boolean, // false
    @SerializedName("hpMq1Measure1PEnable")
    var hpMq1Measure1PEnable: Boolean, // true
    @SerializedName("hpMq1Measure3PEnable")
    var hpMq1Measure3PEnable: Boolean, // true
    @SerializedName("hpMq1RenderEnable")
    var hpMq1RenderEnable: Boolean, // true
    @SerializedName("hpMq1ReqEnable")
    var hpMq1ReqEnable: Boolean, // true
    @SerializedName("hpMq2DSPEnable")
    var hpMq2DSPEnable: Boolean, // true
    @SerializedName("hpMq2Measure1PEnable")
    var hpMq2Measure1PEnable: Boolean, // true
    @SerializedName("hpMq2Measure3PEnable")
    var hpMq2Measure3PEnable: Boolean, // true
    @SerializedName("hpMq2RenderEnable")
    var hpMq2RenderEnable: Boolean, // true
    @SerializedName("hpMq2ReqEnable")
    var hpMq2ReqEnable: Boolean, // true
    @SerializedName("hpMqEnableAdsBtfCmpV3")
    var hpMqEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("hpOldPageVisitedXpa")
    var hpOldPageVisitedXpa: String, // hpXpa
    @SerializedName("hpP13nMeasure1PEnable")
    var hpP13nMeasure1PEnable: Boolean, // true
    @SerializedName("hpPovLockoutPriorityEnable")
    var hpPovLockoutPriorityEnable: Boolean, // true
    @SerializedName("hpRedesignVisitedXpa")
    var hpRedesignVisitedXpa: String, // hprXp
    @SerializedName("hpSpcEnableAdsBtfCmpV3")
    var hpSpcEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("hpTpFs1Measure1PEnable")
    var hpTpFs1Measure1PEnable: Boolean, // true
    @SerializedName("hpTpFs1Measure3PEnable")
    var hpTpFs1Measure3PEnable: Boolean, // true
    @SerializedName("hpTpFs1RenderEnable")
    var hpTpFs1RenderEnable: Boolean, // true
    @SerializedName("hpTpFs1ReqEnable")
    var hpTpFs1ReqEnable: Boolean, // true
    @SerializedName("hpTpFs2Measure1PEnable")
    var hpTpFs2Measure1PEnable: Boolean, // true
    @SerializedName("hpTpFs2Measure3PEnable")
    var hpTpFs2Measure3PEnable: Boolean, // true
    @SerializedName("hpTpFs2RenderEnable")
    var hpTpFs2RenderEnable: Boolean, // true
    @SerializedName("hpTpFs2ReqEnable")
    var hpTpFs2ReqEnable: Boolean, // true
    @SerializedName("hpTpFs3Measure1PEnable")
    var hpTpFs3Measure1PEnable: Boolean, // true
    @SerializedName("hpTpFs3Measure3PEnable")
    var hpTpFs3Measure3PEnable: Boolean, // true
    @SerializedName("hpTpFs3RenderEnable")
    var hpTpFs3RenderEnable: Boolean, // true
    @SerializedName("hpTpFs3ReqEnable")
    var hpTpFs3ReqEnable: Boolean, // true
    @SerializedName("hpTpFsAllDisableLoadingCard")
    var hpTpFsAllDisableLoadingCard: Boolean, // true
    @SerializedName("ipAllAdsEnableAdsBtfCmpV3")
    var ipAllAdsEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("ipBbLazyLoadingEnable")
    var ipBbLazyLoadingEnable: Boolean, // false
    @SerializedName("ipBbMeasure1PEnable")
    var ipBbMeasure1PEnable: Boolean, // true
    @SerializedName("ipBbReqEnable")
    var ipBbReqEnable: Boolean, // true
    @SerializedName("ipBr1DSPEnable")
    var ipBr1DSPEnable: Boolean, // true
    @SerializedName("ipBr1EarlyLoadRootMargin")
    var ipBr1EarlyLoadRootMargin: Int, // 0
    @SerializedName("ipBr1Measure1PEnable")
    var ipBr1Measure1PEnable: Boolean, // true
    @SerializedName("ipBr1Measure3PEnable")
    var ipBr1Measure3PEnable: Boolean, // true
    @SerializedName("ipBr1MinScreenHeight")
    var ipBr1MinScreenHeight: Int, // 768
    @SerializedName("ipBr1RenderEnable")
    var ipBr1RenderEnable: Boolean, // true
    @SerializedName("ipBr1ReqEnable")
    var ipBr1ReqEnable: Boolean, // true
    @SerializedName("ipBr1Version")
    var ipBr1Version: String,
    @SerializedName("ipBr1VideoDSPEnabled")
    var ipBr1VideoDSPEnabled: Boolean, // true
    @SerializedName("ipBr1VideoMeasure3PEnable")
    var ipBr1VideoMeasure3PEnable: Boolean, // false
    @SerializedName("ipGalMiddleMeasure1PEnable")
    var ipGalMiddleMeasure1PEnable: Boolean, // false
    @SerializedName("ipGalMiddleMeasure3PEnable")
    var ipGalMiddleMeasure3PEnable: Boolean, // false
    @SerializedName("ipGalMiddleRenderEnable")
    var ipGalMiddleRenderEnable: Boolean, // false
    @SerializedName("ipGalMiddleReqEnable")
    var ipGalMiddleReqEnable: Boolean, // false
    @SerializedName("ipGalTopMeasure1PEnable")
    var ipGalTopMeasure1PEnable: Boolean, // false
    @SerializedName("ipGalTopMeasure3PEnable")
    var ipGalTopMeasure3PEnable: Boolean, // false
    @SerializedName("ipGalTopRenderEnable")
    var ipGalTopRenderEnable: Boolean, // false
    @SerializedName("ipGalTopReqEnable")
    var ipGalTopReqEnable: Boolean, // false
    @SerializedName("ipMq1DSPEnable")
    var ipMq1DSPEnable: Boolean, // true
    @SerializedName("ipMq1FeedbackEnable")
    var ipMq1FeedbackEnable: Boolean, // false
    @SerializedName("ipMq1Measure1PEnable")
    var ipMq1Measure1PEnable: Boolean, // true
    @SerializedName("ipMq1Measure3PEnable")
    var ipMq1Measure3PEnable: Boolean, // true
    @SerializedName("ipMq1RenderEnable")
    var ipMq1RenderEnable: Boolean, // true
    @SerializedName("ipMq1ReqEnable")
    var ipMq1ReqEnable: Boolean, // true
    @SerializedName("ipMq1Version")
    var ipMq1Version: String,
    @SerializedName("ipMq2DSPEnable")
    var ipMq2DSPEnable: Boolean, // true
    @SerializedName("ipMq2FeedbackEnable")
    var ipMq2FeedbackEnable: Boolean, // false
    @SerializedName("ipMq2Measure1PEnable")
    var ipMq2Measure1PEnable: Boolean, // true
    @SerializedName("ipMq2Measure3PEnable")
    var ipMq2Measure3PEnable: Boolean, // true
    @SerializedName("ipMq2RenderEnable")
    var ipMq2RenderEnable: Boolean, // true
    @SerializedName("ipMq2ReqEnable")
    var ipMq2ReqEnable: Boolean, // true
    @SerializedName("ipMq2Version")
    var ipMq2Version: String,
    @SerializedName("ipP13nMeasure1PEnable")
    var ipP13nMeasure1PEnable: Boolean, // true
    @SerializedName("ipSkDSPEnable")
    var ipSkDSPEnable: Boolean, // true
    @SerializedName("ipSkFeedbackEnable")
    var ipSkFeedbackEnable: Boolean, // false
    @SerializedName("ipSkMeasure1PEnable")
    var ipSkMeasure1PEnable: Boolean, // true
    @SerializedName("ipSkMeasure3PEnable")
    var ipSkMeasure3PEnable: Boolean, // true
    @SerializedName("ipSkRenderEnable")
    var ipSkRenderEnable: Boolean, // true
    @SerializedName("ipSkReqEnable")
    var ipSkReqEnable: Boolean, // true
    @SerializedName("ipSpc1Measure1PEnable")
    var ipSpc1Measure1PEnable: Boolean, // true
    @SerializedName("ipSpc1ReqEnable")
    var ipSpc1ReqEnable: Boolean, // true
    @SerializedName("ipSpc2Measure1PEnable")
    var ipSpc2Measure1PEnable: Boolean, // true
    @SerializedName("ipSpc2ReqEnable")
    var ipSpc2ReqEnable: Boolean, // true
    @SerializedName("lazyRenderCmp")
    var lazyRenderCmp: Boolean, // false
    @SerializedName("measure3PImpEnable")
    var measure3PImpEnable: Boolean, // true
    @SerializedName("moatIvt")
    var moatIvt: String, // https://www.walmart.com/swag/v2/ip-rd
    @SerializedName("moatRefactorEnable")
    var moatRefactorEnable: Boolean, // false
    @SerializedName("myitemsMeasure1PEnable")
    var myitemsMeasure1PEnable: Boolean, // true
    @SerializedName("odpSkConfigLazy")
    var odpSkConfigLazy: Int, // 400
    @SerializedName("odpSkConfigModuleLocation")
    var odpSkConfigModuleLocation: String, // top
    @SerializedName("odpSkMeasure1PEnable")
    var odpSkMeasure1PEnable: Boolean, // true
    @SerializedName("odpSkMeasure3PEnable")
    var odpSkMeasure3PEnable: Boolean, // true
    @SerializedName("odpSkRenderEnable")
    var odpSkRenderEnable: Boolean, // true
    @SerializedName("odpSkReqEnable")
    var odpSkReqEnable: Boolean, // true
    @SerializedName("opAllAdsEnableAdsBtfCmpV3")
    var opAllAdsEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("openRTBDisplayAdsBundleSafeframeURL")
    var openRTBDisplayAdsBundleSafeframeURL: String, // https://i5.walmartimages.com/dfw/63fd9f59-afe1/7adb6fe1-4149-4ebe-b4c7-2ea1921d4a19/v34/openrtb-template-wrapper.html
    @SerializedName("pacP13nMeasure1PEnable")
    var pacP13nMeasure1PEnable: Boolean, // true
    @SerializedName("pacSkDisableTopPadding")
    var pacSkDisableTopPadding: Boolean, // true
    @SerializedName("pacSkMeasure1PEnable")
    var pacSkMeasure1PEnable: Boolean, // true
    @SerializedName("pacSkMeasure3PEnable")
    var pacSkMeasure3PEnable: Boolean, // true
    @SerializedName("pacSkRenderEnable")
    var pacSkRenderEnable: Boolean, // true
    @SerializedName("pacSkReqEnable")
    var pacSkReqEnable: Boolean, // true
    @SerializedName("phSkConfigLazy")
    var phSkConfigLazy: Int, // 400
    @SerializedName("phSkConfigModuleLocation")
    var phSkConfigModuleLocation: String, // top
    @SerializedName("phSkMeasure1PEnable")
    var phSkMeasure1PEnable: Boolean, // true
    @SerializedName("phSkMeasure3PEnable")
    var phSkMeasure3PEnable: Boolean, // true
    @SerializedName("phSkRenderEnable")
    var phSkRenderEnable: Boolean, // true
    @SerializedName("phSkReqEnable")
    var phSkReqEnable: Boolean, // true
    @SerializedName("povMrcFix")
    var povMrcFix: Boolean, // true
    @SerializedName("revertViewabilityTimerFix")
    var revertViewabilityTimerFix: Boolean, // false
    @SerializedName("safeframeTemplatesEnable")
    var safeframeTemplatesEnable: Boolean, // false
    @SerializedName("safeframeURL")
    var safeframeURL: String, // https://i5.walmartimages.com/dfw/63fd9f59-d6ba/07b8ea82-184c-4ea3-8ac0-5dc1981e40c8/v33/safeframe.html
    @SerializedName("sbaMwebRedesignV1Enable")
    var sbaMwebRedesignV1Enable: Boolean, // true
    @SerializedName("sbaMwebRedesignV2Enable")
    var sbaMwebRedesignV2Enable: Boolean, // false
    @SerializedName("sbaUiEnhanceEnable")
    var sbaUiEnhanceEnable: Boolean, // false
    @SerializedName("shpSingleTTO1Measure1PEnable")
    var shpSingleTTO1Measure1PEnable: Boolean, // false
    @SerializedName("shpSingleTTO1Measure3PEnable")
    var shpSingleTTO1Measure3PEnable: Boolean, // false
    @SerializedName("shpSingleTTO1RenderEnable")
    var shpSingleTTO1RenderEnable: Boolean, // false
    @SerializedName("shpSingleTTO1ReqEnable")
    var shpSingleTTO1ReqEnable: Boolean, // false
    @SerializedName("shpSingleTTO2Measure1PEnable")
    var shpSingleTTO2Measure1PEnable: Boolean, // false
    @SerializedName("shpSingleTTO2Measure3PEnable")
    var shpSingleTTO2Measure3PEnable: Boolean, // false
    @SerializedName("shpSingleTTO2RenderEnable")
    var shpSingleTTO2RenderEnable: Boolean, // false
    @SerializedName("shpSingleTTO2ReqEnable")
    var shpSingleTTO2ReqEnable: Boolean, // false
    @SerializedName("shpSkEnableAdsBtfCmpV3")
    var shpSkEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("shpSkMeasure1PEnable")
    var shpSkMeasure1PEnable: Boolean, // true
    @SerializedName("shpSkMeasure3PEnable")
    var shpSkMeasure3PEnable: Boolean, // true
    @SerializedName("shpSkRenderEnable")
    var shpSkRenderEnable: Boolean, // true
    @SerializedName("shpSkReqEnable")
    var shpSkReqEnable: Boolean, // true
    @SerializedName("spGalMeasure1PEnable")
    var spGalMeasure1PEnable: Boolean, // false
    @SerializedName("spGalMeasure3PEnable")
    var spGalMeasure3PEnable: Boolean, // false
    @SerializedName("spGalRenderEnable")
    var spGalRenderEnable: Boolean, // false
    @SerializedName("spGalReqEnable")
    var spGalReqEnable: Boolean, // false
    @SerializedName("spIbottaEnable")
    var spIbottaEnable: Boolean, // true
    @SerializedName("spMq1DSPEnable")
    var spMq1DSPEnable: Boolean, // true
    @SerializedName("spMq1FeedbackEnable")
    var spMq1FeedbackEnable: Boolean, // false
    @SerializedName("spMq1Measure1PEnable")
    var spMq1Measure1PEnable: Boolean, // true
    @SerializedName("spMq1Measure3PEnable")
    var spMq1Measure3PEnable: Boolean, // true
    @SerializedName("spMq1RenderEnable")
    var spMq1RenderEnable: Boolean, // true
    @SerializedName("spMq1ReqEnable")
    var spMq1ReqEnable: Boolean, // true
    @SerializedName("spMq2DSPEnable")
    var spMq2DSPEnable: Boolean, // true
    @SerializedName("spMq2FeedbackEnable")
    var spMq2FeedbackEnable: Boolean, // false
    @SerializedName("spMq2Measure1PEnable")
    var spMq2Measure1PEnable: Boolean, // true
    @SerializedName("spMq2Measure3PEnable")
    var spMq2Measure3PEnable: Boolean, // true
    @SerializedName("spMq2RenderEnable")
    var spMq2RenderEnable: Boolean, // true
    @SerializedName("spMq2ReqEnable")
    var spMq2ReqEnable: Boolean, // true
    @SerializedName("spMqEnableAdsBtfCmpV3")
    var spMqEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("spSbaMeasure1PEnable")
    var spSbaMeasure1PEnable: Boolean, // true
    @SerializedName("spSbaReqEnable")
    var spSbaReqEnable: Boolean, // true
    @SerializedName("spSigFeedbackEnable")
    var spSigFeedbackEnable: Boolean, // false
    @SerializedName("spSigFeedbackMobileEnable")
    var spSigFeedbackMobileEnable: Boolean, // false
    @SerializedName("spSigMeasure1PEnable")
    var spSigMeasure1PEnable: Boolean, // true
    @SerializedName("spSkDSPEnable")
    var spSkDSPEnable: Boolean, // true
    @SerializedName("spSkEnableAdsBtfCmpV3")
    var spSkEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("spSkFeedbackEnable")
    var spSkFeedbackEnable: Boolean, // false
    @SerializedName("spSkMeasure1PEnable")
    var spSkMeasure1PEnable: Boolean, // true
    @SerializedName("spSkMeasure3PEnable")
    var spSkMeasure3PEnable: Boolean, // true
    @SerializedName("spSkRenderEnable")
    var spSkRenderEnable: Boolean, // true
    @SerializedName("spSkReqEnable")
    var spSkReqEnable: Boolean, // true
    @SerializedName("spSpc1Measure1PEnable")
    var spSpc1Measure1PEnable: Boolean, // true
    @SerializedName("spSpc1ReqEnable")
    var spSpc1ReqEnable: Boolean, // true
    @SerializedName("spSpcEnableAdsBtfCmpV3")
    var spSpcEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("spSvAutoGenCcDisclaimerEnabled")
    var spSvAutoGenCcDisclaimerEnabled: Boolean, // false
    @SerializedName("spSvContainerEnable")
    var spSvContainerEnable: Boolean, // false
    @SerializedName("spSvDynamicPosEnable")
    var spSvDynamicPosEnable: Boolean, // false
    @SerializedName("spSvFeedbackEnable")
    var spSvFeedbackEnable: Boolean, // false
    @SerializedName("spSvGridPositionBeacon")
    var spSvGridPositionBeacon: Boolean, // false
    @SerializedName("spSvHideTabletVideo")
    var spSvHideTabletVideo: Boolean, // true
    @SerializedName("spSvInViewRemoveVideoData")
    var spSvInViewRemoveVideoData: Boolean, // false
    @SerializedName("spSvLazyLoadingEnable")
    var spSvLazyLoadingEnable: Boolean, // false
    @SerializedName("spSvLoopCompleteEventEnable")
    var spSvLoopCompleteEventEnable: Boolean, // false
    @SerializedName("spSvMeasure1PEnable")
    var spSvMeasure1PEnable: Boolean, // false
    @SerializedName("spSvMwebLoadingFixEnable")
    var spSvMwebLoadingFixEnable: Boolean, // false
    @SerializedName("spSvPerformanceTrackingEnable")
    var spSvPerformanceTrackingEnable: Boolean, // false
    @SerializedName("spSvRenderEnable")
    var spSvRenderEnable: Boolean, // false
    @SerializedName("spSvRenderedImpressionEnable")
    var spSvRenderedImpressionEnable: Boolean, // true
    @SerializedName("spSvReqEnable")
    var spSvReqEnable: Boolean, // false
    @SerializedName("spSvUiAlphaUpdate")
    var spSvUiAlphaUpdate: Boolean, // false
    @SerializedName("spSvV2HookEnable")
    var spSvV2HookEnable: Boolean, // true
    @SerializedName("spSvVideoTrackingEnable")
    var spSvVideoTrackingEnable: Boolean, // false
    @SerializedName("spSvViewableBeaconEnable")
    var spSvViewableBeaconEnable: Boolean, // false
    @SerializedName("spSvplaysInline")
    var spSvplaysInline: Boolean, // false
    @SerializedName("spVideoAdsMobileStyling")
    var spVideoAdsMobileStyling: Boolean, // false
    @SerializedName("sponsoredLabelTextColor")
    var sponsoredLabelTextColor: String, // #74767C
    @SerializedName("typAllEnableAdsBtfCmpV3")
    var typAllEnableAdsBtfCmpV3: Boolean, // false
    @SerializedName("typMq1Measure1PEnable")
    var typMq1Measure1PEnable: Boolean, // true
    @SerializedName("typMq1Measure3PEnable")
    var typMq1Measure3PEnable: Boolean, // true
    @SerializedName("typMq1RenderEnable")
    var typMq1RenderEnable: Boolean, // true
    @SerializedName("typMq1ReqEnable")
    var typMq1ReqEnable: Boolean, // true
    @SerializedName("typSkMeasure1PEnable")
    var typSkMeasure1PEnable: Boolean, // true
    @SerializedName("typSkMeasure3PEnable")
    var typSkMeasure3PEnable: Boolean, // true
    @SerializedName("typSkRenderEnable")
    var typSkRenderEnable: Boolean, // true
    @SerializedName("typSkReqEnable")
    var typSkReqEnable: Boolean, // true
    @SerializedName("updateAdV2Query2StoreEnable")
    var updateAdV2Query2StoreEnable: Boolean, // false
    @SerializedName("updateAdV2QueryUbsEnable")
    var updateAdV2QueryUbsEnable: Boolean, // true
    @SerializedName("useLegacyBtfCmp")
    var useLegacyBtfCmp: Boolean, // false
    @SerializedName("useSearchBrowseBtfCmp")
    var useSearchBrowseBtfCmp: Boolean, // false
    @SerializedName("videoCCEnable")
    var videoCCEnable: Boolean, // false
    @SerializedName("videoEarlyloadOffset")
    var videoEarlyloadOffset: Int, // 1200
    @SerializedName("videoMaxHeight")
    var videoMaxHeight: Int, // 360
    @SerializedName("videoPerformanceTrackerEnable")
    var videoPerformanceTrackerEnable: Boolean, // false
    @SerializedName("videoViewabilityFix")
    var videoViewabilityFix: Boolean, // false
    @SerializedName("viewableBeaconFix")
    var viewableBeaconFix: Boolean // true
)

data class AllXX(
    @SerializedName("alcoholRestrictedSlotsFilterEnable")
    var alcoholRestrictedSlotsFilterEnable: Boolean, // true
    @SerializedName("bookslotShortcutMaxSlotReqCount")
    var bookslotShortcutMaxSlotReqCount: Int, // 21
    @SerializedName("disableFreeDeliveryBannerForExpressOnlyStores")
    var disableFreeDeliveryBannerForExpressOnlyStores: Boolean, // true
    @SerializedName("disableMergeAndGetCartCSR")
    var disableMergeAndGetCartCSR: Boolean, // true
    @SerializedName("disableSlotShortcutInGIC")
    var disableSlotShortcutInGIC: Boolean, // false
    @SerializedName("enableACCStoreSelectorErrorHandling")
    var enableACCStoreSelectorErrorHandling: Boolean, // true
    @SerializedName("enableACCStoreSelectorOnSlotsUnavailable")
    var enableACCStoreSelectorOnSlotsUnavailable: Boolean, // true
    @SerializedName("enableAllSlotsUnavailableMessageTypesFix")
    var enableAllSlotsUnavailableMessageTypesFix: Boolean, // true
    @SerializedName("enableAvailableForInstallationText")
    var enableAvailableForInstallationText: Boolean, // true
    @SerializedName("enableBlockRegistrantAddressDelivery")
    var enableBlockRegistrantAddressDelivery: Boolean, // true
    @SerializedName("enableBookslotMobileSticky")
    var enableBookslotMobileSticky: Boolean, // true
    @SerializedName("enableCartFulfillmentOption")
    var enableCartFulfillmentOption: Boolean, // true
    @SerializedName("enableDeliveryAddressFromSlotData")
    var enableDeliveryAddressFromSlotData: Boolean, // true
    @SerializedName("enableDeliveryFromStoreInfoModule")
    var enableDeliveryFromStoreInfoModule: Boolean, // true
    @SerializedName("enableDeliveryStoreSelectorInHomeSupport")
    var enableDeliveryStoreSelectorInHomeSupport: Boolean, // false
    @SerializedName("enableEarliestAvailableDayPreselection")
    var enableEarliestAvailableDayPreselection: Boolean, // false
    @SerializedName("enableEarliestAvailableSlotPreselection")
    var enableEarliestAvailableSlotPreselection: Boolean, // false
    @SerializedName("enableEvergreenFee")
    var enableEvergreenFee: Boolean, // true
    @SerializedName("enableEvergreenHolidayDiscount")
    var enableEvergreenHolidayDiscount: Boolean, // true
    @SerializedName("enableEvergreenSlot")
    var enableEvergreenSlot: Boolean, // true
    @SerializedName("enableEvergreenSlotBranding")
    var enableEvergreenSlotBranding: Boolean, // true
    @SerializedName("enableFulfillmentIntent")
    var enableFulfillmentIntent: Boolean, // true
    @SerializedName("enableFulfillmentOptionURLParam")
    var enableFulfillmentOptionURLParam: Boolean, // true
    @SerializedName("enableHideInstoreCheckmark")
    var enableHideInstoreCheckmark: Boolean, // true
    @SerializedName("enableInHomeAmPmSlots")
    var enableInHomeAmPmSlots: Boolean, // true
    @SerializedName("enableInHomeAmPmSlotsPhase2")
    var enableInHomeAmPmSlotsPhase2: Boolean, // true
    @SerializedName("enableInHomeSlotsQueryHeader")
    var enableInHomeSlotsQueryHeader: Boolean, // true
    @SerializedName("enableInhomeTipFreePriceLabel")
    var enableInhomeTipFreePriceLabel: Boolean, // true
    @SerializedName("enableLocalizedStringInBookSlot")
    var enableLocalizedStringInBookSlot: Boolean, // false
    @SerializedName("enableMultipleInhomeAddresses")
    var enableMultipleInhomeAddresses: Boolean, // false
    @SerializedName("enableNoPickupSlotSelectionForDefaultStore")
    var enableNoPickupSlotSelectionForDefaultStore: Boolean, // true
    @SerializedName("enableNoSlotPreselectionOnTabSwitch")
    var enableNoSlotPreselectionOnTabSwitch: Boolean, // false
    @SerializedName("enableNoSlotsAvailableScreen")
    var enableNoSlotsAvailableScreen: Boolean, // true
    @SerializedName("enablePassCartIdAcidCheck")
    var enablePassCartIdAcidCheck: Boolean, // true
    @SerializedName("enablePassCartIdAcidCheckStoreSelector")
    var enablePassCartIdAcidCheckStoreSelector: Boolean, // true
    @SerializedName("enablePickupOnShippingIntent")
    var enablePickupOnShippingIntent: Boolean, // true
    @SerializedName("enablePreselectionV2UserIntentOverReservation")
    var enablePreselectionV2UserIntentOverReservation: Boolean, // false
    @SerializedName("enablePriorityTimes")
    var enablePriorityTimes: Boolean, // true
    @SerializedName("enablePriorityTimesIntegratedSignup")
    var enablePriorityTimesIntegratedSignup: Boolean, // true
    @SerializedName("enableReReserveSlot")
    var enableReReserveSlot: Boolean, // true
    @SerializedName("enableReservationNotAcceptableFix")
    var enableReservationNotAcceptableFix: Boolean, // true
    @SerializedName("enableSlotPreSelectionV2")
    var enableSlotPreSelectionV2: Boolean, // true
    @SerializedName("enableStoreHours")
    var enableStoreHours: Boolean, // true
    @SerializedName("enableStorePagesAndFinder")
    var enableStorePagesAndFinder: Boolean, // false
    @SerializedName("enableStoreSelectorFeedback")
    var enableStoreSelectorFeedback: Boolean, // true
    @SerializedName("enableStoreSelectorMarketplacePickup")
    var enableStoreSelectorMarketplacePickup: Boolean, // true
    @SerializedName("enableStoreSelectorUnauthorizedAccessToCartErrorFix")
    var enableStoreSelectorUnauthorizedAccessToCartErrorFix: Boolean, // true
    @SerializedName("enableUnauthorizedAccessToCartErrorFix")
    var enableUnauthorizedAccessToCartErrorFix: Boolean, // true
    @SerializedName("enableUseCurrentLocation")
    var enableUseCurrentLocation: Boolean, // true
    @SerializedName("enableUseCurrentLocationFromBrowser")
    var enableUseCurrentLocationFromBrowser: Boolean, // false
    @SerializedName("enableWalmartPlus")
    var enableWalmartPlus: Boolean, // true
    @SerializedName("enableWalmartPlusIntegratedSignUp")
    var enableWalmartPlusIntegratedSignUp: Boolean, // true
    @SerializedName("enableWirelessPostpaid")
    var enableWirelessPostpaid: Boolean, // true
    @SerializedName("enableWplusCashback")
    var enableWplusCashback: Boolean, // false
    @SerializedName("enableWplusOldBannerUI")
    var enableWplusOldBannerUI: Boolean, // false
    @SerializedName("enableWplusRemoveBannersCardCheck")
    var enableWplusRemoveBannersCardCheck: Boolean, // true
    @SerializedName("enableZeroDeliverySlotPriceFree")
    var enableZeroDeliverySlotPriceFree: Boolean, // false
    @SerializedName("evergreenNonMemberHolidayDiscountStrikeoutPrice")
    var evergreenNonMemberHolidayDiscountStrikeoutPrice: String, // 12.95
    @SerializedName("evergreenWPlusMemberHolidayDiscountStrikeoutPrice")
    var evergreenWPlusMemberHolidayDiscountStrikeoutPrice: String, // 5
    @SerializedName("expressDeliveryOnlyStores")
    var expressDeliveryOnlyStores: Boolean, // true
    @SerializedName("gmStoreMessageForNoUSPSlot")
    var gmStoreMessageForNoUSPSlot: Boolean, // true
    @SerializedName("hidePickupSlotPrice")
    var hidePickupSlotPrice: Boolean, // true
    @SerializedName("hideStoreChooserDefaultAlert")
    var hideStoreChooserDefaultAlert: Boolean, // true
    @SerializedName("maxCountOfStoresForInventory")
    var maxCountOfStoresForInventory: Int, // 8
    @SerializedName("mergeSlotsEnable")
    var mergeSlotsEnable: Boolean, // true
    @SerializedName("nodeSelectableOnlineEnable")
    var nodeSelectableOnlineEnable: Boolean, // true
    @SerializedName("projectThunderbolt")
    var projectThunderbolt: Boolean, // true
    @SerializedName("refreshCPOnStoreChange")
    var refreshCPOnStoreChange: Boolean, // false
    @SerializedName("tempoCacheExpirationInSeconds")
    var tempoCacheExpirationInSeconds: Int, // 300
    @SerializedName("walmartPlusFreeDelivery")
    var walmartPlusFreeDelivery: Boolean // true
)

data class AllXXX(
    @SerializedName("apparelScriptSrc")
    var apparelScriptSrc: String, // https://web-assets.stylitics.com/v3-classic/latest/classic.release.js
    @SerializedName("apparelUsername")
    var apparelUsername: String, // walmart
    @SerializedName("calculateFooterPositionOnResize")
    var calculateFooterPositionOnResize: Boolean, // true
    @SerializedName("cartQueryStaleTime")
    var cartQueryStaleTime: Int, // 240000
    @SerializedName("defaultSalesWeight")
    var defaultSalesWeight: Double, // 0.25
    @SerializedName("disableCartIconPriceTotal")
    var disableCartIconPriceTotal: Boolean, // false
    @SerializedName("disableCartPartialIntentWarning")
    var disableCartPartialIntentWarning: Boolean, // true
    @SerializedName("disableEstTotalOnMweb")
    var disableEstTotalOnMweb: Boolean, // false
    @SerializedName("disableGetCartCSR")
    var disableGetCartCSR: Boolean, // false
    @SerializedName("disableGuestPartialXO")
    var disableGuestPartialXO: Boolean, // true
    @SerializedName("disableItemLevelMSI")
    var disableItemLevelMSI: Boolean, // false
    @SerializedName("disableNoTimesMessage")
    var disableNoTimesMessage: Boolean, // true
    @SerializedName("disableP13nOnPAC")
    var disableP13nOnPAC: Boolean, // false
    @SerializedName("enableACCNonServiceableErrorUI")
    var enableACCNonServiceableErrorUI: Boolean, // true
    @SerializedName("enableACCOnPAC")
    var enableACCOnPAC: Boolean, // false
    @SerializedName("enableACCScheduling")
    var enableACCScheduling: Boolean, // true
    @SerializedName("enableACCVariant")
    var enableACCVariant: Int, // 1
    @SerializedName("enableAEBadge")
    var enableAEBadge: Boolean, // true
    @SerializedName("enableATCAnimation")
    var enableATCAnimation: Boolean, // false
    @SerializedName("enableATCOptimization")
    var enableATCOptimization: Boolean, // true
    @SerializedName("enableATCRateLimitingMessage")
    var enableATCRateLimitingMessage: Boolean, // true
    @SerializedName("enableATFGiftingUI")
    var enableATFGiftingUI: Boolean, // false
    @SerializedName("enableAccModalOnItemPage")
    var enableAccModalOnItemPage: Boolean, // true
    @SerializedName("enableAccSchedulingFindStores")
    var enableAccSchedulingFindStores: Boolean, // true
    @SerializedName("enableAddOnServicesPAC")
    var enableAddOnServicesPAC: Boolean, // true
    @SerializedName("enableAffirm")
    var enableAffirm: Boolean, // true
    @SerializedName("enableAuthErrorFix")
    var enableAuthErrorFix: Boolean, // true
    @SerializedName("enableBenefitSavings")
    var enableBenefitSavings: Boolean, // true
    @SerializedName("enableCTLMultipleLooks")
    var enableCTLMultipleLooks: Boolean, // true
    @SerializedName("enableCTLProductTitle")
    var enableCTLProductTitle: Boolean, // true
    @SerializedName("enableCTLQuickShop")
    var enableCTLQuickShop: Boolean, // true
    @SerializedName("enableCTLQuickShopLabel")
    var enableCTLQuickShopLabel: Boolean, // false
    @SerializedName("enableCXOPrefetch")
    var enableCXOPrefetch: Boolean, // true
    @SerializedName("enableCallouts")
    var enableCallouts: Boolean, // false
    @SerializedName("enableCapOne")
    var enableCapOne: Boolean, // true
    @SerializedName("enableCapOneRewards")
    var enableCapOneRewards: Boolean, // true
    @SerializedName("enableCarePlansAndHomeServices")
    var enableCarePlansAndHomeServices: Boolean, // true
    @SerializedName("enableCartBookslotShortcut")
    var enableCartBookslotShortcut: Boolean, // true
    @SerializedName("enableCartGIC")
    var enableCartGIC: Boolean, // true
    @SerializedName("enableCartLevelMSI")
    var enableCartLevelMSI: Boolean, // false
    @SerializedName("enableCartLight")
    var enableCartLight: Boolean, // false
    @SerializedName("enableCartWplusBannerNoSlotSelected")
    var enableCartWplusBannerNoSlotSelected: Boolean, // true
    @SerializedName("enableCartWplusBannerPickup")
    var enableCartWplusBannerPickup: Boolean, // true
    @SerializedName("enableCartWplusBannerShippingMoreThanMin")
    var enableCartWplusBannerShippingMoreThanMin: Boolean, // true
    @SerializedName("enableCartWplusBannerTempo")
    var enableCartWplusBannerTempo: Boolean, // true
    @SerializedName("enableClearMergeCartId")
    var enableClearMergeCartId: Boolean, // true
    @SerializedName("enableClearMergeCartSFL")
    var enableClearMergeCartSFL: Boolean, // true
    @SerializedName("enableClipRewards")
    var enableClipRewards: Boolean, // false
    @SerializedName("enableCompleteTheLook")
    var enableCompleteTheLook: Boolean, // true
    @SerializedName("enableCompleteTheLookLabels")
    var enableCompleteTheLookLabels: Boolean, // false
    @SerializedName("enableCrossPollination")
    var enableCrossPollination: Boolean, // true
    @SerializedName("enableDetailedPartialXoLabel")
    var enableDetailedPartialXoLabel: Boolean, // false
    @SerializedName("enableEarlyAccess")
    var enableEarlyAccess: Boolean, // true
    @SerializedName("enableEarlyRecos")
    var enableEarlyRecos: Boolean, // true
    @SerializedName("enableEbt")
    var enableEbt: Boolean, // true
    @SerializedName("enableEnhancedEmptyCart")
    var enableEnhancedEmptyCart: Boolean, // true
    @SerializedName("enableEnhancedItemUpdates")
    var enableEnhancedItemUpdates: Boolean, // true
    @SerializedName("enableEnhancedSavings")
    var enableEnhancedSavings: Boolean, // true
    @SerializedName("enableEvergreenFee")
    var enableEvergreenFee: Boolean, // true
    @SerializedName("enableExpandModeForSubscriptionItems")
    var enableExpandModeForSubscriptionItems: Boolean, // false
    @SerializedName("enableExpressReservationEndTime")
    var enableExpressReservationEndTime: Boolean, // false
    @SerializedName("enableExpressUpsell")
    var enableExpressUpsell: Boolean, // true
    @SerializedName("enableFCTodayTomorrowHeader")
    var enableFCTodayTomorrowHeader: Boolean, // true
    @SerializedName("enableFFCollapseMode")
    var enableFFCollapseMode: Boolean, // false
    @SerializedName("enableFFModuleHideUnhideCarrot")
    var enableFFModuleHideUnhideCarrot: Boolean, // true
    @SerializedName("enableFPCEAosVariant")
    var enableFPCEAosVariant: Int, // 4
    @SerializedName("enableFPCEHeader")
    var enableFPCEHeader: Boolean, // true
    @SerializedName("enableFeeThresholdBar")
    var enableFeeThresholdBar: Boolean, // false
    @SerializedName("enableForceFooterVisibility")
    var enableForceFooterVisibility: Boolean, // true
    @SerializedName("enableFreeAmendAndReturn")
    var enableFreeAmendAndReturn: Boolean, // false
    @SerializedName("enableFreeShippingAndPickup")
    var enableFreeShippingAndPickup: Boolean, // true
    @SerializedName("enableFulfillmentFunnel")
    var enableFulfillmentFunnel: Boolean, // true
    @SerializedName("enableFulfillmentGroupId")
    var enableFulfillmentGroupId: Boolean, // true
    @SerializedName("enableFulfillmentHeadersV2")
    var enableFulfillmentHeadersV2: Boolean, // true
    @SerializedName("enableFullPagePAC")
    var enableFullPagePAC: Boolean, // true
    @SerializedName("enableFullPageSignin")
    var enableFullPageSignin: Boolean, // true
    @SerializedName("enableGXOSignInNudge")
    var enableGXOSignInNudge: Boolean, // true
    @SerializedName("enableGenericWalmartCash")
    var enableGenericWalmartCash: Boolean, // true
    @SerializedName("enableGetCartAuthErrorRefetch")
    var enableGetCartAuthErrorRefetch: Boolean, // true
    @SerializedName("enableGiftingCheckbox")
    var enableGiftingCheckbox: Boolean, // true
    @SerializedName("enableGroceryPAC")
    var enableGroceryPAC: Boolean, // true
    @SerializedName("enableGuestCheckout")
    var enableGuestCheckout: Boolean, // true
    @SerializedName("enableHelium")
    var enableHelium: Boolean, // true
    @SerializedName("enableHideOrderCutOffAtSLAGroupLevel")
    var enableHideOrderCutOffAtSLAGroupLevel: Boolean, // false
    @SerializedName("enableHotCartFeature")
    var enableHotCartFeature: Boolean, // false
    @SerializedName("enableI18n")
    var enableI18n: Int, // 0
    @SerializedName("enableIbotta")
    var enableIbotta: Boolean, // true
    @SerializedName("enableInHomeDelivery")
    var enableInHomeDelivery: Boolean, // true
    @SerializedName("enableIntentControl")
    var enableIntentControl: Boolean, // true
    @SerializedName("enableItemNotSwitchableBadge")
    var enableItemNotSwitchableBadge: Boolean, // false
    @SerializedName("enableItemSwitchableBadge")
    var enableItemSwitchableBadge: Boolean, // false
    @SerializedName("enableItemSwitchableTempBadge")
    var enableItemSwitchableTempBadge: Boolean, // false
    @SerializedName("enableItemUpdates")
    var enableItemUpdates: Boolean, // true
    @SerializedName("enableLargeImagesMWeb")
    var enableLargeImagesMWeb: Boolean, // false
    @SerializedName("enableLastCall")
    var enableLastCall: Boolean, // true
    @SerializedName("enableLastCallFullPage")
    var enableLastCallFullPage: Boolean, // false
    @SerializedName("enableLastCallNonRoutine")
    var enableLastCallNonRoutine: Boolean, // false
    @SerializedName("enableLastCallPhase2")
    var enableLastCallPhase2: Boolean, // false
    @SerializedName("enableLeanMode")
    var enableLeanMode: Boolean, // true
    @SerializedName("enableLeanModeATC")
    var enableLeanModeATC: Boolean, // true
    @SerializedName("enableLeanModeSFL")
    var enableLeanModeSFL: Boolean, // false
    @SerializedName("enableLoadAfterATF")
    var enableLoadAfterATF: Boolean, // false
    @SerializedName("enableLoopItemUpdates")
    var enableLoopItemUpdates: Boolean, // true
    @SerializedName("enableMPStoreSelector")
    var enableMPStoreSelector: Boolean, // true
    @SerializedName("enableMiniCart")
    var enableMiniCart: Boolean, // false
    @SerializedName("enableMpPickupPhase2")
    var enableMpPickupPhase2: Boolean, // false
    @SerializedName("enableMultiline")
    var enableMultiline: Boolean, // true
    @SerializedName("enableNewSignInBenefitCards")
    var enableNewSignInBenefitCards: Boolean, // true
    @SerializedName("enableNonConfigBundles")
    var enableNonConfigBundles: Boolean, // true
    @SerializedName("enableOOSAlertScroll")
    var enableOOSAlertScroll: Boolean, // true
    @SerializedName("enableOOSHotFix")
    var enableOOSHotFix: Boolean, // true
    @SerializedName("enableOmniPromise")
    var enableOmniPromise: Boolean, // true
    @SerializedName("enableOnXoMoveOosToSfl")
    var enableOnXoMoveOosToSfl: Boolean, // false
    @SerializedName("enableOnePl")
    var enableOnePl: Boolean, // false
    @SerializedName("enableOrderCutOffLSTimezone")
    var enableOrderCutOffLSTimezone: Boolean, // false
    @SerializedName("enableOrderCutOffTimeInline")
    var enableOrderCutOffTimeInline: Boolean, // false
    @SerializedName("enablePAC")
    var enablePAC: Boolean, // true
    @SerializedName("enablePACAOSVariants")
    var enablePACAOSVariants: Int, // 1
    @SerializedName("enablePACCheckout")
    var enablePACCheckout: Boolean, // false
    @SerializedName("enablePACRedirectOnDismiss")
    var enablePACRedirectOnDismiss: Boolean, // false
    @SerializedName("enablePartialCheckout")
    var enablePartialCheckout: Boolean, // true
    @SerializedName("enablePartialSwitchModuleLevel")
    var enablePartialSwitchModuleLevel: Boolean, // false
    @SerializedName("enablePickUpSwitchSubscriptionPopup")
    var enablePickUpSwitchSubscriptionPopup: Boolean, // true
    @SerializedName("enablePickupNotAvailable")
    var enablePickupNotAvailable: Boolean, // false
    @SerializedName("enablePickupNotAvailableVariation2")
    var enablePickupNotAvailableVariation2: Boolean, // false
    @SerializedName("enablePostLoadDeals")
    var enablePostLoadDeals: Boolean, // true
    @SerializedName("enablePriceChange")
    var enablePriceChange: Boolean, // true
    @SerializedName("enableProductTileV2")
    var enableProductTileV2: Boolean, // true
    @SerializedName("enableQueueing")
    var enableQueueing: Boolean, // true
    @SerializedName("enableRecommendationsPhase2")
    var enableRecommendationsPhase2: Boolean, // true
    @SerializedName("enableRegistry")
    var enableRegistry: Boolean, // true
    @SerializedName("enableReturnsLabel")
    var enableReturnsLabel: Boolean, // true
    @SerializedName("enableSFL")
    var enableSFL: Boolean, // true
    @SerializedName("enableSFLGrid")
    var enableSFLGrid: Boolean, // true
    @SerializedName("enableSFLMoveToCartOptimization")
    var enableSFLMoveToCartOptimization: Boolean, // true
    @SerializedName("enableSFLPerformanceMode")
    var enableSFLPerformanceMode: Boolean, // false
    @SerializedName("enableSFLSmileyPrice")
    var enableSFLSmileyPrice: Boolean, // true
    @SerializedName("enableSSR")
    var enableSSR: Boolean, // false
    @SerializedName("enableSSRRedirect")
    var enableSSRRedirect: Boolean, // false
    @SerializedName("enableSetPickupMutation")
    var enableSetPickupMutation: Boolean, // true
    @SerializedName("enableSetShippingOrDeliveryMutation")
    var enableSetShippingOrDeliveryMutation: Boolean, // true
    @SerializedName("enableShippingIntent")
    var enableShippingIntent: Boolean, // true
    @SerializedName("enableShippingLabel")
    var enableShippingLabel: Boolean, // true
    @SerializedName("enableShopSimilar")
    var enableShopSimilar: Boolean, // true
    @SerializedName("enableShopSimilarForPickup")
    var enableShopSimilarForPickup: Boolean, // false
    @SerializedName("enableShopTheModelBadge")
    var enableShopTheModelBadge: Boolean, // false
    @SerializedName("enableSignInFromCart")
    var enableSignInFromCart: Boolean, // true
    @SerializedName("enableSigninBenefits")
    var enableSigninBenefits: Boolean, // true
    @SerializedName("enableSingletonATF")
    var enableSingletonATF: Boolean, // false
    @SerializedName("enableSlotShortcutImplicitIntent")
    var enableSlotShortcutImplicitIntent: Boolean, // true
    @SerializedName("enableSmartNudges")
    var enableSmartNudges: Boolean, // true
    @SerializedName("enableSmileyPricing")
    var enableSmileyPricing: Boolean, // true
    @SerializedName("enableSplashRouteAddition")
    var enableSplashRouteAddition: Boolean, // false
    @SerializedName("enableStarRatings")
    var enableStarRatings: Boolean, // false
    @SerializedName("enableStoreSnackBarMessage")
    var enableStoreSnackBarMessage: Boolean, // false
    @SerializedName("enableStylistics")
    var enableStylistics: Boolean, // false
    @SerializedName("enableStylisticsCLS")
    var enableStylisticsCLS: Boolean, // false
    @SerializedName("enableStylisticsMoodBoardDesign")
    var enableStylisticsMoodBoardDesign: Boolean, // false
    @SerializedName("enableStyliticsClassicQuickShop")
    var enableStyliticsClassicQuickShop: Boolean, // false
    @SerializedName("enableStyliticsMoodboardQuickShop")
    var enableStyliticsMoodboardQuickShop: Boolean, // false
    @SerializedName("enableSubstituteOOS")
    var enableSubstituteOOS: Boolean, // true
    @SerializedName("enableSubstituteOOSV2")
    var enableSubstituteOOSV2: Boolean, // true
    @SerializedName("enableVetApprovalRequired")
    var enableVetApprovalRequired: Boolean, // true
    @SerializedName("enableVisionItems")
    var enableVisionItems: Boolean, // false
    @SerializedName("enableVisionNoRxCheckout")
    var enableVisionNoRxCheckout: Boolean, // false
    @SerializedName("enableWalmartPlusIntegratedSignUp")
    var enableWalmartPlusIntegratedSignUp: Boolean, // true
    @SerializedName("enableWeightedItems")
    var enableWeightedItems: Boolean, // false
    @SerializedName("enableWideProductImages")
    var enableWideProductImages: Boolean, // true
    @SerializedName("enableWirelessFreebiePromo")
    var enableWirelessFreebiePromo: Boolean, // true
    @SerializedName("enableWirelessPostpaid")
    var enableWirelessPostpaid: Boolean, // true
    @SerializedName("enableWplus")
    var enableWplus: Boolean, // true
    @SerializedName("enableWplusBannersPostCartLoadPage")
    var enableWplusBannersPostCartLoadPage: Boolean, // true
    @SerializedName("enableWplusCashback")
    var enableWplusCashback: Boolean, // false
    @SerializedName("enableWplusFulfillmentBanner")
    var enableWplusFulfillmentBanner: Boolean, // true
    @SerializedName("enableWplusGuestBanner")
    var enableWplusGuestBanner: Boolean, // true
    @SerializedName("enableWplusOldBannerUI")
    var enableWplusOldBannerUI: Boolean, // true
    @SerializedName("enableWplusRemoveBannersCardCheck")
    var enableWplusRemoveBannersCardCheck: Boolean, // true
    @SerializedName("enableWplusThirtyDaystrial")
    var enableWplusThirtyDaystrial: Boolean, // true
    @SerializedName("enablelastCallOptimizatation")
    var enablelastCallOptimizatation: Boolean, // true
    @SerializedName("hideAcquisitionCardBanners")
    var hideAcquisitionCardBanners: Boolean, // false
    @SerializedName("hideGuestXOCTA")
    var hideGuestXOCTA: Boolean, // true
    @SerializedName("homeScriptSrc")
    var homeScriptSrc: String, // https://web-assets.stylitics.com/v3-moodboard/latest/moodboard.release.js
    @SerializedName("homeUsername")
    var homeUsername: String, // walmart
    @SerializedName("initialSFLCount")
    var initialSFLCount: Int, // 20
    @SerializedName("leanModeRetryLimit")
    var leanModeRetryLimit: Int, // 1
    @SerializedName("mpPickupSessionTime")
    var mpPickupSessionTime: Int, // 72
    @SerializedName("numberOfMpSeller")
    var numberOfMpSeller: Int, // 20
    @SerializedName("projectThunderbolt")
    var projectThunderbolt: Boolean, // true
    @SerializedName("savingsRecommendationTextV2")
    var savingsRecommendationTextV2: Boolean, // false
    @SerializedName("sflCountPerPagination")
    var sflCountPerPagination: Int, // 20
    @SerializedName("showPersonalization")
    var showPersonalization: Boolean, // true
    @SerializedName("showSubscriptionGuestLoginBanner")
    var showSubscriptionGuestLoginBanner: Boolean, // false
    @SerializedName("slotShortcutGetSlotsQueryCacheTime")
    var slotShortcutGetSlotsQueryCacheTime: Int, // 30000
    @SerializedName("slotShortcutMaxSlotReqCount")
    var slotShortcutMaxSlotReqCount: Int, // 15
    @SerializedName("visionOrderProperties")
    var visionOrderProperties: String // '["prescription_type","lens_type","lens_material","lens_color","lens_add_ons"]'
)

data class AllXXXX(
    @SerializedName("dbQrDownloadBottomSheetPrimaryMessageText")
    var dbQrDownloadBottomSheetPrimaryMessageText: String, // Want to check store prices?
    @SerializedName("dbQrDownloadBottomSheetSecondaryMessageText")
    var dbQrDownloadBottomSheetSecondaryMessageText: String, // Use the app to get up-to-date store prices and find items with store maps.
    @SerializedName("enableDbQrDownloadBottomSheet")
    var enableDbQrDownloadBottomSheet: Boolean, // true
    @SerializedName("enableEmailSignup")
    var enableEmailSignup: Boolean, // false
    @SerializedName("enableForceB2BLogout")
    var enableForceB2BLogout: Boolean, // true
    @SerializedName("enableInStoreWifiAppPrompt")
    var enableInStoreWifiAppPrompt: Boolean, // true
    @SerializedName("enableNativeAppDownloadBottomsheet")
    var enableNativeAppDownloadBottomsheet: Boolean, // true
    @SerializedName("enableNativeAppDownloadStickyBanner")
    var enableNativeAppDownloadStickyBanner: Boolean, // true
    @SerializedName("enablePrivacyLinkUpdate")
    var enablePrivacyLinkUpdate: Boolean, // true
    @SerializedName("enableQuickLinkSection")
    var enableQuickLinkSection: Boolean, // false
    @SerializedName("enableShopOurBrandsSection")
    var enableShopOurBrandsSection: Boolean, // false
    @SerializedName("enableXOFeedback")
    var enableXOFeedback: Boolean, // true
    @SerializedName("feedbackFetchMigrationToPlatformFetch")
    var feedbackFetchMigrationToPlatformFetch: Boolean, // true
    @SerializedName("feedbackTenantName")
    var feedbackTenantName: String,
    @SerializedName("hideContactNumber")
    var hideContactNumber: Boolean, // false
    @SerializedName("hideGiveFeedbackSection")
    var hideGiveFeedbackSection: Boolean, // true
    @SerializedName("isFullFooterEnabled")
    var isFullFooterEnabled: Boolean, // false
    @SerializedName("maxNumberOfDbQrDownloadBottomSheetViews")
    var maxNumberOfDbQrDownloadBottomSheetViews: Int, // 1
    @SerializedName("maxNumberOfNativeAppInstallPrompt")
    var maxNumberOfNativeAppInstallPrompt: Int, // 2
    @SerializedName("timeIntervalInHoursDbQrNativeAppInstallBottomSheet")
    var timeIntervalInHoursDbQrNativeAppInstallBottomSheet: Int, // 168
    @SerializedName("timeIntervalInHoursNativeAppInstallPrompt")
    var timeIntervalInHoursNativeAppInstallPrompt: Int // 24
)

data class AllXXXXX(
    @SerializedName("calloutViewsPerIdPerBSTC")
    var calloutViewsPerIdPerBSTC: Int, // 1
    @SerializedName("calloutViewsPerIdPerVTC")
    var calloutViewsPerIdPerVTC: Int, // 2
    @SerializedName("calloutsEnabled")
    var calloutsEnabled: Boolean, // true
    @SerializedName("enableDeliveryStoreSelection")
    var enableDeliveryStoreSelection: Boolean, // true
    @SerializedName("enableGIC")
    var enableGIC: Boolean, // true
    @SerializedName("enableGICAutoShowOnSessionStart")
    var enableGICAutoShowOnSessionStart: Boolean, // false
    @SerializedName("enableGoogleEnhancedPlaceActions")
    var enableGoogleEnhancedPlaceActions: Boolean, // true
    @SerializedName("enableL0SeoLinksForAllPage")
    var enableL0SeoLinksForAllPage: Boolean, // false
    @SerializedName("enableL0SeoLinksForItemPage")
    var enableL0SeoLinksForItemPage: Boolean, // true
    @SerializedName("enableLightweightHeader")
    var enableLightweightHeader: Boolean, // false
    @SerializedName("enableLocalizedStringInGIC")
    var enableLocalizedStringInGIC: Boolean, // false
    @SerializedName("enableMultipleInhomeAddresses")
    var enableMultipleInhomeAddresses: Boolean, // false
    @SerializedName("enableNavClickability")
    var enableNavClickability: Boolean, // true
    @SerializedName("enableReorder")
    var enableReorder: Boolean, // false
    @SerializedName("enableResponsiveHF")
    var enableResponsiveHF: Boolean, // true
    @SerializedName("enableStickyGIC")
    var enableStickyGIC: Boolean, // true
    @SerializedName("enableTADropdown")
    var enableTADropdown: Boolean, // false
    @SerializedName("enableWplusLogoOnSiteHeader")
    var enableWplusLogoOnSiteHeader: Boolean, // true
    @SerializedName("enabledGICRetentionPrompt")
    var enabledGICRetentionPrompt: Boolean, // false
    @SerializedName("fetchLocation")
    var fetchLocation: Boolean, // false
    @SerializedName("fetchLocationCSROnLoad")
    var fetchLocationCSROnLoad: Boolean, // true
    @SerializedName("flyOutExpandOnClick")
    var flyOutExpandOnClick: Boolean, // true
    @SerializedName("heartingEnhancementsEnable")
    var heartingEnhancementsEnable: Boolean, // false
    @SerializedName("hideServiceWidget")
    var hideServiceWidget: Boolean, // true
    @SerializedName("isAlertBarEnabled")
    var isAlertBarEnabled: Boolean, // true
    @SerializedName("maxCalloutsPerBSTC")
    var maxCalloutsPerBSTC: Int, // 4
    @SerializedName("navLinks")
    var navLinks: String, // '[{"name": "Grocery","link": "https://www.walmart.com/cp/1735450"},{"name": "Tech","link": "https://www.walmart.com/cp/electronics/3944"},{"name": "Fashion","link": "https://www.walmart.com/cp/clothing/5438"},{"name": "Home","link": "https://www.walmart.com/cp/home/4044"},{"name": "Patio & garden","link": "https://www.walmart.com/cp/patio-garden/5428"},{"name": "National donut day","link": "https://www.walmart.com/shop/national-donut-day"},{"name": "Deals","link": "https://www.walmart.com/shop/deals"},{"name": "Walmart+","link": "https://www.walmart.com/plus"}]'
    @SerializedName("showAddressLineOne")
    var showAddressLineOne: Boolean, // true
    @SerializedName("showNavLinks")
    var showNavLinks: Boolean, // true
    @SerializedName("showOptOut")
    var showOptOut: Boolean // false
)

data class AllXXXXXX(
    @SerializedName("alwaysAllowedTagList")
    var alwaysAllowedTagList: String,
    @SerializedName("enableBeaconDefer")
    var enableBeaconDefer: Boolean, // false
    @SerializedName("enableQuantumMetric")
    var enableQuantumMetric: Boolean, // false
    @SerializedName("enableScriptDefer")
    var enableScriptDefer: Boolean, // false
    @SerializedName("enableV1Schema")
    var enableV1Schema: Boolean, // true
    @SerializedName("logLevel")
    var logLevel: String // info
)

data class AllXXXXXXX(
    @SerializedName("atfDwebGridCount")
    var atfDwebGridCount: Int, // 10
    @SerializedName("atfMwebListCount")
    var atfMwebListCount: Int, // 2
    @SerializedName("bannerModulesEnable")
    var bannerModulesEnable: Boolean, // true
    @SerializedName("bannerModulesEnableSearch")
    var bannerModulesEnableSearch: Boolean, // true
    @SerializedName("bookSlotPersistentFilterEnable")
    var bookSlotPersistentFilterEnable: Boolean, // false
    @SerializedName("clientFetchTimeoutMs")
    var clientFetchTimeoutMs: Int, // 15000
    @SerializedName("displayMobileATCJustified")
    var displayMobileATCJustified: Boolean, // true
    @SerializedName("displayMobileATCLeftAligned")
    var displayMobileATCLeftAligned: Boolean, // false
    @SerializedName("displayMobileATCRightAligned")
    var displayMobileATCRightAligned: Boolean, // false
    @SerializedName("dwebGridProductCount")
    var dwebGridProductCount: Int, // 20
    @SerializedName("enableAOS")
    var enableAOS: Boolean, // false
    @SerializedName("enableAOSPanel")
    var enableAOSPanel: Boolean, // false
    @SerializedName("enableAccInstallation")
    var enableAccInstallation: Boolean, // true
    @SerializedName("enableAspectRecommendation")
    var enableAspectRecommendation: Boolean, // false
    @SerializedName("enableBrowsingHistory")
    var enableBrowsingHistory: Boolean, // false
    @SerializedName("enableColorSwatch")
    var enableColorSwatch: Boolean, // true
    @SerializedName("enableDeprioritizeTailImages")
    var enableDeprioritizeTailImages: Boolean, // false
    @SerializedName("enableDynamicFitment")
    var enableDynamicFitment: Boolean, // false
    @SerializedName("enableExternalInfoUrl")
    var enableExternalInfoUrl: Boolean, // true
    @SerializedName("enableFIDLogging")
    var enableFIDLogging: Boolean, // true
    @SerializedName("enableFacetCount")
    var enableFacetCount: Boolean, // true
    @SerializedName("enableFacetExpansion")
    var enableFacetExpansion: Boolean, // false
    @SerializedName("enableFacetedFilterBar")
    var enableFacetedFilterBar: Boolean, // false
    @SerializedName("enableFacetedFilterBarVarC")
    var enableFacetedFilterBarVarC: Boolean, // false
    @SerializedName("enableFashionTopNav")
    var enableFashionTopNav: Boolean, // false
    @SerializedName("enableFlattenedFitment")
    var enableFlattenedFitment: Boolean, // true
    @SerializedName("enableFulfillmentBadge")
    var enableFulfillmentBadge: Boolean, // true
    @SerializedName("enableFulfillmentMethodDemo")
    var enableFulfillmentMethodDemo: Boolean, // false
    @SerializedName("enableGIC")
    var enableGIC: Boolean, // true
    @SerializedName("enableGoldenReview")
    var enableGoldenReview: Boolean, // false
    @SerializedName("enableGrapqlQueryParams")
    var enableGrapqlQueryParams: Boolean, // true
    @SerializedName("enableGridLayoutForFashion")
    var enableGridLayoutForFashion: Boolean, // false
    @SerializedName("enableHighResImagesForSearch")
    var enableHighResImagesForSearch: Boolean, // false
    @SerializedName("enableHotPac")
    var enableHotPac: Boolean, // false
    @SerializedName("enableIntersectedSearchResults")
    var enableIntersectedSearchResults: Boolean, // false
    @SerializedName("enableInvalidateGICQuery")
    var enableInvalidateGICQuery: Boolean, // true
    @SerializedName("enableItemStackLazyLoading")
    var enableItemStackLazyLoading: Boolean, // false
    @SerializedName("enableLCPHighFetchPriority")
    var enableLCPHighFetchPriority: Boolean, // true
    @SerializedName("enableLCPSingleImagePrefetch")
    var enableLCPSingleImagePrefetch: Boolean, // false
    @SerializedName("enableLCPSingleImagePrefetchScaleFallback")
    var enableLCPSingleImagePrefetchScaleFallback: Boolean, // false
    @SerializedName("enableLHNCategoryTree")
    var enableLHNCategoryTree: Boolean, // false
    @SerializedName("enableLHNFilterUpdateGQLCall")
    var enableLHNFilterUpdateGQLCall: Boolean, // true
    @SerializedName("enableLeftHandNav")
    var enableLeftHandNav: Boolean, // true
    @SerializedName("enableLimitedLinesInTitles")
    var enableLimitedLinesInTitles: Boolean, // false
    @SerializedName("enableLimitedLinesInTitlesByCategories")
    var enableLimitedLinesInTitlesByCategories: String, // fashion
    @SerializedName("enableMaxWidth")
    var enableMaxWidth: Boolean, // true
    @SerializedName("enableNUps")
    var enableNUps: Boolean, // true
    @SerializedName("enableNUpsSearch")
    var enableNUpsSearch: Boolean, // true
    @SerializedName("enableNewPriceFormatType")
    var enableNewPriceFormatType: Int, // 2
    @SerializedName("enableNewStackedRecallNoResult")
    var enableNewStackedRecallNoResult: Boolean, // true
    @SerializedName("enableOLImageSize")
    var enableOLImageSize: Boolean, // true
    @SerializedName("enablePAC")
    var enablePAC: Boolean, // true
    @SerializedName("enablePaginationIO")
    var enablePaginationIO: Boolean, // false
    @SerializedName("enablePortableFacets")
    var enablePortableFacets: Boolean, // true
    @SerializedName("enablePricingDisclaimer")
    var enablePricingDisclaimer: Boolean, // true
    @SerializedName("enableProductTile2xImageDimension")
    var enableProductTile2xImageDimension: Boolean, // false
    @SerializedName("enableRelatedSearchHorizontalPills")
    var enableRelatedSearchHorizontalPills: Boolean, // true
    @SerializedName("enableRelatedSearches")
    var enableRelatedSearches: Boolean, // true
    @SerializedName("enableRemoveEmptyProductFlagRows")
    var enableRemoveEmptyProductFlagRows: Boolean, // false
    @SerializedName("enableRemoveEmptyProductVariantRows")
    var enableRemoveEmptyProductVariantRows: Boolean, // false
    @SerializedName("enableRemovePadding")
    var enableRemovePadding: Boolean, // false
    @SerializedName("enableScrollBasedLazyLoading")
    var enableScrollBasedLazyLoading: Boolean, // false
    @SerializedName("enableSearchHotBadge")
    var enableSearchHotBadge: Boolean, // false
    @SerializedName("enableSearchPageSSR")
    var enableSearchPageSSR: Boolean, // true
    @SerializedName("enableSearchSSRParallelQueries")
    var enableSearchSSRParallelQueries: Boolean, // false
    @SerializedName("enableSearchSkinnyBanner")
    var enableSearchSkinnyBanner: Boolean, // false
    @SerializedName("enableSecondaryStackType")
    var enableSecondaryStackType: Int, // 0
    @SerializedName("enableSimilarItems")
    var enableSimilarItems: Boolean, // true
    @SerializedName("enableSingleItemTopResult")
    var enableSingleItemTopResult: Boolean, // false
    @SerializedName("enableSpecificLazyFeature")
    var enableSpecificLazyFeature: String,
    @SerializedName("enableSplitDataCall")
    var enableSplitDataCall: Boolean, // false
    @SerializedName("enableStickyDisclaimerBar")
    var enableStickyDisclaimerBar: Boolean, // false
    @SerializedName("enableStylesheetsForInlineStyles")
    var enableStylesheetsForInlineStyles: Boolean, // false
    @SerializedName("enableSubscriptionFeature")
    var enableSubscriptionFeature: Boolean, // false
    @SerializedName("enableSwatchesOnTopicPage")
    var enableSwatchesOnTopicPage: Boolean, // true
    @SerializedName("enableTopNavItemStack")
    var enableTopNavItemStack: Boolean, // false
    @SerializedName("enableTopNavUpdateGQLCall")
    var enableTopNavUpdateGQLCall: Boolean, // true
    @SerializedName("enableValuePricing")
    var enableValuePricing: Boolean, // true
    @SerializedName("enableVariantDynamicText")
    var enableVariantDynamicText: Boolean, // false
    @SerializedName("enableVariantItemSmile")
    var enableVariantItemSmile: Boolean, // true
    @SerializedName("enableVariantsPagination")
    var enableVariantsPagination: Boolean, // true
    @SerializedName("enableViewportThreshold")
    var enableViewportThreshold: Boolean, // true
    @SerializedName("enableVisionCenterBadgeSearch")
    var enableVisionCenterBadgeSearch: Boolean, // true
    @SerializedName("enableWPlusBadge")
    var enableWPlusBadge: Boolean, // false
    @SerializedName("enableWPlusBadgeByCategories")
    var enableWPlusBadgeByCategories: String,
    @SerializedName("fetchItemsV2Enable")
    var fetchItemsV2Enable: Boolean, // true
    @SerializedName("fetchTimeoutMs")
    var fetchTimeoutMs: Int, // 7000
    @SerializedName("fitmentModulesEnable")
    var fitmentModulesEnable: Boolean, // true
    @SerializedName("fitmentTopicPageEnable")
    var fitmentTopicPageEnable: Boolean, // true
    @SerializedName("hideProductTileWhiteSpace")
    var hideProductTileWhiteSpace: Boolean, // false
    @SerializedName("imageSizeEnum")
    var imageSizeEnum: Int, // 3
    @SerializedName("interesectedResultsBottomMargin")
    var interesectedResultsBottomMargin: Double, // 1.5
    @SerializedName("lazyLoadMS")
    var lazyLoadMS: Int, // 0
    @SerializedName("lcpImageQuality")
    var lcpImageQuality: String, // 1
    @SerializedName("listViewEnum")
    var listViewEnum: Int, // 1
    @SerializedName("mwebGridProductCount")
    var mwebGridProductCount: Int, // 8
    @SerializedName("mwebListProductCount")
    var mwebListProductCount: Int, // 4
    @SerializedName("omitSortFacetParam")
    var omitSortFacetParam: Boolean, // false
    @SerializedName("partialRenderEnable")
    var partialRenderEnable: Boolean, // true
    @SerializedName("postProcessedQueryEnable")
    var postProcessedQueryEnable: Boolean, // true
    @SerializedName("pricingDisclaimerText")
    var pricingDisclaimerText: String, // Price when purchased online
    @SerializedName("productTile2xImageDimensions")
    var productTile2xImageDimensions: String, // 612,612
    @SerializedName("removeLHNDuplicates")
    var removeLHNDuplicates: Boolean, // false
    @SerializedName("searchPageBuyNowType")
    var searchPageBuyNowType: Int, // 0
    @SerializedName("searchPersistentFilterEnable")
    var searchPersistentFilterEnable: Boolean, // false
    @SerializedName("secondaryQuerySwitch")
    var secondaryQuerySwitch: Boolean, // false
    @SerializedName("seoModulesEnable")
    var seoModulesEnable: Boolean, // true
    @SerializedName("showARExperienceBadging")
    var showARExperienceBadging: Boolean, // false
    @SerializedName("showFilterTooltip")
    var showFilterTooltip: Boolean, // false
    @SerializedName("skipGICIntent")
    var skipGICIntent: Boolean, // true
    @SerializedName("smileVariation")
    var smileVariation: Int, // 2
    @SerializedName("splitDataCallLimit")
    var splitDataCallLimit: Int, // 10
    @SerializedName("subscriptionHeaderImage")
    var subscriptionHeaderImage: String, // https://i5.walmartimages.com/dfw/63fd9f59-66cc/af8fd81e-b326-47e6-b1b5-f3dd515182e6/v1/wplus-logo-blue.svg
    @SerializedName("subscriptionZeroPercentDiscountBadgeEnabled")
    var subscriptionZeroPercentDiscountBadgeEnabled: Boolean, // true
    @SerializedName("threeColumnGrid")
    var threeColumnGrid: Boolean, // false
    @SerializedName("tileTakeOver")
    var tileTakeOver: Boolean, // true
    @SerializedName("tileTakeOverSearch")
    var tileTakeOverSearch: Boolean, // true
    @SerializedName("topResultHeader")
    var topResultHeader: String,
    @SerializedName("topResultSubHeader")
    var topResultSubHeader: String,
    @SerializedName("topicPageSortBy")
    var topicPageSortBy: String, // best_match
    @SerializedName("viewportThresholdDesktop")
    var viewportThresholdDesktop: Double, // 0.25
    @SerializedName("viewportThresholdMobile")
    var viewportThresholdMobile: Double // 0.25
)

data class AllXXXXXXXX(
    @SerializedName("accSlotShortcutMaxSlotCount")
    var accSlotShortcutMaxSlotCount: Int, // 5
    @SerializedName("aeModuleHeaderText")
    var aeModuleHeaderText: String, // Free pickup
    @SerializedName("beaconWithQuantumMetrics")
    var beaconWithQuantumMetrics: Boolean, // false
    @SerializedName("bookSlotPersistentFilterEnable")
    var bookSlotPersistentFilterEnable: Boolean, // false
    @SerializedName("businessRewardsThresholdAmount")
    var businessRewardsThresholdAmount: String, // { "default": 250 }
    @SerializedName("cacheFooterExpireDurationMs")
    var cacheFooterExpireDurationMs: Int, // 600000
    @SerializedName("cacheFooterVersion")
    var cacheFooterVersion: Int, // 1
    @SerializedName("cacheFullFooterExpireDurationMs")
    var cacheFullFooterExpireDurationMs: Int, // 600000
    @SerializedName("cacheFullFooterVersion")
    var cacheFullFooterVersion: Int, // 1
    @SerializedName("cacheHeaderExpireDurationMs")
    var cacheHeaderExpireDurationMs: Int, // 600000
    @SerializedName("cacheHeaderVersion")
    var cacheHeaderVersion: Int, // 1
    @SerializedName("cspReportOnlyOverrides")
    var cspReportOnlyOverrides: String,
    @SerializedName("cvEndpoint")
    var cvEndpoint: String, // rest
    @SerializedName("disableAuthHeaderCheck")
    var disableAuthHeaderCheck: Boolean, // false
    @SerializedName("disableGetCartSSR")
    var disableGetCartSSR: Boolean, // true
    @SerializedName("enableACCSchedulingUpsell")
    var enableACCSchedulingUpsell: Boolean, // false
    @SerializedName("enableACCShipInsteadCTA")
    var enableACCShipInsteadCTA: Boolean, // false
    @SerializedName("enableAccUpsellVariant")
    var enableAccUpsellVariant: Int, // 1
    @SerializedName("enableAdSessionId")
    var enableAdSessionId: Boolean, // true
    @SerializedName("enableAstCookie")
    var enableAstCookie: Boolean, // true
    @SerializedName("enableAutoTmx")
    var enableAutoTmx: Boolean, // false
    @SerializedName("enableAutoTmxForAll")
    var enableAutoTmxForAll: Boolean, // true
    @SerializedName("enableBadges")
    var enableBadges: Boolean, // true
    @SerializedName("enableBenefitBadge")
    var enableBenefitBadge: Boolean, // true
    @SerializedName("enableBenefitTracker")
    var enableBenefitTracker: Boolean, // true
    @SerializedName("enableBusinessOfferCenter")
    var enableBusinessOfferCenter: Boolean, // false
    @SerializedName("enableBuyMore")
    var enableBuyMore: Boolean, // false
    @SerializedName("enableBuyNow")
    var enableBuyNow: Boolean, // true
    @SerializedName("enableBuyNowAOS")
    var enableBuyNowAOS: Boolean, // false
    @SerializedName("enableBuyNowAspectiva")
    var enableBuyNowAspectiva: Boolean, // false
    @SerializedName("enableBuyNowCXORedirect")
    var enableBuyNowCXORedirect: Boolean, // false
    @SerializedName("enableBuyNowFreeShippingNudge")
    var enableBuyNowFreeShippingNudge: Boolean, // false
    @SerializedName("enableBuyNowHot")
    var enableBuyNowHot: Boolean, // false
    @SerializedName("enableBuyNowPromiseMessage")
    var enableBuyNowPromiseMessage: Boolean, // true
    @SerializedName("enableBuyNowSFLPrompt")
    var enableBuyNowSFLPrompt: Boolean, // false
    @SerializedName("enableBuyNowSavings")
    var enableBuyNowSavings: Boolean, // false
    @SerializedName("enableBuyNowTYUrl")
    var enableBuyNowTYUrl: Boolean, // false
    @SerializedName("enableBuyNowWallet")
    var enableBuyNowWallet: Boolean, // true
    @SerializedName("enableCSRBootstrapCall")
    var enableCSRBootstrapCall: Boolean, // true
    @SerializedName("enableCartParallelFetch")
    var enableCartParallelFetch: Boolean, // true
    @SerializedName("enableChargeForSubs")
    var enableChargeForSubs: Boolean, // true
    @SerializedName("enableCheckoutProp65")
    var enableCheckoutProp65: Boolean, // true
    @SerializedName("enableCsp")
    var enableCsp: Boolean, // true
    @SerializedName("enableDigitalRewards")
    var enableDigitalRewards: Boolean, // false
    @SerializedName("enableDisplayStartTimeOnlyForACC")
    var enableDisplayStartTimeOnlyForACC: Boolean, // false
    @SerializedName("enableDynamicMainReducer")
    var enableDynamicMainReducer: Boolean, // false
    @SerializedName("enableDynamicOptionsFeedback")
    var enableDynamicOptionsFeedback: Boolean, // true
    @SerializedName("enableEBTCheckBalance")
    var enableEBTCheckBalance: Boolean, // true
    @SerializedName("enableEnhancedCarouselTiles")
    var enableEnhancedCarouselTiles: Boolean, // true
    @SerializedName("enableEnhancedCarouselTilesByCategory")
    var enableEnhancedCarouselTilesByCategory: String, // 5438
    @SerializedName("enableEvergreenSlotBranding")
    var enableEvergreenSlotBranding: Boolean, // true
    @SerializedName("enableExpressSla")
    var enableExpressSla: Boolean, // true
    @SerializedName("enableFPO")
    var enableFPO: Boolean, // true
    @SerializedName("enableFeedbackGqlMigration")
    var enableFeedbackGqlMigration: Boolean, // true
    @SerializedName("enableFeedbackSubmitPageType")
    var enableFeedbackSubmitPageType: Boolean, // true
    @SerializedName("enableFloatingAddToOrder")
    var enableFloatingAddToOrder: Boolean, // true
    @SerializedName("enableFulfillmentDisplay")
    var enableFulfillmentDisplay: Boolean, // false
    @SerializedName("enableFullPageCart")
    var enableFullPageCart: Boolean, // true
    @SerializedName("enableGICBookslot")
    var enableGICBookslot: Boolean, // true
    @SerializedName("enableGICHot")
    var enableGICHot: Boolean, // false
    @SerializedName("enableGicEngagement")
    var enableGicEngagement: Boolean, // true
    @SerializedName("enableGifting")
    var enableGifting: Boolean, // true
    @SerializedName("enableGuidedDelivery")
    var enableGuidedDelivery: Boolean, // true
    @SerializedName("enableHPO")
    var enableHPO: Boolean, // true
    @SerializedName("enableHotPacSessionTime")
    var enableHotPacSessionTime: Int, // 0
    @SerializedName("enableHotPostATC")
    var enableHotPostATC: Int, // 0
    @SerializedName("enableHpRedesign")
    var enableHpRedesign: Boolean, // true
    @SerializedName("enableHubAndSpoke")
    var enableHubAndSpoke: Boolean, // true
    @SerializedName("enableIbotta2xRewards")
    var enableIbotta2xRewards: Boolean, // false
    @SerializedName("enableInHomeGuidedDelivery")
    var enableInHomeGuidedDelivery: Boolean, // true
    @SerializedName("enableIphoneUrlParams")
    var enableIphoneUrlParams: Boolean, // false
    @SerializedName("enableLanguagePreferenceDialog")
    var enableLanguagePreferenceDialog: Boolean, // false
    @SerializedName("enableLaunchMultiSiteLogoffConfirmationModal")
    var enableLaunchMultiSiteLogoffConfirmationModal: Boolean, // true
    @SerializedName("enableLawnAndGarden")
    var enableLawnAndGarden: Boolean, // true
    @SerializedName("enableLiquorBoxAlcoholExpansionCartBookslot")
    var enableLiquorBoxAlcoholExpansionCartBookslot: Boolean, // true
    @SerializedName("enableLocalizedStringForReservation")
    var enableLocalizedStringForReservation: Boolean, // false
    @SerializedName("enableMPPickupBottomSheet")
    var enableMPPickupBottomSheet: Boolean, // true
    @SerializedName("enableNeedHelpOptions")
    var enableNeedHelpOptions: Boolean, // false
    @SerializedName("enableNewCookieSerializer")
    var enableNewCookieSerializer: Boolean, // false
    @SerializedName("enableNoOrderMinimumFee")
    var enableNoOrderMinimumFee: Boolean, // false
    @SerializedName("enableOrderDeviceInfo")
    var enableOrderDeviceInfo: Boolean, // false
    @SerializedName("enableOutOfStockFiltering")
    var enableOutOfStockFiltering: Boolean, // false
    @SerializedName("enablePartialSwitchModuleLevelCartBookslot")
    var enablePartialSwitchModuleLevelCartBookslot: Boolean, // false
    @SerializedName("enablePersistedCartId")
    var enablePersistedCartId: Boolean, // true
    @SerializedName("enablePersistedQueries")
    var enablePersistedQueries: Boolean, // true
    @SerializedName("enablePetRxManualRefill")
    var enablePetRxManualRefill: Boolean, // true
    @SerializedName("enableProductCarouselCSR")
    var enableProductCarouselCSR: Boolean, // false
    @SerializedName("enableProductTileSmileyVariant")
    var enableProductTileSmileyVariant: Boolean, // true
    @SerializedName("enableQueueSizeIncrease")
    var enableQueueSizeIncrease: Boolean, // true
    @SerializedName("enableQueueing")
    var enableQueueing: Boolean, // false
    @SerializedName("enableRebrandRewardsToCash")
    var enableRebrandRewardsToCash: Boolean, // false
    @SerializedName("enableSSRNavigation")
    var enableSSRNavigation: Boolean, // false
    @SerializedName("enableSinglePageXO")
    var enableSinglePageXO: Boolean, // true
    @SerializedName("enableSinglePaymentForm")
    var enableSinglePaymentForm: Boolean, // true
    @SerializedName("enableSinglePaymentFormWallet")
    var enableSinglePaymentFormWallet: Boolean, // true
    @SerializedName("enableSlotsParallelFetch")
    var enableSlotsParallelFetch: Boolean, // true
    @SerializedName("enableSmileNowPricing")
    var enableSmileNowPricing: Boolean, // true
    @SerializedName("enableSmileSaveBadge")
    var enableSmileSaveBadge: Boolean, // false
    @SerializedName("enableSmileWasPricing")
    var enableSmileWasPricing: Boolean, // false
    @SerializedName("enableSpendAnalyticsPhaseTwo")
    var enableSpendAnalyticsPhaseTwo: Boolean, // false
    @SerializedName("enableSubscriptionDiscounts")
    var enableSubscriptionDiscounts: Boolean, // false
    @SerializedName("enableSubscriptionsInTransaction")
    var enableSubscriptionsInTransaction: Boolean, // false
    @SerializedName("enableUngatedSubscription")
    var enableUngatedSubscription: Boolean, // false
    @SerializedName("enableWaitingHallway")
    var enableWaitingHallway: Boolean, // true
    @SerializedName("enableWalmartPlusFreeDiscountedExpress")
    var enableWalmartPlusFreeDiscountedExpress: Boolean, // true
    @SerializedName("enableWeeklyReservationCartBookslot")
    var enableWeeklyReservationCartBookslot: Boolean, // false
    @SerializedName("enableWmtpcBenefitCard")
    var enableWmtpcBenefitCard: Boolean, // true
    @SerializedName("enableWplusProgramId")
    var enableWplusProgramId: Boolean, // false
    @SerializedName("enableWplusRetentionNudge")
    var enableWplusRetentionNudge: Boolean, // true
    @SerializedName("enableWplusSignUpOffer")
    var enableWplusSignUpOffer: Boolean, // true
    @SerializedName("enableWrongStore")
    var enableWrongStore: Int, // 0
    @SerializedName("enableWrongStoreReminderDays")
    var enableWrongStoreReminderDays: Int, // 0
    @SerializedName("foo")
    var foo: Boolean, // false
    @SerializedName("helpLinkMPReturnPolicy")
    var helpLinkMPReturnPolicy: String, // https://www.walmart.com/help/article/walmart-marketplace-return-policy/63c3566a9d3546858582acae2fbfdb7e
    @SerializedName("helpLinkMobileAlertsTerms")
    var helpLinkMobileAlertsTerms: String, // https://www.walmart.com/help/article/mobile-alerts-terms-of-use/499122d9bba94d08b50e8facf42fcc82
    @SerializedName("helpLinkReturnRefunds")
    var helpLinkReturnRefunds: String, // https://www.walmart.com/help/channel/returns-and-refunds/5a33a1f61af8479e9d1bd8b727e9e761
    @SerializedName("helpLinkStorePurchase")
    var helpLinkStorePurchase: String, // https://www.walmart.com/help/article/view-store-purchases/f56a1afbf3b5428bb69f0124daa49108
    @SerializedName("helpLinkTermsOfUse")
    var helpLinkTermsOfUse: String, // https://www.walmart.com/help/article/walmart-com-terms-of-use/3b75080af40340d6bbd596f116fae5a0
    @SerializedName("isIncludeIphoneMetaTagAfilliateLinks")
    var isIncludeIphoneMetaTagAfilliateLinks: Boolean, // false
    @SerializedName("itemReservationsBannerText")
    var itemReservationsBannerText: String, // left to buy your item
    @SerializedName("legacySiteDirectspendingRedirectEnabled")
    var legacySiteDirectspendingRedirectEnabled: Boolean, // false
    @SerializedName("legacySiteEbtRedirectEnabled")
    var legacySiteEbtRedirectEnabled: Boolean, // false
    @SerializedName("legacySiteInhomeRedirectEnabled")
    var legacySiteInhomeRedirectEnabled: Boolean, // false
    @SerializedName("legacySiteNGRedirectEnabled")
    var legacySiteNGRedirectEnabled: Boolean, // false
    @SerializedName("multiSiteRedirectUrl")
    var multiSiteRedirectUrl: String, // https://business.walmart.com/
    @SerializedName("placeholder")
    var placeholder: String, // US-B2C
    @SerializedName("proSellerBadgeVisibilityType")
    var proSellerBadgeVisibilityType: Int, // 0
    @SerializedName("queueMaxRefetchDuration")
    var queueMaxRefetchDuration: Int, // 900000
    @SerializedName("queueRefetchInterval")
    var queueRefetchInterval: Int, // 5000
    @SerializedName("queueTimeToCompletePurchase")
    var queueTimeToCompletePurchase: Int, // 10
    @SerializedName("savingsRecommendationFlag")
    var savingsRecommendationFlag: Int, // 2
    @SerializedName("subscriptionManagePageUrl")
    var subscriptionManagePageUrl: String, // /subscriptions/manage
    @SerializedName("substitutionItemPriceAndQuantityClarity")
    var substitutionItemPriceAndQuantityClarity: Boolean, // false
    @SerializedName("substitutionsOptInClarity")
    var substitutionsOptInClarity: Boolean, // true
    @SerializedName("tmxPathnameRulesAllowCSV")
    var tmxPathnameRulesAllowCSV: String, // ^/cart\b,^/(wallet|payments|partner\Wplus|plus|wmcash)/,^/checkout/(pindrop|review-order),^/account/(phoneverification|profile|plus\Wmanage|payment\Wmethods|giftcards\Wbalance)
    @SerializedName("tmxPathnameRulesDisallowCSV")
    var tmxPathnameRulesDisallowCSV: String // ^/$,^/ip/,^/search,^/browse,^/shop,^/cp,^/content
)

data class DataX(
    @SerializedName("contentLayout")
    var contentLayout: ContentLayout
)

class Headers

data class ContentLayout(
    @SerializedName("modules")
    var modules: List<Module>
)

data class Module(
    @SerializedName("configs")
    var configs: Configs,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTrigger,
    @SerializedName("name")
    var name: String, // Full Footer Module - 10.25.22
    @SerializedName("type")
    var type: String // GlobalFooterLinks
)

data class Configs(
    @SerializedName("subLinks")
    var subLinks: List<SubLink>
)

data class MatchedTrigger(
    @SerializedName("zone")
    var zone: String // footerZone1
)

data class SubLink(
    @SerializedName("isSFLink")
    var isSFLink: String, // False
    @SerializedName("link")
    var link: Link,
    @SerializedName("openInNewTab")
    var openInNewTab: String // False
)

data class Link(
    @SerializedName("clickThrough")
    var clickThrough: ClickThrough,
    @SerializedName("linkText")
    var linkText: String, // All Departments
    @SerializedName("title")
    var title: String, // All Departments
    @SerializedName("uid")
    var uid: String // qxfQLilq
)

data class ClickThrough(
    @SerializedName("rawValue")
    var rawValue: String, // /all-departments
    @SerializedName("type")
    var type: String, // url
    @SerializedName("value")
    var value: String // /all-departments
)

data class DataXX(
    @SerializedName("contentLayout")
    var contentLayout: ContentLayoutX
)

data class ContentLayoutX(
    @SerializedName("modules")
    var modules: List<ModuleX>
)

data class ModuleX(
    @SerializedName("configs")
    var configs: ConfigsX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerX,
    @SerializedName("moduleId")
    var moduleId: String, // e5695db1-03c9-4ad8-87b1-3ecc7f36139a
    @SerializedName("name")
    var name: String, // New GlobalHamburgerNav Module, Monday, February 01, 2021, 10:56:25:63 am
    @SerializedName("type")
    var type: String // GlobalHamburgerNav
)

data class ConfigsX(
    @SerializedName("subCategory")
    var subCategory: List<SubCategory>
)

data class MatchedTriggerX(
    @SerializedName("zone")
    var zone: String // hamburgerNav
)

data class SubCategory(
    @SerializedName("subLinks")
    var subLinks: List<SubLinkX>
)

data class SubLinkX(
    @SerializedName("icon")
    var icon: String, // Receipt
    @SerializedName("link")
    var link: LinkX
)

data class LinkX(
    @SerializedName("clickThrough")
    var clickThrough: ClickThroughX,
    @SerializedName("linkText")
    var linkText: String, // Purchase History
    @SerializedName("title")
    var title: String, // Purchase History
    @SerializedName("uid")
    var uid: String // lClciGBL
)

data class ClickThroughX(
    @SerializedName("value")
    var value: String // /orders
)

data class DataXXX(
    @SerializedName("shouldShowWplusLogo")
    var shouldShowWplusLogo: Boolean // false
)

data class ContentLayoutXX(
    @SerializedName("layouts")
    var layouts: List<Layout>,
    @SerializedName("modules")
    var modules: List<ModuleXX>,
    @SerializedName("pageMetadata")
    var pageMetadata: PageMetadata
)

data class LayoutContainerData(
    @SerializedName("content")
    var content: List<ContentXX>,
    @SerializedName("flow")
    var flow: String, // vertical
    @SerializedName("type")
    var type: String // container
)

data class ModuleDataByZone(
    @SerializedName("bottomZone1")
    var bottomZone1: BottomZone1,
    @SerializedName("bottomZone2")
    var bottomZone2: BottomZone2,
    @SerializedName("INVALID")
    var iNVALID: INVALID,
    @SerializedName("pillsTopZone")
    var pillsTopZone: PillsTopZone,
    @SerializedName("topZone1")
    var topZone1: TopZone1,
    @SerializedName("topZone2")
    var topZone2: TopZone2,
    @SerializedName("topZone3")
    var topZone3: TopZone3,
    @SerializedName("topZone5")
    var topZone5: TopZone5,
    @SerializedName("topZone6")
    var topZone6: TopZone6
)

data class PageMetadataX(
    @SerializedName("pageContext")
    var pageContext: PageContextXXX
)

data class SearchResult(
    @SerializedName("aggregatedCount")
    var aggregatedCount: Int, // 179149
    @SerializedName("catInfo")
    var catInfo: CatInfo,
    @SerializedName("count")
    var count: Int, // 54
    @SerializedName("debug")
    var debug: Debug,
    @SerializedName("errorResponse")
    var errorResponse: ErrorResponse,
    @SerializedName("gridItemsCount")
    var gridItemsCount: Int, // 54
    @SerializedName("itemStacks")
    var itemStacks: List<ItemStack>,
    @SerializedName("nonProduct")
    var nonProduct: Any?, // null
    @SerializedName("pac")
    var pac: Any?, // null
    @SerializedName("pageMetadata")
    var pageMetadata: PageMetadataXX,
    @SerializedName("paginationV2")
    var paginationV2: PaginationV2,
    @SerializedName("relatedSearch")
    var relatedSearch: List<RelatedSearch>,
    @SerializedName("requestContext")
    var requestContext: RequestContext,
    @SerializedName("spelling")
    var spelling: Spelling,
    @SerializedName("title")
    var title: String, // Results for "computer"
    @SerializedName("translation")
    var translation: Any? // null
)

data class Layout(
    @SerializedName("id")
    var id: String, // searchDesktop
    @SerializedName("layout")
    var layout: LayoutX
)

data class ModuleXX(
    @SerializedName("configs")
    var configs: ConfigsXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXX,
    @SerializedName("moduleId")
    var moduleId: String, // d80c120b-3158-42ac-9525-9b22e6c4fbac
    @SerializedName("name")
    var name: String, // 0825 Guided Nav Pills
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // PillsModule
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 2
)

data class PageMetadata(
    @SerializedName("location")
    var location: Location,
    @SerializedName("pageContext")
    var pageContext: PageContextX
)

data class LayoutX(
    @SerializedName("channel")
    var channel: Channel,
    @SerializedName("definition")
    var definition: Definition,
    @SerializedName("name")
    var name: String, // Search Page - Desktop
    @SerializedName("status")
    var status: String, // ACTIVE
    @SerializedName("type")
    var type: String, // searchDesktop
    @SerializedName("version")
    var version: String // 1.279-SNAPSHOT 1692356330866 jenkinspan
)

data class Channel(
    @SerializedName("id")
    var id: String, // 87674fe3-1742-4650-8e11-8d0c6acfe836
    @SerializedName("status")
    var status: String // ACTIVE
)

data class Definition(
    @SerializedName("content")
    var content: List<Content>,
    @SerializedName("flow")
    var flow: String, // vertical
    @SerializedName("type")
    var type: String // container
)

data class Content(
    @SerializedName("content")
    var content: ContentX,
    @SerializedName("flow")
    var flow: String, // vertical
    @SerializedName("type")
    var type: String // container
)

data class ContentX(
    @SerializedName("id")
    var id: String, // top
    @SerializedName("mapping")
    var mapping: List<Mapping>,
    @SerializedName("type")
    var type: String // slot
)

data class Mapping(
    @SerializedName("options")
    var options: Options,
    @SerializedName("type")
    var type: String // ZONE
)

data class Options(
    @SerializedName("displayInTempo")
    var displayInTempo: Boolean?, // true
    @SerializedName("refId")
    var refId: String, // skylineZone
    @SerializedName("tempoLabel")
    var tempoLabel: String? // Stacks Zone
)

data class ConfigsXX(
    @SerializedName("ad")
    var ad: Ad?,
    @SerializedName("allSortAndFilterFacets")
    var allSortAndFilterFacets: List<AllSortAndFilterFacet>?,
    @SerializedName("fitments")
    var fitments: Any?, // null
    @SerializedName("moduleLocation")
    var moduleLocation: String?, // top
    @SerializedName("moduleSource")
    var moduleSource: String?, // chipModule
    @SerializedName("pillsV2")
    var pillsV2: List<PillsV2>?,
    @SerializedName("_rawConfigs")
    var rawConfigs: RawConfigs?,
    @SerializedName("subTitle")
    var subTitle: Any?, // null
    @SerializedName("title")
    var title: Any?, // null
    @SerializedName("topNavFacets")
    var topNavFacets: List<TopNavFacet>?,
    @SerializedName("__typename")
    var typename: String, // TempoWM_GLASSWWWPillsModuleConfigs
    @SerializedName("url")
    var url: Any?, // null
    @SerializedName("urlLinkText")
    var urlLinkText: Any?, // null
    @SerializedName("zoneV1")
    var zoneV1: List<ZoneV1>?
)

data class MatchedTriggerXX(
    @SerializedName("zone")
    var zone: String // pillsTopZone
)

data class Schedule(
    @SerializedName("priority")
    var priority: Int // 1
)

data class Ad(
    @SerializedName("adContent")
    var adContent: AdContent,
    @SerializedName("adRequestComposite")
    var adRequestComposite: AdRequestComposite,
    @SerializedName("adsContext")
    var adsContext: AdsContext,
    @SerializedName("moduleConfigs")
    var moduleConfigs: ModuleConfigs,
    @SerializedName("moduleType")
    var moduleType: String, // BrandAmplifierAd
    @SerializedName("pageContext")
    var pageContext: PageContext,
    @SerializedName("pageId")
    var pageId: String, // computer
    @SerializedName("pageType")
    var pageType: String, // SEARCH
    @SerializedName("platform")
    var platform: String, // DESKTOP
    @SerializedName("stateCode")
    var stateCode: String, // CA
    @SerializedName("status")
    var status: String, // SUCCESS
    @SerializedName("storeId")
    var storeId: String, // 3180
    @SerializedName("zipCode")
    var zipCode: String // 90060
)

data class AllSortAndFilterFacet(
    @SerializedName("expandOnLoad")
    var expandOnLoad: Boolean?, // false
    @SerializedName("isSelected")
    var isSelected: Any?, // null
    @SerializedName("layout")
    var layout: String, // default
    @SerializedName("max")
    var max: Int?, // 900
    @SerializedName("min")
    var min: Int?, // 0
    @SerializedName("name")
    var name: String, // Sort by
    @SerializedName("selectedMax")
    var selectedMax: Any?, // null
    @SerializedName("selectedMin")
    var selectedMin: Any?, // null
    @SerializedName("stepSize")
    var stepSize: Int?, // 9
    @SerializedName("title")
    var title: String, // Sort by
    @SerializedName("type")
    var type: String, // sort
    @SerializedName("unboundedMax")
    var unboundedMax: Boolean?, // true
    @SerializedName("values")
    var values: List<Value>?
)

data class PillsV2(
    @SerializedName("image")
    var image: Any?, // null
    @SerializedName("title")
    var title: String, // Shop all college
    @SerializedName("url")
    var url: String // /shop/back-to-college
)

data class RawConfigs(
    @SerializedName("lazy")
    var lazy: String?, // 3000
    @SerializedName("moduleLocation")
    var moduleLocation: String, // marquee2
    @SerializedName("title")
    var title: String? // Products you may also like
)

data class TopNavFacet(
    @SerializedName("expandOnLoad")
    var expandOnLoad: Boolean, // true
    @SerializedName("isSelected")
    var isSelected: Any?, // null
    @SerializedName("layout")
    var layout: String, // pill
    @SerializedName("max")
    var max: Int?, // 900
    @SerializedName("min")
    var min: Int?, // 0
    @SerializedName("name")
    var name: String, // In-store
    @SerializedName("selectedMax")
    var selectedMax: Any?, // null
    @SerializedName("selectedMin")
    var selectedMin: Any?, // null
    @SerializedName("stepSize")
    var stepSize: Int?, // 9
    @SerializedName("title")
    var title: String, // In-store
    @SerializedName("type")
    var type: String, // fulfillment_method_in_store
    @SerializedName("unboundedMax")
    var unboundedMax: Boolean?, // true
    @SerializedName("values")
    var values: List<ValueX>?
)

data class ZoneV1(
    @SerializedName("extraData")
    var extraData: ExtraData?,
    @SerializedName("isNativeLazyLoaded")
    var isNativeLazyLoaded: Boolean, // false
    @SerializedName("isP13nBtfModule")
    var isP13nBtfModule: Boolean, // false
    @SerializedName("moduleId")
    var moduleId: String, // 9ec9680f-fcfc-493f-8920-8734d0fb230d
    @SerializedName("zone")
    var zone: String // pillsTopZone
)

data class AdContent(
    @SerializedName("data")
    var `data`: DataXXXX,
    @SerializedName("type")
    var type: String // SPONSORED_PRODUCTS
)

data class AdRequestComposite(
    @SerializedName("categoryId")
    var categoryId: String,
    @SerializedName("facets")
    var facets: String,
    @SerializedName("isDebug")
    var isDebug: Boolean, // false
    @SerializedName("isManualShelf")
    var isManualShelf: Boolean, // false
    @SerializedName("keyword")
    var keyword: String // computer
)

data class AdsContext(
    @SerializedName("brand")
    var brand: String,
    @SerializedName("categoryId")
    var categoryId: String, // 3944_1089430_8835131_1737838_1315601
    @SerializedName("categoryName")
    var categoryName: String, // Electronics/Computers, Laptops and Tablets/Laptops by Operating System/Windows OS Laptops/Windows 11 Laptops
    @SerializedName("dedupeList")
    var dedupeList: List<String>,
    @SerializedName("itemId")
    var itemId: String,
    @SerializedName("locationContext")
    var locationContext: LocationContext,
    @SerializedName("normKeyword")
    var normKeyword: String, // computer
    @SerializedName("productName")
    var productName: String,
    @SerializedName("productTypeId")
    var productTypeId: String,
    @SerializedName("verticalId")
    var verticalId: String // ets
)

data class ModuleConfigs(
    @SerializedName("moduleLocation")
    var moduleLocation: String // top
)

data class PageContext(
    @SerializedName("searchNormalize")
    var searchNormalize: SearchNormalize
)

data class DataXXXX(
    @SerializedName("adExpInfo")
    var adExpInfo: Any?, // null
    @SerializedName("adUuid")
    var adUuid: String, // be0151ea-7f9b-440a-9186-0170b4779926
    @SerializedName("brands")
    var brands: List<Brand>,
    @SerializedName("moduleInfo")
    var moduleInfo: String, // {"adExpId":"","bucketId":"2482"}
    @SerializedName("__typename")
    var typename: String // SponsoredBrands
)

data class Brand(
    @SerializedName("logo")
    var logo: Logo,
    @SerializedName("products")
    var products: List<Product>
)

data class Logo(
    @SerializedName("featuredHeadline")
    var featuredHeadline: String, // Get Fast Performance and Smooth Video Calls
    @SerializedName("featuredImage")
    var featuredImage: String, // https://i5.walmartimages.com/dfw/9fa19e5c-b2/k2-_b61c6a5a-1cb1-4380-a0e5-8a421a6f67ea.v1.png
    @SerializedName("featuredImageName")
    var featuredImageName: String, // Chromebooks
    @SerializedName("featuredUrl")
    var featuredUrl: String, // https://www.walmart.com/browse/electronics/google-chromebooks/3944_3951_1089430_1230091_1103213
    @SerializedName("logoClickTrackUrl")
    var logoClickTrackUrl: String // https://wrd.walmart.com/track?adUid=be0151ea-7f9b-440a-9186-0170b4779926&pgId=computer&spQs=B-0ORuQ6BMVYu5ErviP0wlfKACJxxv6fmHrY7MQeyId4kgSXlKKNnrL1wOR63udZM_9klyfQoql1pGvXNoUgfgM1UprFSzrGq3mpjFI9qxdjLGOZ8k74fvX0mpZM4QDQtfIuVNtXpEOrO5D8IzCP0kbJ2FbKEmwcj6-QJlnwCyMiw6hI3xjSvqckKrAYv3Ns-XvtfY1DilOMXWEOQk1edw&storeId=3180&pt=search&mloc=sb-search-top&bkt=2482&pltfm=desktop&rdf=0&plmt=__plmt__&eventST=__eventST__&pos=__pos__&bt=__bt__&tax=3944_1089430_8835131_1737838_1315601&addlInfo=%7EsbaItems%7C862552395%7C951435754%7C2305686634%7E
)

data class Product(
    @SerializedName("availabilityStatus")
    var availabilityStatus: String, // IN_STOCK
    @SerializedName("averageRating")
    var averageRating: Double, // 4.2
    @SerializedName("badges")
    var badges: Badges,
    @SerializedName("brand")
    var brand: String, // ASUS
    @SerializedName("canonicalUrl")
    var canonicalUrl: String, // /ip/ASUS-CX1500-Chromebook-15-6-FHD-Intel-Celeron-N3350-4GB-RAM-64GB-eMMC-Chrome-OS-Mineral-Gray-CX1500CNA-WS44F/862552395
    @SerializedName("classType")
    var classType: String, // REGULAR
    @SerializedName("fulfillmentBadge")
    var fulfillmentBadge: String?, // Today
    @SerializedName("imageInfo")
    var imageInfo: ImageInfo,
    @SerializedName("name")
    var name: String, // ASUS CX1500 Chromebook, 15.6" FHD, Intel Celeron N3350, 4GB RAM, 64GB eMMC, Chrome OS, Mineral Gray, CX1500CNA-WS44F
    @SerializedName("numberOfReviews")
    var numberOfReviews: Int, // 420
    @SerializedName("offerId")
    var offerId: String, // DBF0631A7FA84022B05D3016EAC13686
    @SerializedName("p13nData")
    var p13nData: P13nData,
    @SerializedName("priceInfo")
    var priceInfo: PriceInfo,
    @SerializedName("showAtc")
    var showAtc: Boolean, // true
    @SerializedName("showOptions")
    var showOptions: Boolean, // false
    @SerializedName("snapEligible")
    var snapEligible: Boolean, // false
    @SerializedName("sponsoredProduct")
    var sponsoredProduct: SponsoredProduct,
    @SerializedName("type")
    var type: String, // REGULAR
    @SerializedName("usItemId")
    var usItemId: String // 862552395
)

data class Badges(
    @SerializedName("flags")
    var flags: List<Flag>,
    @SerializedName("groups")
    var groups: Any?, // null
    @SerializedName("labels")
    var labels: Any?, // null
    @SerializedName("tags")
    var tags: List<Tag>
)

data class ImageInfo(
    @SerializedName("allImages")
    var allImages: Any?, // null
    @SerializedName("thumbnailUrl")
    var thumbnailUrl: String // https://i5.walmartimages.com/seo/ASUS-CX1500-Chromebook-15-6-FHD-Intel-Celeron-N3350-4GB-RAM-64GB-eMMC-Chrome-OS-Mineral-Gray-CX1500CNA-WS44F_e837b4f7-3df9-4615-b6eb-65fb5991d4e6.0a76e40135e44a8102e4e702668d652e.jpeg
)

data class P13nData(
    @SerializedName("flags")
    var flags: Any?, // null
    @SerializedName("labels")
    var labels: Any?, // null
    @SerializedName("predictedQuantity")
    var predictedQuantity: Any? // null
)

data class PriceInfo(
    @SerializedName("comparisonPrice")
    var comparisonPrice: Any?, // null
    @SerializedName("currentPrice")
    var currentPrice: CurrentPrice,
    @SerializedName("priceDisplayCodes")
    var priceDisplayCodes: PriceDisplayCodes,
    @SerializedName("priceRange")
    var priceRange: Any?, // null
    @SerializedName("savingsAmount")
    var savingsAmount: SavingsAmount?,
    @SerializedName("subscriptionPrice")
    var subscriptionPrice: Any?, // null
    @SerializedName("unitPrice")
    var unitPrice: Any?, // null
    @SerializedName("wasPrice")
    var wasPrice: WasPrice?
)

data class SponsoredProduct(
    @SerializedName("clickBeacon")
    var clickBeacon: String, // https://wrd.walmart.com/track?adUid=be0151ea-7f9b-440a-9186-0170b4779926&pgId=computer&spQs=T_VgR2JfRxONO_nIYFvO9I2Zbo3F9KrziHssJciU08KGDJLKmC0_hyChPulrXPlVZHR-BWjng0JhM4-xi590_2PkEjfJfnK2XwgjuJelEZhdRMsSKnjWJZj_AWhWVHidyi1rP4GbA_7LhcnZ8R7XQT_dvEf6yqPmC2mVbjqh1BsHrDwP4xkk2KiG5xwkYY23b8R0EC9Odepsw7TAkyH8qA&storeId=3180&pt=search&mloc=sb-search-top&bkt=2482&pltfm=desktop&rdf=0&plmt=__plmt__&eventST=__eventST__&pos=__pos__&bt=__bt__&tax=3944_1089430_8835131_1737838_1315601
    @SerializedName("spQs")
    var spQs: String, // T_VgR2JfRxONO_nIYFvO9I2Zbo3F9KrziHssJciU08KGDJLKmC0_hyChPulrXPlVZHR-BWjng0JhM4-xi590_2PkEjfJfnK2XwgjuJelEZhdRMsSKnjWJZj_AWhWVHidyi1rP4GbA_7LhcnZ8R7XQT_dvEf6yqPmC2mVbjqh1BsHrDwP4xkk2KiG5xwkYY23b8R0EC9Odepsw7TAkyH8qA
    @SerializedName("spTags")
    var spTags: Any? // null
)

data class Flag(
    @SerializedName("id")
    var id: String, // L1400
    @SerializedName("key")
    var key: String, // CLEARANCE
    @SerializedName("query")
    var query: Any?, // null
    @SerializedName("text")
    var text: String, // Clearance
    @SerializedName("type")
    var type: Any?, // null
    @SerializedName("__typename")
    var typename: String // BaseBadge
)

data class Tag(
    @SerializedName("id")
    var id: String, // L1005
    @SerializedName("key")
    var key: String, // THREE_PLUS_DAY_SHIPPING
    @SerializedName("text")
    var text: String, // 3+ day shipping
    @SerializedName("__typename")
    var typename: String // BaseBadge
)

data class CurrentPrice(
    @SerializedName("price")
    var price: Int, // 169
    @SerializedName("priceDisplay")
    var priceDisplay: String, // Now $169.00
    @SerializedName("priceString")
    var priceString: String // $169.00
)

data class PriceDisplayCodes(
    @SerializedName("clearance")
    var clearance: Boolean?, // true
    @SerializedName("eligibleForAssociateDiscount")
    var eligibleForAssociateDiscount: Boolean?, // true
    @SerializedName("priceDisplayCondition")
    var priceDisplayCondition: Any?, // null
    @SerializedName("pricePerUnitUom")
    var pricePerUnitUom: Any?, // null
    @SerializedName("reducedPrice")
    var reducedPrice: Any?, // null
    @SerializedName("rollback")
    var rollback: Any?, // null
    @SerializedName("strikethrough")
    var strikethrough: Any?, // null
    @SerializedName("submapType")
    var submapType: Any?, // null
    @SerializedName("unitOfMeasure")
    var unitOfMeasure: Any? // null
)

data class SavingsAmount(
    @SerializedName("priceString")
    var priceString: String // SAVE $48.99
)

data class WasPrice(
    @SerializedName("price")
    var price: Double, // 217.99
    @SerializedName("priceString")
    var priceString: String // $217.99
)

data class LocationContext(
    @SerializedName("deliveryStore")
    var deliveryStore: String, // 3180
    @SerializedName("incatchment")
    var incatchment: Boolean, // false
    @SerializedName("intent")
    var intent: String, // SHIPPING
    @SerializedName("pickupStore")
    var pickupStore: String, // 3180
    @SerializedName("stateCode")
    var stateCode: String, // CA
    @SerializedName("storeId")
    var storeId: String, // 3180
    @SerializedName("zipCode")
    var zipCode: String // 90060
)

data class SearchNormalize(
    @SerializedName("analytics_log")
    var analyticsLog: AnalyticsLog,
    @SerializedName("normalized_query")
    var normalizedQuery: String, // computer
    @SerializedName("original_query")
    var originalQuery: String, // computer
    @SerializedName("product_type")
    var productType: List<ProductType>,
    @SerializedName("rewritten_query")
    var rewrittenQuery: String, // computers
    @SerializedName("specificity")
    var specificity: String, // broad
    @SerializedName("top_query_cat_path")
    var topQueryCatPath: String, // /3944/1089430/8835131/1737838/1315601
    @SerializedName("top_query_cat_path_name")
    var topQueryCatPathName: String, // /Electronics/Computers, Laptops and Tablets/Laptops by Operating System/Windows OS Laptops/Windows 11 Laptops
    @SerializedName("verticalId")
    var verticalId: String // ets
)

data class AnalyticsLog(
    @SerializedName("fe_log")
    var feLog: FeLog
)

data class ProductType(
    @SerializedName("name")
    var name: String, // Desktop Computers
    @SerializedName("score")
    var score: Double, // 0.9073519110679626
    @SerializedName("source")
    var source: String // classifier
)

data class FeLog(
    @SerializedName("dept")
    var dept: String, // /3944/1089430/8835131/1737838/1315601
    @SerializedName("g")
    var g: String, // S
    @SerializedName("s")
    var s: String, // b
    @SerializedName("tpt")
    var tpt: String, // desktop computers
    @SerializedName("trf")
    var trf: String // ht
)

data class Value(
    @SerializedName("baseSeoURL")
    var baseSeoURL: String?, // /browse/electronics/3944
    @SerializedName("description")
    var description: Any?, // null
    @SerializedName("expandOnLoad")
    var expandOnLoad: Boolean?, // true
    @SerializedName("id")
    var id: String?, // best_seller
    @SerializedName("isSelected")
    var isSelected: Boolean?, // true
    @SerializedName("itemCount")
    var itemCount: Int?, // 212618
    @SerializedName("name")
    var name: String, // Best Seller
    @SerializedName("title")
    var title: String?, // Today
    @SerializedName("type")
    var type: String?, // cat_id
    @SerializedName("values")
    var values: Any? // null
)

data class ValueX(
    @SerializedName("baseSeoURL")
    var baseSeoURL: Any?, // null
    @SerializedName("description")
    var description: Any?, // null
    @SerializedName("expandOnLoad")
    var expandOnLoad: Boolean, // true
    @SerializedName("id")
    var id: Any?, // null
    @SerializedName("isSelected")
    var isSelected: Any?, // null
    @SerializedName("itemCount")
    var itemCount: Int, // 27294
    @SerializedName("name")
    var name: String, // HP
    @SerializedName("title")
    var title: String?, // Today
    @SerializedName("type")
    var type: Any?, // null
    @SerializedName("values")
    var values: Any? // null
)

data class ExtraData(
    @SerializedName("p13nError")
    var p13nError: Any?, // null
    @SerializedName("p13nRequest")
    var p13nRequest: P13nRequest?,
    @SerializedName("seeSimilarButtonText")
    var seeSimilarButtonText: Any?, // null
    @SerializedName("showSeeSimilarButton")
    var showSeeSimilarButton: Any? // null
)

class P13nRequest

data class Location(
    @SerializedName("accessPointId")
    var accessPointId: Any?, // null
    @SerializedName("accessType")
    var accessType: Any?, // null
    @SerializedName("city")
    var city: String, // Los Angeles
    @SerializedName("deliveryStore")
    var deliveryStore: String, // 3180
    @SerializedName("intent")
    var intent: String, // SHIPPING
    @SerializedName("pickupStore")
    var pickupStore: String, // 3180
    @SerializedName("postalCode")
    var postalCode: String, // 90060
    @SerializedName("spokeNodeId")
    var spokeNodeId: Any?, // null
    @SerializedName("stateOrProvinceCode")
    var stateOrProvinceCode: String, // CA
    @SerializedName("storeId")
    var storeId: String // 3180
)

data class PageContextX(
    @SerializedName("searchNormalize")
    var searchNormalize: SearchNormalizeX
)

data class SearchNormalizeX(
    @SerializedName("normalized_query")
    var normalizedQuery: String, // computer
    @SerializedName("original_query")
    var originalQuery: String, // computer
    @SerializedName("rewritten_query")
    var rewrittenQuery: String, // computers
    @SerializedName("specificity")
    var specificity: String, // broad
    @SerializedName("top_query_cat_path")
    var topQueryCatPath: String, // /3944/1089430/8835131/1737838/1315601
    @SerializedName("top_query_cat_path_name")
    var topQueryCatPathName: String, // /Electronics/Computers, Laptops and Tablets/Laptops by Operating System/Windows OS Laptops/Windows 11 Laptops
    @SerializedName("verticalId")
    var verticalId: String // ets
)



data class ContentXX(
    @SerializedName("content")
    var content: ContentXXX,
    @SerializedName("flow")
    var flow: String, // vertical
    @SerializedName("type")
    var type: String // container
)

data class ContentXXX(
    @SerializedName("id")
    var id: String, // top
    @SerializedName("mapping")
    var mapping: List<MappingX>,
    @SerializedName("type")
    var type: String // slot
)

data class MappingX(
    @SerializedName("type")
    var type: String // ZONE
)

data class BottomZone1(
    @SerializedName("configs")
    var configs: ConfigsXXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXXX,
    @SerializedName("moduleId")
    var moduleId: String, // 986350d5-0bd6-4feb-916f-b7081f246aeb
    @SerializedName("name")
    var name: String, // Marquee Display Ad BTF
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // MarqueeDisplayAd
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 4
)

data class BottomZone2(
    @SerializedName("configs")
    var configs: ConfigsXXXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXXXX,
    @SerializedName("moduleId")
    var moduleId: String, // 304f501d-075d-4a59-89aa-6e23bf0fdb64
    @SerializedName("name")
    var name: String, // Sponsored Product Carousel - rweb
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // SponsoredProductCarousel
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 2
)

data class INVALID(
    @SerializedName("configs")
    var configs: ConfigsXXXXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXXXXX,
    @SerializedName("moduleId")
    var moduleId: String, // enricher-static-module-id
    @SerializedName("name")
    var name: String, // Enricher Static Module
    @SerializedName("schedule")
    var schedule: ScheduleXXX,
    @SerializedName("type")
    var type: String, // EnricherModule
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 5
)

data class PillsTopZone(
    @SerializedName("configs")
    var configs: ConfigsXXXXXX,
    @SerializedName("moduleId")
    var moduleId: String, // d80c120b-3158-42ac-9525-9b22e6c4fbac
    @SerializedName("name")
    var name: String, // 0825 Guided Nav Pills
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // PillsModule
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 2
)

data class TopZone1(
    @SerializedName("configs")
    var configs: ConfigsXXXXXXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXXXXXXX,
    @SerializedName("moduleId")
    var moduleId: String, // d82a07bd-471a-46ef-9926-63ae0bd7dbc2
    @SerializedName("name")
    var name: String, // Skyline Display Ad
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // SkylineDisplayAd
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 3
)

data class TopZone2(
    @SerializedName("configs")
    var configs: ConfigsXXXXXXXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXXXXXXXX,
    @SerializedName("moduleId")
    var moduleId: String, // ce73cb9e-2029-4083-80c4-d6aced706cf0
    @SerializedName("name")
    var name: String, // Search Brand Amplifier Ad
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // BrandAmplifierAd
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 2
)

data class TopZone3(
    @SerializedName("configs")
    var configs: ConfigsXXXXXXXXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXXXXXXXXX,
    @SerializedName("moduleId")
    var moduleId: String, // 8d6b5e69-db36-453a-bd8a-fcf0de045072
    @SerializedName("name")
    var name: String, // Default Sort & Filter
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // SearchSortFilterModule
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 3
)

data class TopZone5(
    @SerializedName("configs")
    var configs: ConfigsXXXXXXXXXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXXXXXXXXXX,
    @SerializedName("moduleId")
    var moduleId: String, // 4e756e28-80b7-499d-aae4-b46bbc21b554
    @SerializedName("name")
    var name: String, // Search Fitment Module
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // SearchFitment
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 7
)

data class TopZone6(
    @SerializedName("configs")
    var configs: ConfigsXXXXXXXXXXX,
    @SerializedName("matchedTrigger")
    var matchedTrigger: MatchedTriggerXXXXXXXXXXX,
    @SerializedName("moduleId")
    var moduleId: String, // 8a6208c9-6ee9-4d9e-96a3-3b2cad2d690e
    @SerializedName("name")
    var name: String, // Search Non Item Module
    @SerializedName("schedule")
    var schedule: Schedule,
    @SerializedName("type")
    var type: String, // SearchNonItem
    @SerializedName("__typename")
    var typename: String, // TempoModule
    @SerializedName("version")
    var version: Int // 1
)

data class ConfigsXXX(
    @SerializedName("ad")
    var ad: Any?, // null
    @SerializedName("_rawConfigs")
    var rawConfigs: RawConfigsX,
    @SerializedName("__typename")
    var typename: String // TempoWM_GLASSWWWMarqueeDisplayAdConfigs
)

data class MatchedTriggerXXX(
    @SerializedName("zone")
    var zone: String // bottomZone1
)

data class RawConfigsX(
    @SerializedName("lazy")
    var lazy: String, // 3000
    @SerializedName("moduleLocation")
    var moduleLocation: String // marquee2
)

data class ConfigsXXXX(
    @SerializedName("_rawConfigs")
    var rawConfigs: RawConfigsXX,
    @SerializedName("__typename")
    var typename: String // TempoWM_GLASSWWWSponsoredProductCarouselConfigs
)

data class MatchedTriggerXXXX(
    @SerializedName("zone")
    var zone: String // bottomZone2
)

data class RawConfigsXX(
    @SerializedName("lazy")
    var lazy: String, // 1000
    @SerializedName("moduleLocation")
    var moduleLocation: String, // bottom
    @SerializedName("title")
    var title: String // Products you may also like
)

data class ConfigsXXXXX(
    @SerializedName("__typename")
    var typename: String, // EnricherModuleConfigsV1
    @SerializedName("zoneV1")
    var zoneV1: List<ZoneV1X>
)

data class MatchedTriggerXXXXX(
    @SerializedName("zone")
    var zone: String // INVALID
)

data class ScheduleXXX(
    @SerializedName("priority")
    var priority: Int // 0
)

data class ZoneV1X(
    @SerializedName("extraData")
    var extraData: ExtraDataX?,
    @SerializedName("isNativeLazyLoaded")
    var isNativeLazyLoaded: Boolean, // false
    @SerializedName("isP13nBtfModule")
    var isP13nBtfModule: Boolean, // false
    @SerializedName("moduleId")
    var moduleId: String, // 9ec9680f-fcfc-493f-8920-8734d0fb230d
    @SerializedName("zone")
    var zone: String // pillsTopZone
)

data class ExtraDataX(
    @SerializedName("p13nError")
    var p13nError: Any?, // null
    @SerializedName("seeSimilarButtonText")
    var seeSimilarButtonText: Any?, // null
    @SerializedName("showSeeSimilarButton")
    var showSeeSimilarButton: Any? // null
)

data class ConfigsXXXXXX(
    @SerializedName("moduleSource")
    var moduleSource: String, // chipModule
    @SerializedName("__typename")
    var typename: String // TempoWM_GLASSWWWPillsModuleConfigs
)

data class ConfigsXXXXXXX(
    @SerializedName("ad")
    var ad: Any?, // null
    @SerializedName("_rawConfigs")
    var rawConfigs: RawConfigsXXX,
    @SerializedName("__typename")
    var typename: String // TempoWM_GLASSWWWSkylineDisplayAdConfigs
)

data class MatchedTriggerXXXXXXX(
    @SerializedName("zone")
    var zone: String // topZone1
)

data class RawConfigsXXX(
    @SerializedName("lazy")
    var lazy: String, // 400
    @SerializedName("moduleLocation")
    var moduleLocation: String // top
)

data class ConfigsXXXXXXXX(
    @SerializedName("ad")
    var ad: AdX,
    @SerializedName("moduleLocation")
    var moduleLocation: String, // top
    @SerializedName("_rawConfigs")
    var rawConfigs: RawConfigsXXXX,
    @SerializedName("__typename")
    var typename: String // TempoWM_GLASSWWWBrandAmplifierAdConfigs
)

data class MatchedTriggerXXXXXXXX(
    @SerializedName("zone")
    var zone: String // topZone2
)

data class AdX(
    @SerializedName("adContent")
    var adContent: AdContentX,
    @SerializedName("adsContext")
    var adsContext: AdsContextX,
    @SerializedName("moduleType")
    var moduleType: String, // BrandAmplifierAd
    @SerializedName("pageContext")
    var pageContext: PageContextXX,
    @SerializedName("pageId")
    var pageId: String, // computer
    @SerializedName("pageType")
    var pageType: String, // SEARCH
    @SerializedName("platform")
    var platform: String, // DESKTOP
    @SerializedName("stateCode")
    var stateCode: String, // CA
    @SerializedName("status")
    var status: String, // SUCCESS
    @SerializedName("storeId")
    var storeId: String, // 3180
    @SerializedName("zipCode")
    var zipCode: String // 90060
)

data class RawConfigsXXXX(
    @SerializedName("moduleLocation")
    var moduleLocation: String // top
)

data class AdContentX(
    @SerializedName("data")
    var `data`: DataXXXXX,
    @SerializedName("type")
    var type: String // SPONSORED_PRODUCTS
)

data class AdsContextX(
    @SerializedName("brand")
    var brand: String,
    @SerializedName("categoryId")
    var categoryId: String, // 3944_1089430_8835131_1737838_1315601
    @SerializedName("categoryName")
    var categoryName: String, // Electronics/Computers, Laptops and Tablets/Laptops by Operating System/Windows OS Laptops/Windows 11 Laptops
    @SerializedName("dedupeList")
    var dedupeList: List<String>,
    @SerializedName("itemId")
    var itemId: String,
    @SerializedName("normKeyword")
    var normKeyword: String, // computer
    @SerializedName("productName")
    var productName: String,
    @SerializedName("productTypeId")
    var productTypeId: String,
    @SerializedName("verticalId")
    var verticalId: String // ets
)

data class PageContextXX(
    @SerializedName("searchNormalize")
    var searchNormalize: SearchNormalizeXX
)

data class DataXXXXX(
    @SerializedName("adExpInfo")
    var adExpInfo: Any?, // null
    @SerializedName("adUuid")
    var adUuid: String, // be0151ea-7f9b-440a-9186-0170b4779926
    @SerializedName("brands")
    var brands: List<BrandX>,
    @SerializedName("moduleInfo")
    var moduleInfo: String, // {"adExpId":"","bucketId":"2482"}
    @SerializedName("__typename")
    var typename: String // SponsoredBrands
)

data class BrandX(
    @SerializedName("products")
    var products: List<ProductX>
)

data class ProductX(
    @SerializedName("availabilityStatus")
    var availabilityStatus: String, // IN_STOCK
    @SerializedName("averageRating")
    var averageRating: Double, // 4.2
    @SerializedName("badges")
    var badges: BadgesX,
    @SerializedName("brand")
    var brand: String, // ASUS
    @SerializedName("canonicalUrl")
    var canonicalUrl: String, // /ip/ASUS-CX1500-Chromebook-15-6-FHD-Intel-Celeron-N3350-4GB-RAM-64GB-eMMC-Chrome-OS-Mineral-Gray-CX1500CNA-WS44F/862552395
    @SerializedName("classType")
    var classType: String, // REGULAR
    @SerializedName("fulfillmentBadge")
    var fulfillmentBadge: String?, // Today
    @SerializedName("name")
    var name: String, // ASUS CX1500 Chromebook, 15.6" FHD, Intel Celeron N3350, 4GB RAM, 64GB eMMC, Chrome OS, Mineral Gray, CX1500CNA-WS44F
    @SerializedName("numberOfReviews")
    var numberOfReviews: Int, // 420
    @SerializedName("offerId")
    var offerId: String, // DBF0631A7FA84022B05D3016EAC13686
    @SerializedName("priceInfo")
    var priceInfo: PriceInfoX,
    @SerializedName("showAtc")
    var showAtc: Boolean, // true
    @SerializedName("showOptions")
    var showOptions: Boolean, // false
    @SerializedName("snapEligible")
    var snapEligible: Boolean, // false
    @SerializedName("type")
    var type: String, // REGULAR
    @SerializedName("usItemId")
    var usItemId: String // 862552395
)

data class BadgesX(
    @SerializedName("groups")
    var groups: Any?, // null
    @SerializedName("labels")
    var labels: Any?, // null
)

data class PriceInfoX(
    @SerializedName("comparisonPrice")
    var comparisonPrice: Any?, // null
    @SerializedName("priceRange")
    var priceRange: Any?, // null
    @SerializedName("subscriptionPrice")
    var subscriptionPrice: Any?, // null
    @SerializedName("unitPrice")
    var unitPrice: Any?, // null
)

data class SearchNormalizeXX(
    @SerializedName("normalized_query")
    var normalizedQuery: String, // computer
    @SerializedName("original_query")
    var originalQuery: String, // computer
    @SerializedName("rewritten_query")
    var rewrittenQuery: String, // computers
    @SerializedName("specificity")
    var specificity: String, // broad
    @SerializedName("top_query_cat_path")
    var topQueryCatPath: String, // /3944/1089430/8835131/1737838/1315601
    @SerializedName("top_query_cat_path_name")
    var topQueryCatPathName: String, // /Electronics/Computers, Laptops and Tablets/Laptops by Operating System/Windows OS Laptops/Windows 11 Laptops
    @SerializedName("verticalId")
    var verticalId: String // ets
)



data class ConfigsXXXXXXXXX(
    @SerializedName("allSortAndFilterFacets")
    var allSortAndFilterFacets: List<AllSortAndFilterFacetX>,
    @SerializedName("topNavFacets")
    var topNavFacets: List<TopNavFacetX>,
    @SerializedName("__typename")
    var typename: String // _TempoWM_GLASSWWWSearchSortFilterModuleConfigs
)

data class MatchedTriggerXXXXXXXXX(
    @SerializedName("zone")
    var zone: String // topZone3
)

data class AllSortAndFilterFacetX(
    @SerializedName("expandOnLoad")
    var expandOnLoad: Boolean?, // false
    @SerializedName("isSelected")
    var isSelected: Any?, // null
    @SerializedName("layout")
    var layout: String, // default
    @SerializedName("max")
    var max: Int?, // 900
    @SerializedName("min")
    var min: Int?, // 0
    @SerializedName("name")
    var name: String, // Sort by
    @SerializedName("selectedMax")
    var selectedMax: Any?, // null
    @SerializedName("selectedMin")
    var selectedMin: Any?, // null
    @SerializedName("stepSize")
    var stepSize: Int?, // 9
    @SerializedName("title")
    var title: String, // Sort by
    @SerializedName("type")
    var type: String, // sort
    @SerializedName("unboundedMax")
    var unboundedMax: Boolean?, // true
)

data class TopNavFacetX(
    @SerializedName("expandOnLoad")
    var expandOnLoad: Boolean, // true
    @SerializedName("isSelected")
    var isSelected: Any?, // null
    @SerializedName("layout")
    var layout: String, // pill
    @SerializedName("max")
    var max: Int?, // 900
    @SerializedName("min")
    var min: Int?, // 0
    @SerializedName("name")
    var name: String, // In-store
    @SerializedName("selectedMax")
    var selectedMax: Any?, // null
    @SerializedName("selectedMin")
    var selectedMin: Any?, // null
    @SerializedName("stepSize")
    var stepSize: Int?, // 9
    @SerializedName("title")
    var title: String, // In-store
    @SerializedName("type")
    var type: String, // fulfillment_method_in_store
    @SerializedName("unboundedMax")
    var unboundedMax: Boolean?, // true
)

data class ConfigsXXXXXXXXXX(
    @SerializedName("fitments")
    var fitments: Any?, // null
    @SerializedName("__typename")
    var typename: String // TempoWM_GLASSWWWSearchFitmentModuleConfigs
)

data class MatchedTriggerXXXXXXXXXX(
    @SerializedName("zone")
    var zone: String // topZone5
)

data class ConfigsXXXXXXXXXXX(
    @SerializedName("subTitle")
    var subTitle: Any?, // null
    @SerializedName("title")
    var title: Any?, // null
    @SerializedName("__typename")
    var typename: String, // TempoWM_GLASSWWWSearchNonItemConfigs
    @SerializedName("url")
    var url: Any?, // null
    @SerializedName("urlLinkText")
    var urlLinkText: Any? // null
)

data class MatchedTriggerXXXXXXXXXXX(
    @SerializedName("zone")
    var zone: String // topZone6
)

data class PageContextXXX(
    @SerializedName("searchNormalize")
    var searchNormalize: SearchNormalizeXXX
)

data class SearchNormalizeXXX(
    @SerializedName("normalized_query")
    var normalizedQuery: String, // computer
    @SerializedName("original_query")
    var originalQuery: String, // computer
    @SerializedName("rewritten_query")
    var rewrittenQuery: String, // computers
    @SerializedName("specificity")
    var specificity: String, // broad
    @SerializedName("top_query_cat_path")
    var topQueryCatPath: String, // /3944/1089430/8835131/1737838/1315601
    @SerializedName("top_query_cat_path_name")
    var topQueryCatPathName: String, // /Electronics/Computers, Laptops and Tablets/Laptops by Operating System/Windows OS Laptops/Windows 11 Laptops
    @SerializedName("verticalId")
    var verticalId: String // ets
)



data class CatInfo(
    @SerializedName("catId")
    var catId: String, // 0
    @SerializedName("name")
    var name: String // computer
)

data class Debug(
    @SerializedName("adsUrl")
    var adsUrl: String, // http://swag-wmt.prod.walmart.com/fs?storeSlotBooked=&prg=desktop&limit=40&query=computer&cat_id=&facet=&page=1&ps=10&min_price=&max_price=&sort=best_match&spelling=true&recall_set=&ptss=&pageType=SearchPage&trsp=&zipcode=90060&stores=3180&stateOrProvinceCode=CA&latitude=34.064&longitude=-118.2377&extended_zipcode=90060&addressId=&inCatchment=false&autoOptIn=false&isMoreOptionsTileEnabled=true&pickupStore=3180&deliveryStore=&subIntentSource=LS
    @SerializedName("presoDebugInformation")
    var presoDebugInformation: List<PresoDebugInformation>,
    @SerializedName("sisUrl")
    var sisUrl: String // http://preso-usgm-wcnp.prod.walmart.com/v1/search?query=computer&facet=&stores=3180&cat_id=&sort=best_match&page=1&min_price=&max_price=&spelling=true&ptss=&trsp=&isMoreOptionsTileEnabled=true&autoOptIn=false&prg=desktop&storeSlotBooked=&stateOrProvinceCode=CA&ps=40&zipcode=90060&recall_set=&pageType=SearchPage&inCatchment=false&latitude=34.064&longitude=-118.2377&extended_zipcode=90060&addressId=&pickupStore=3180&deliveryStore=&subIntentSource=LS
)

data class ErrorResponse(
    @SerializedName("correlationId")
    var correlationId: String, // 00-1740c4b9e7f848d87bd7e387f85bd496-32facf756659814e-01
    @SerializedName("errorCodes")
    var errorCodes: Any?, // null
    @SerializedName("errors")
    var errors: List<Any>,
    @SerializedName("source")
    var source: String // sis
)

data class ItemStack(
    @SerializedName("count")
    var count: Int, // 179149
    @SerializedName("items")
    var items: List<ItemX>,
    @SerializedName("layoutEnum")
    var layoutEnum: String, // GRID
    @SerializedName("meta")
    var meta: Meta,
    @SerializedName("queryUsedForSearchResults")
    var queryUsedForSearchResults: Any?, // null
    @SerializedName("title")
    var title: String, // Results for "computer"
    @SerializedName("titleKey")
    var titleKey: Any?, // null
    @SerializedName("totalItemCountDisplay")
    var totalItemCountDisplay: String // (1000+)
)

data class PageMetadataXX(
    @SerializedName("location")
    var location: LocationXX,
    @SerializedName("storeSelectionHeader")
    var storeSelectionHeader: Any?, // null
    @SerializedName("subscriptionEligible")
    var subscriptionEligible: Boolean, // false
    @SerializedName("title")
    var title: String // computer
)

data class PaginationV2(
    @SerializedName("maxPage")
    var maxPage: Int, // 25
    @SerializedName("pageProperties")
    var pageProperties: PageProperties
)

data class RelatedSearch(
    @SerializedName("imageUrl")
    var imageUrl: String, // https://i5.walmartimages.com/dfw/4ff9c6c9-492b/k2-_d364fa80-6c6b-4a89-88ea-beaaf53a606e.v1.png
    @SerializedName("title")
    var title: String, // desktop computer
    @SerializedName("url")
    var url: String // q=desktop%20computer
)

data class RequestContext(
    @SerializedName("categories")
    var categories: Categories,
    @SerializedName("hasGicIntent")
    var hasGicIntent: Boolean, // false
    @SerializedName("isFitmentFilterQueryApplied")
    var isFitmentFilterQueryApplied: Boolean, // false
    @SerializedName("searchMatchType")
    var searchMatchType: String, // {"dept":"/3944/1089430/8835131/1737838/1315601","g":"S","s":"b","trf":"t","tpt":"desktop computers","p":2,"as":"a|0|0","qcr":"ht","pbk":true,"trn":0,"ee":"Xt","eo":"N","id":"00-1740c4b9e7f848d87bd7e387f85bd496-32facf756659814e-01","agg":"256|355|427"}
    @SerializedName("vertical")
    var vertical: String // ets
)

class Spelling

data class PresoDebugInformation(
    @SerializedName("explainerToolsResponse")
    var explainerToolsResponse: Any? // null
)

data class ItemX(
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
    var averageRating: Double?, // 4.7
    @SerializedName("badge")
    var badge: Badge?,
    @SerializedName("badges")
    var badges: BadgesXX?,
    @SerializedName("buyBoxSuppression")
    var buyBoxSuppression: Boolean?, // false
    @SerializedName("canAddToCart")
    var canAddToCart: Boolean?, // true
    @SerializedName("canonicalUrl")
    var canonicalUrl: String?, // /ip/SGIN-15-6inch-Laptop-4GB-DDR4-128GB-SSD-Windows-11-Laptop-Computer-with-Quad-Core-Intel-Celeron-up-to-2-8GHz-Full-HD-1920x1080-Laptops-Computer/1044996074
    @SerializedName("category")
    var category: Category?,
    @SerializedName("checkStoreAvailabilityATC")
    var checkStoreAvailabilityATC: Boolean?, // false
    @SerializedName("classType")
    var classType: String?, // REGULAR
    @SerializedName("description")
    var description: String?,
    @SerializedName("displayName")
    var displayName: String?, // sizes
    @SerializedName("earlyAccessEvent")
    var earlyAccessEvent: Boolean?, // false
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
    var fulfillmentType: String?, // FC
    @SerializedName("groupMetaData")
    var groupMetaData: GroupMetaData?,
    @SerializedName("hasCarePlans")
    var hasCarePlans: Boolean?, // true
    @SerializedName("id")
    var id: String?, // 6ZH8MYU670HY
    @SerializedName("image")
    var image: String?, // https://i5.walmartimages.com/seo/SGIN-15-6inch-Laptop-4GB-DDR4-128GB-SSD-Windows-11-Laptop-Computer-with-Quad-Core-Intel-Celeron-up-to-2-8GHz-Full-HD-1920x1080-Laptops-Computer_5ef57c1c-eb19-4975-a8f5-468530ca131a.2237d30635f2d0b3ab76518bf69ccb2d.jpeg?odnHeight=180&odnWidth=180&odnBg=FFFFFF
    @SerializedName("imageID")
    var imageID: String?, // 9D57A200C704444FA71D96B06B0D14EB
    @SerializedName("imageInfo")
    var imageInfo: ImageInfoXX?,
    @SerializedName("imageName")
    var imageName: String?, // SGIN-15-6inch-Laptop-4GB-DDR4-128GB-SSD-Windows-11-Laptop-Computer-with-Quad-Core-Intel-Celeron-up-to-2-8GHz-Full-HD-1920x1080-Laptops-Computer_5ef57c1c-eb19-4975-a8f5-468530ca131a.2237d30635f2d0b3ab76518bf69ccb2d.jpeg
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
    @SerializedName("name")
    var name: String?, // SGIN 15.6inch Laptop 4GB DDR4 128GB SSD Windows 11 Laptop Computer with Quad Core Intel Celeron up to 2.8GHz Full HD 1920x1080 Laptops Computer
    @SerializedName("newConditionProductId")
    var newConditionProductId: Any?, // null
    @SerializedName("numberOfReviews")
    var numberOfReviews: Int?, // 2463
    @SerializedName("offerId")
    var offerId: String?, // 41D405DB72A945DD855B3D4B19133811
    @SerializedName("pac")
    var pac: Any?, // null
    @SerializedName("petRx")
    var petRx: PetRx?,
    @SerializedName("pglsCondition")
    var pglsCondition: Any?, // null
    @SerializedName("preOrder")
    var preOrder: PreOrder?,
    @SerializedName("price")
    var price: Int?, // 259
    @SerializedName("priceFlip")
    var priceFlip: Boolean?, // false
    @SerializedName("priceInfo")
    var priceInfo: PriceInfoXX?,
    @SerializedName("productLocation")
    var productLocation: List<ProductLocation>?,
    @SerializedName("productLocationDisplayValue")
    var productLocationDisplayValue: String?, // K20
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
    var sellerId: String?, // 91549E334AE7410E952E6D038DF9C862
    @SerializedName("sellerName")
    var sellerName: String?, // SGIN Official Store
    @SerializedName("shortDescription")
    var shortDescription: String?, // <li>FHD IPS Screen: With a 15.6" Full HD IPS display (1920 x 1080), the Laptops has richer and more vibrant colors for excellent visual effects. 80% screen-to-body ratio, 16:9 aspect ratio and four</li>
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
    var sponsoredProduct: SponsoredProductXX?,
    @SerializedName("subscription")
    var subscription: Subscription?,
    @SerializedName("tileTakeOverTile")
    var tileTakeOverTile: TileTakeOverTile?,
    @SerializedName("topResult")
    var topResult: Any?, // null
    @SerializedName("type")
    var type: String, // REGULAR
    @SerializedName("__typename")
    var typename: String, // Product
    @SerializedName("usItemId")
    var usItemId: String?, // 1044996074
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
    var query: String, // computer
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
    var title: String, // Results for "computer"
    @SerializedName("titleKey")
    var titleKey: Any?, // null
    @SerializedName("totalItemCount")
    var totalItemCount: Int, // 179149
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

data class BadgesXX(
    @SerializedName("flags")
    var flags: List<FlagXX>?,
    @SerializedName("groups")
    var groups: List<Group>,
    @SerializedName("tags")
    var tags: List<TagXX>
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
    var slaText: String, // in 2 days
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
    var deliveryDate: String?, // 2023-08-19T22:00:00.000Z
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

data class ImageInfoXX(
    @SerializedName("id")
    var id: String, // 9D57A200C704444FA71D96B06B0D14EB
    @SerializedName("name")
    var name: String, // SGIN-15-6inch-Laptop-4GB-DDR4-128GB-SSD-Windows-11-Laptop-Computer-with-Quad-Core-Intel-Celeron-up-to-2-8GHz-Full-HD-1920x1080-Laptops-Computer_5ef57c1c-eb19-4975-a8f5-468530ca131a.2237d30635f2d0b3ab76518bf69ccb2d.jpeg
    @SerializedName("size")
    var size: String, // 290-392
    @SerializedName("thumbnailUrl")
    var thumbnailUrl: String // https://i5.walmartimages.com/seo/SGIN-15-6inch-Laptop-4GB-DDR4-128GB-SSD-Windows-11-Laptop-Computer-with-Quad-Core-Intel-Celeron-up-to-2-8GHz-Full-HD-1920x1080-Laptops-Computer_5ef57c1c-eb19-4975-a8f5-468530ca131a.2237d30635f2d0b3ab76518bf69ccb2d.jpeg?odnHeight=180&odnWidth=180&odnBg=FFFFFF
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

data class PriceInfoXX(
    @SerializedName("eaPricingPreText")
    var eaPricingPreText: String,
    @SerializedName("eaPricingText")
    var eaPricingText: String,
    @SerializedName("finalCostByWeight")
    var finalCostByWeight: Boolean, // false
    @SerializedName("itemPrice")
    var itemPrice: String, // $1,049.99
    @SerializedName("linePrice")
    var linePrice: String, // $259.99
    @SerializedName("linePriceDisplay")
    var linePriceDisplay: String, // Now $259.99
    @SerializedName("memberPriceString")
    var memberPriceString: String,
    @SerializedName("minPrice")
    var minPrice: Double, // 19.99
    @SerializedName("minPriceForVariant")
    var minPriceForVariant: String,
    @SerializedName("priceDisplayCondition")
    var priceDisplayCondition: String,
    @SerializedName("priceRangeString")
    var priceRangeString: String,
    @SerializedName("savings")
    var savings: String, // SAVE $790.00
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
    var wasPrice: String // $1,049.99
)

data class ProductLocation(
    @SerializedName("aisle")
    var aisle: Aisle,
    @SerializedName("displayValue")
    var displayValue: String // K20
)

data class Rating(
    @SerializedName("averageRating")
    var averageRating: Int, // 4
    @SerializedName("numberOfReviews")
    var numberOfReviews: Int // 2463
)

data class SponsoredProductXX(
    @SerializedName("clickBeacon")
    var clickBeacon: String, // https://wrd.walmart.com/track?adUid=e68988fe-79c2-4889-b7dc-798346fe64fd&pgId=computer&spQs=c9CkIpmf4FOgflzK4U2vsj_XEGGxApOElD554RXxCZ6lNsHs3abeqyfcRy6laaGC2POGJ0BAD1oWP-Mm_vZmGYq9iSsP3x8Z34dGgQi-A8YV7Z_oi-lhIpDNbvtDEwCHuaM0Zdb0D8S-sUmxM2j371u6oMSYrvJW6t_B_3CO7O7ENFCZe4YjcfM9I3H8R0HkVou3_w1O7zcNkYR_bljlY5J3mITg_xivqsJYeFpsNJI&storeId=3180&pt=search&mloc=sp-search-middle&bkt=ace_2961%7Ccoldstart_on%7Csearch_default&pltfm=desktop&rdf=0&plmt=__plmt__&eventST=__eventST__&pos=__pos__&bt=__bt__&tax=3944_1089430_8835131_1737838_1315601&et=head_torso&st=head
    @SerializedName("spQs")
    var spQs: String, // c9CkIpmf4FOgflzK4U2vsj_XEGGxApOElD554RXxCZ6lNsHs3abeqyfcRy6laaGC2POGJ0BAD1oWP-Mm_vZmGYq9iSsP3x8Z34dGgQi-A8YV7Z_oi-lhIpDNbvtDEwCHuaM0Zdb0D8S-sUmxM2j371u6oMSYrvJW6t_B_3CO7O7ENFCZe4YjcfM9I3H8R0HkVou3_w1O7zcNkYR_bljlY5J3mITg_xivqsJYeFpsNJI
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

data class TileTakeOverTile(
    @SerializedName("adCardLocation")
    var adCardLocation: Any?, // null
    @SerializedName("adsEnabled")
    var adsEnabled: String?, // False
    @SerializedName("backgroundColor")
    var backgroundColor: String?, // #FFFFFF
    @SerializedName("enableLazyLoad")
    var enableLazyLoad: Any?, // null
    @SerializedName("image")
    var image: Image,
    @SerializedName("logoImage")
    var logoImage: Any?, // null
    @SerializedName("span")
    var span: String, // 1
    @SerializedName("subtitle")
    var subtitle: String, // Can't-miss buys on PCs for work & play.
    @SerializedName("subtitleTextColor")
    var subtitleTextColor: String?, // #000000
    @SerializedName("tileCta")
    var tileCta: List<TileCta>,
    @SerializedName("title")
    var title: String, // New desktop computers for less
    @SerializedName("titleTextColor")
    var titleTextColor: String? // #000000
)

data class VariantCriteria(
    @SerializedName("displayName")
    var displayName: String, // sizes
    @SerializedName("id")
    var id: Any?, // null
    @SerializedName("isVariantTypeSwatch")
    var isVariantTypeSwatch: Boolean, // false
    @SerializedName("name")
    var name: String, // hard_drive_capacity
    @SerializedName("type")
    var type: String, // DEFAULT
    @SerializedName("variantList")
    var variantList: List<Variant>
)

data class VariantX(
    @SerializedName("canonicalUrl")
    var canonicalUrl: String, // /ip/Acer-Chromebook-315-15-6-HD-Intel-Celeron-N4000-4GB-RAM-64GB-eMMC-Silver-CB315-3H-C19A/826255173?variantFieldId=hard_drive_capacity
    @SerializedName("image")
    var image: String, // https://i5.walmartimages.com/asr/05373b67-c03b-4ca1-9dfc-a7e42b4dce5b.f9cfbfc82be7b9bcdac035f2897e80d4.jpeg?odnHeight=180&odnWidth=180&odnBg=ffffff
    @SerializedName("name")
    var name: String, // 64 GB
    @SerializedName("productId")
    var productId: String, // 48IMX4W4SPY9
    @SerializedName("swatchImageUrl")
    var swatchImageUrl: String,
    @SerializedName("usItemId")
    var usItemId: String // 826255173
)

data class Vision(
    @SerializedName("ageGroup")
    var ageGroup: Any?, // null
    @SerializedName("visionCenterApproved")
    var visionCenterApproved: Boolean // false
)

data class FlagXX(
    @SerializedName("id")
    var id: String, // L1102
    @SerializedName("key")
    var key: String, // SOCIAL_PROOF_PURCHASES_FLAG
    @SerializedName("styleId")
    var styleId: Any?, // null
    @SerializedName("text")
    var text: String, // 1000+ bought since yesterday
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

data class TagXX(
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
    var slaText: String, // in 2 days
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

data class Aisle(
    @SerializedName("aisle")
    var aisle: Int, // 20
    @SerializedName("zone")
    var zone: String // K
)

data class Image(
    @SerializedName("alt")
    var alt: String, // New desktop computers for less. Can't-miss buys on PCs for work & play. Shop now..
    @SerializedName("assetId")
    var assetId: String, // cc7d308b-447d-4d3c-aa36-eb00a5480528
    @SerializedName("assetName")
    var assetName: String, // 3020848-025-026-FY24-Computing-TTO-580X772.jpg
    @SerializedName("src")
    var src: String // https://i5.walmartimages.com/dfw/4ff9c6c9-edcc/k2-_e3ea3389-e75d-4787-a8e8-4911926f402d.v1.jpg
)

data class TileCta(
    @SerializedName("ctaLink")
    var ctaLink: CtaLink,
    @SerializedName("ctaTextColor")
    var ctaTextColor: String?, // #000000
    @SerializedName("ctaType")
    var ctaType: String // button
)

data class CtaLink(
    @SerializedName("clickThrough")
    var clickThrough: ClickThroughXX,
    @SerializedName("linkText")
    var linkText: String, // Shop now
    @SerializedName("title")
    var title: String // Shop now
)

data class ClickThroughXX(
    @SerializedName("value")
    var value: String // /shop/electronics/new-tech?cat_id=3944_1089430_132982_1231618&povid=ETS_newarrivals_tto_desktops_desktopsearchbrowse_web
)

data class Variant(
    @SerializedName("availabilityStatus")
    var availabilityStatus: String, // AVAILABLE
    @SerializedName("id")
    var id: Any?, // null
    @SerializedName("images")
    var images: List<String>,
    @SerializedName("name")
    var name: String, // 64 GB
    @SerializedName("products")
    var products: List<String>,
    @SerializedName("rank")
    var rank: Int, // 10000000
    @SerializedName("selectedProduct")
    var selectedProduct: SelectedProduct,
    @SerializedName("swatchImageUrl")
    var swatchImageUrl: String? // https://i5.walmartimages.com/asr/5893e081-dccd-487a-a64d-94898c5244f5_1.e3c2e98c49ee9178cde2b5cac0aba66e.png?odnHeight=30&odnWidth=30&odnBg=ffffff
)

data class SelectedProduct(
    @SerializedName("canonicalUrl")
    var canonicalUrl: String, // /ip/Acer-Chromebook-315-15-6-HD-Intel-Celeron-N4000-4GB-RAM-64GB-eMMC-Silver-CB315-3H-C19A/826255173
    @SerializedName("usItemId")
    var usItemId: String // 826255173
)

data class AdsBeacon(
    @SerializedName("adUuid")
    var adUuid: String, // e68988fe-79c2-4889-b7dc-798346fe64fd
    @SerializedName("max_ads")
    var maxAds: Int, // 10
    @SerializedName("moduleInfo")
    var moduleInfo: String // {"adUuid":"e68988fe-79c2-4889-b7dc-798346fe64fd","facet":false,"intent":false,"affinity":"default","sorting":"best_match","bucketId":"ace_2961|coldstart_on|search_default","engagementTraffic":"head_torso","sessionTraffic":"head"}
)

data class LocationXX(
    @SerializedName("addressId")
    var addressId: String
)

data class PageProperties(
    @SerializedName("affinityOverride")
    var affinityOverride: String, // default
    @SerializedName("cat_id")
    var catId: String, // 0
    @SerializedName("department")
    var department: String, // /3944/1089430/8835131/1737838/1315601
    @SerializedName("displayGuidedNav")
    var displayGuidedNav: Boolean, // true
    @SerializedName("grid")
    var grid: String, // true
    @SerializedName("itemStacks")
    var itemStacks: Map<Int,MapValue>,
    @SerializedName("itemStacksInterleavePosition")
    var itemStacksInterleavePosition: List<ItemStacksInterleavePosition>,
    @SerializedName("page")
    var page: Int, // 1
    @SerializedName("pageType")
    var pageType: String, // SearchPage
    @SerializedName("pap")
    var pap: Pap,
    @SerializedName("prg")
    var prg: String, // desktop
    @SerializedName("ps")
    var ps: String, // 40
    @SerializedName("query")
    var query: String, // computer
    @SerializedName("sort")
    var sort: String, // best_match
    @SerializedName("spelling")
    var spelling: String, // true
    @SerializedName("stores")
    var stores: String // 3180
)

data class MapValue(
    @SerializedName("usItemId")
    var usItemId: String // 124374141
)

data class ItemStacksInterleavePosition(
    @SerializedName("stackId")
    var stackId: Int // 0
)

data class Pap(
    @SerializedName("polaris")
    var polaris: Polaris
)

data class Polaris(
    @SerializedName("rerankOffset")
    var rerankOffset: String // 2
)

data class Categories(
    @SerializedName("id")
    var id: String, // 0
    @SerializedName("name")
    var name: String // computer
)

data class AdditionalQueryParams(
    @SerializedName("hidden_facet")
    var hiddenFacet: Any?, // null
    @SerializedName("isMoreOptionsTileEnabled")
    var isMoreOptionsTileEnabled: Boolean, // true
    @SerializedName("translation")
    var translation: Any? // null
)

data class FitmentFieldParams(
    @SerializedName("dynamicFitmentEnabled")
    var dynamicFitmentEnabled: Boolean, // false
    @SerializedName("extendedAttributesEnabled")
    var extendedAttributesEnabled: Boolean, // false
    @SerializedName("powerSportEnabled")
    var powerSportEnabled: Boolean // true
)

data class FitmentSearchParams(
    @SerializedName("facet")
    var facet: String,
    @SerializedName("id")
    var id: String,
    @SerializedName("limit")
    var limit: Int, // 40
    @SerializedName("max_price")
    var maxPrice: String,
    @SerializedName("min_price")
    var minPrice: String,
    @SerializedName("module_search")
    var moduleSearch: String,
    @SerializedName("page")
    var page: Int, // 1
    @SerializedName("prg")
    var prg: String, // desktop
    @SerializedName("ps")
    var ps: Int, // 40
    @SerializedName("ptss")
    var ptss: String,
    @SerializedName("query")
    var query: String, // computer
    @SerializedName("rawFacet")
    var rawFacet: String,
    @SerializedName("recall_set")
    var recallSet: String,
    @SerializedName("seoPath")
    var seoPath: String,
    @SerializedName("sort")
    var sort: String, // best_match
    @SerializedName("storeSlotBooked")
    var storeSlotBooked: String,
    @SerializedName("trsp")
    var trsp: String
)

data class SearchArgsX(
    @SerializedName("cat_id")
    var catId: String,
    @SerializedName("facet")
    var facet: String,
    @SerializedName("prg")
    var prg: String, // desktop
    @SerializedName("query")
    var query: String // computer
)

data class AdsX(
    @SerializedName("env")
    var env: String, // production
    @SerializedName("host")
    var host: String, // https://www.walmart.com
    @SerializedName("moatId")
    var moatId: String, // WALMART_DISPLAY_S2S1
    @SerializedName("moatVideoId")
    var moatVideoId: String // WALMART_VIDEO_S2S1
)

data class EndpointMappings(
    @SerializedName("operations")
    var operations: Operations,
    @SerializedName("pages")
    var pages: Pages,
    @SerializedName("queryStrings")
    var queryStrings: QueryStrings
)

data class GoogleMaps(
    @SerializedName("addressAPIKey")
    var addressAPIKey: String, // AIzaSyBIAnB1a3UejjFVRNtszhaEE8yrKySRTEo
    @SerializedName("checkAddressAPIKey")
    var checkAddressAPIKey: String, // AIzaSyCX5gh3yoq4316wUDxRpljFOwWA6_-BEMg
    @SerializedName("geoCodingAPIKey")
    var geoCodingAPIKey: String, // AIzaSyBvv63fBVZ1RtNJLGkN9XCFE1WfVl0o1HY
    @SerializedName("riseMapAPIKey")
    var riseMapAPIKey: RiseMapAPIKey
)

data class Identity(
    @SerializedName("authFrameRoutes")
    var authFrameRoutes: AuthFrameRoutes,
    @SerializedName("context")
    var context: Context
)

data class MembershipConfig(
    @SerializedName("showWPlusBanner")
    var showWPlusBanner: Boolean // true
)

data class PerimeterX(
    @SerializedName("enable")
    var enable: Boolean, // true
    @SerializedName("initScript")
    var initScript: String // https://www.walmart.com/px/PXu6b0qd2S/init.js
)

data class PulseBeacon(
    @SerializedName("bd")
    var bd: String, // beacon.walmart.com
    @SerializedName("bh")
    var bh: String, // beacon.lightestwithqm.walmart.com
    @SerializedName("enable")
    var enable: Boolean, // true
    @SerializedName("hostWithQM")
    var hostWithQM: String, // beacon.lightestwithqm.walmart.com
    @SerializedName("hostWithoutQM")
    var hostWithoutQM: String, // beacon.lightest.walmart.com
    @SerializedName("hostname")
    var hostname: String, // i5.walmartimages.com
    @SerializedName("photoHost")
    var photoHost: String, // beacon.photowithqm.walmart.com
    @SerializedName("photoHostWithoutQM")
    var photoHostWithoutQM: String // beacon.photo.walmart.com
)

data class QueryContext(
    @SerializedName("appVersion")
    var appVersion: String, // main-1.94.0-e1296d-0817T1858
    @SerializedName("gql")
    var gql: Gql,
    @SerializedName("rest")
    var rest: Rest
)

data class TenantV2(
    @SerializedName("bu")
    var bu: String, // WALMART-US
    @SerializedName("mart")
    var mart: String // B2C
)

data class ThreatMetrix(
    @SerializedName("enable")
    var enable: Boolean // true
)

data class Operations(
    @SerializedName("mutation CancelOrder")
    var mutationCancelOrder: String, // cecph
    @SerializedName("mutation cancelReturnOrder")
    var mutationCancelReturnOrder: String, // cereturns
    @SerializedName("mutation CreateInsuranceSalesLead")
    var mutationCreateInsuranceSalesLead: String, // wellness
    @SerializedName("mutation MergeAndGetCart")
    var mutationMergeAndGetCart: String, // cecxo
    @SerializedName("mutation NotifyCapOneBannerSnooze")
    var mutationNotifyCapOneBannerSnooze: String, // cegateway
    @SerializedName("mutation setPickup")
    var mutationSetPickup: String, // cecxo
    @SerializedName("query AdV2Display")
    var queryAdV2Display: String, // adsgateway
    @SerializedName("query BrandPage")
    var queryBrandPage: String, // cegateway
    @SerializedName("query CartShopSimilar")
    var queryCartShopSimilar: String, // cegateway
    @SerializedName("query CartSubstitutions")
    var queryCartSubstitutions: String, // cegateway
    @SerializedName("query checkItemCartEligibility")
    var queryCheckItemCartEligibility: String, // cecxo
    @SerializedName("query configuration")
    var queryConfiguration: String, // cegateway
    @SerializedName("query ContentPage")
    var queryContentPage: String, // cegateway
    @SerializedName("query feedShow")
    var queryFeedShow: String, // cegateway
    @SerializedName("query feedShowCategories")
    var queryFeedShowCategories: String, // cegateway
    @SerializedName("query feedsByStatus")
    var queryFeedsByStatus: String, // cegateway
    @SerializedName("query feedsByStatusPaginated")
    var queryFeedsByStatusPaginated: String, // cegateway
    @SerializedName("query getCart")
    var queryGetCart: String, // cegateway
    @SerializedName("query GetCommPreference")
    var queryGetCommPreference: String, // cegateway
    @SerializedName("query GetEarlyAccessLearnMoreData")
    var queryGetEarlyAccessLearnMoreData: String, // ceaccount
    @SerializedName("query getGuestOrder")
    var queryGetGuestOrder: String, // cegateway
    @SerializedName("query LastCallPage")
    var queryLastCallPage: String, // cegateway
    @SerializedName("query LocalStoreCategoryContent")
    var queryLocalStoreCategoryContent: String, // cegateway
    @SerializedName("query LocalStoreContentQuery")
    var queryLocalStoreContentQuery: String, // cegateway
    @SerializedName("query NearbyNodesQuery")
    var queryNearbyNodesQuery: String, // cegateway
    @SerializedName("query NodeDetailQuery")
    var queryNodeDetailQuery: String, // cegateway
    @SerializedName("query nodeDetails")
    var queryNodeDetails: String, // cegateway
    @SerializedName("query PostCartLoadPage")
    var queryPostCartLoadPage: String, // cegateway
    @SerializedName("query ProtectionPlanDetail")
    var queryProtectionPlanDetail: String, // cecph
    @SerializedName("query PurchaseHistory")
    var queryPurchaseHistory: String, // cecph
    @SerializedName("query PurchasedProtectionPlans")
    var queryPurchasedProtectionPlans: String, // cecph
    @SerializedName("query PurchasedProtectionPlansV2")
    var queryPurchasedProtectionPlansV2: String, // cecph
    @SerializedName("query RewardsHistoryPage")
    var queryRewardsHistoryPage: String, // cegateway
    @SerializedName("query SavingsDashboard")
    var querySavingsDashboard: String, // cegateway
    @SerializedName("query SearchStore")
    var querySearchStore: String, // cegateway
    @SerializedName("query storeFinderNearbyNodesQuery")
    var queryStoreFinderNearbyNodesQuery: String, // cegateway
    @SerializedName("query subscriptions")
    var querySubscriptions: String // cegateway
)

data class Pages(
    @SerializedName("/acc/[id]")
    var accid: String, // cegateway
    @SerializedName("/account/*")
    var account: String, // cegateway
    @SerializedName("/acc/schedule-oil-change")
    var accscheduleOilChange: String, // cecxo
    @SerializedName("/all-departments")
    var allDepartments: String, // cegateway
    @SerializedName("/brand/[...brandParams]")
    var brandBrandParams: String, // cegateway
    @SerializedName("/brand/branddirectory")
    var brandbranddirectory: String, // cegateway
    @SerializedName("/browse/*")
    var browse: String, // cegateway
    @SerializedName("/c/[...seo]")
    var cSeo: String, // cegateway
    @SerializedName("/cart")
    var cart: String, // cecxo
    @SerializedName("/cash-overview")
    var cashOverview: String, // cegateway
    @SerializedName("/c/auto-directory/*")
    var cautoDirectory: String, // cegateway
    @SerializedName("/ci-control")
    var ciControl: String, // cegateway
    @SerializedName("/content/[...categoryParams]")
    var contentCategoryParams: String, // cegateway
    @SerializedName("/cp/[...categoryParams]")
    var cpCategoryParams: String, // cegateway
    @SerializedName("/fittingroom")
    var fittingroom: String, // cegateway
    @SerializedName("/g/*")
    var g: String, // cegateway
    @SerializedName("/g/[...seo]")
    var gSeo: String, // cegateway
    @SerializedName("/gic")
    var gic: String, // cegateway
    @SerializedName("/global/*")
    var global: String, // cegateway
    @SerializedName("/global/[...seo]")
    var globalSeo: String, // cegateway
    @SerializedName("/help/*")
    var help: String, // cegateway
    @SerializedName("/hp-redesign")
    var hpRedesign: String, // cegateway
    @SerializedName("/i/*")
    var i: String, // cegateway
    @SerializedName("/in-store-wifi/verify-code")
    var inStoreWifiverifyCode: String, // cegateway
    @SerializedName("/ip/[...itemParams]")
    var ipItemParams: String, // cegateway
    @SerializedName("/lists/*")
    var lists: String, // cegateway
    @SerializedName("/live-next")
    var liveNext: String, // cegateway
    @SerializedName("/live-next/browse")
    var liveNextbrowse: String, // cegateway
    @SerializedName("/live-next/shows")
    var liveNextshows: String, // cegateway
    @SerializedName("/my-items")
    var myItems: String, // cegateway
    @SerializedName("/my-registries")
    var myRegistries: String, // cegateway
    @SerializedName("/nonprofits/*")
    var nonprofits: String, // cegateway
    @SerializedName("/orders/*")
    var orders: String, // ceorders
    @SerializedName("/pac")
    var pac: String, // cecxo
    @SerializedName("/partner/plus/*")
    var partnerplus: String, // cegateway
    @SerializedName("/plus/*")
    var plus: String, // cegateway
    @SerializedName("/product/[...itemParams]")
    var productItemParams: String, // cegateway
    @SerializedName("/protection-plans")
    var protectionPlans: String, // cecph
    @SerializedName("/registry/*")
    var registry: String, // cegateway
    @SerializedName("/reviews/*")
    var reviews: String, // cegateway
    @SerializedName("/rewards-history")
    var rewardsHistory: String, // cegateway
    @SerializedName("/savings")
    var savings: String, // cegateway
    @SerializedName("/search/*")
    var search: String, // cegateway
    @SerializedName("/seller/*")
    var seller: String, // cegateway
    @SerializedName("/services")
    var services: String, // cegateway
    @SerializedName("/shop/*")
    var shop: String, // cegateway
    @SerializedName("/shop/[...seo]")
    var shopSeo: String, // cegateway
    @SerializedName("/shopwithme/*")
    var shopwithme: String, // cegateway
    @SerializedName("/sparkgood/*")
    var sparkgood: String, // cegateway
    @SerializedName("/store")
    var store: String, // cegateway
    @SerializedName("/store/[storeId]")
    var storestoreId: String, // cegateway
    @SerializedName("/store/[storeId]/[...contentType]")
    var storestoreIdContentType: String, // cegateway
    @SerializedName("/subscriptions/manage")
    var subscriptionsmanage: String, // cegateway
    @SerializedName("/thankyou")
    var thankyou: String, // cecxo
    @SerializedName("/thankyou/pindrop")
    var thankyoupindrop: String, // cecxo
    @SerializedName("/topic/[...seo]")
    var topicSeo: String, // cegateway
    @SerializedName("/tp/*")
    var tp: String, // cegateway
    @SerializedName("/update-payment-method")
    var updatePaymentMethod: String, // cegateway
    @SerializedName("/update-payment-method-form")
    var updatePaymentMethodForm: String, // cegateway
    @SerializedName("/updatecart")
    var updatecart: String, // cecxo
    @SerializedName("/wallet/associate-discount")
    var walletassociateDiscount: String, // cegateway
    @SerializedName("/wp/*")
    var wp: String, // cegateway
    @SerializedName("/404")
    var x404: String // cegateway
)

data class QueryStrings(
    @SerializedName("entitytype=*")
    var entitytype: String, // ceorders
    @SerializedName("source=*")
    var source: String, // ceorders
    @SerializedName("state=*")
    var state: String, // ceorders
    @SerializedName("step=bookslot")
    var stepbookslot: String, // cecxo
    @SerializedName("step=cart")
    var stepcart: String // cecxo
)

data class RiseMapAPIKey(
    @SerializedName("defaultKey")
    var defaultKey: String, // AIzaSyA0Gi6N7afDzAqBiPI3MlWDMaaxC5xKldM
    @SerializedName("dev")
    var dev: String // AIzaSyA9K6pBcYvCp4_FxKHsPi-JDJfvcvSbtp0
)

data class AuthFrameRoutes(
    @SerializedName("frame")
    var frame: String, // /account/login
    @SerializedName("gxoSignin")
    var gxoSignin: String, // /account/login
    @SerializedName("gxoSignup")
    var gxoSignup: String, // /account/signup/gxo
    @SerializedName("reauthFrame")
    var reauthFrame: String // /account/login
)

data class Context(
    @SerializedName("createAccountPathname")
    var createAccountPathname: String, // /account/signup
    @SerializedName("footerOptions")
    var footerOptions: List<Any>,
    @SerializedName("marketingEmails")
    var marketingEmails: Boolean, // true
    @SerializedName("privacyLink")
    var privacyLink: String,
    @SerializedName("rightsReservedText")
    var rightsReservedText: String,
    @SerializedName("signInPathname")
    var signInPathname: String, // /account/login
    @SerializedName("signOutUrl")
    var signOutUrl: String, // /account/logout
    @SerializedName("tenants")
    var tenants: List<Tenant>,
    @SerializedName("termsLink")
    var termsLink: String
)

data class Tenant(
    @SerializedName("host")
    var host: Host,
    @SerializedName("mart")
    var mart: String, // B2B
    @SerializedName("templates")
    var templates: List<String>
)

data class Host(
    @SerializedName("production")
    var production: String, // business.walmart.com
    @SerializedName("stage")
    var stage: String, // business-stage.walmart.com
    @SerializedName("teflon")
    var teflon: String // business-teflon.walmart.com
)

data class Gql(
    @SerializedName("endpointsByName")
    var endpointsByName: EndpointsByName
)

data class Rest(
    @SerializedName("endpointsByName")
    var endpointsByName: EndpointsByNameX
)

data class EndpointsByName(
    @SerializedName("adsgateway")
    var adsgateway: String, // /swag/graphql
    @SerializedName("aroundme")
    var aroundme: String, // /around-me/graphql
    @SerializedName("ceaccount")
    var ceaccount: String, // /orchestra/account/graphql
    @SerializedName("cecph")
    var cecph: String, // /orchestra/cph/graphql
    @SerializedName("cecxo")
    var cecxo: String, // /orchestra/cartxo/graphql
    @SerializedName("cegateway")
    var cegateway: String, // /orchestra/home/graphql
    @SerializedName("ceorders")
    var ceorders: String, // /orchestra/orders/graphql
    @SerializedName("cereturns")
    var cereturns: String, // /orchestra/orders/graphql
    @SerializedName("wellness")
    var wellness: String // https://developer.api.us2.walmart.com/api-proxy/service/hw/wellnessplusservice/v1/graphql
)

data class EndpointsByNameX(
    @SerializedName("ceaccount")
    var ceaccount: String, // /orchestra/api/account
    @SerializedName("ceccm")
    var ceccm: String, // /orchestra/api/ccm/v2/bootstrap
    @SerializedName("cehelp")
    var cehelp: String, // /orchestra/help/api
    @SerializedName("cehelpchat")
    var cehelpchat: String, // /orchestra/helpChat/api
    @SerializedName("ceidentity")
    var ceidentity: String, // /orchestra/account/electrode/api/identity
    @SerializedName("cereturns")
    var cereturns: String, // /orchestra/api/returns
    @SerializedName("cewarp")
    var cewarp: String, // /orchestra/api/warp
    @SerializedName("cewireless")
    var cewireless: String, // /orchestra/api/wireless
    @SerializedName("espvalidation")
    var espvalidation: String, // /esp/prepaid/v1/plans
    @SerializedName("feedbackSubmit")
    var feedbackSubmit: String, // /orchestra/api/customer-survey/submit
    @SerializedName("fuelPrices")
    var fuelPrices: String, // /graphql
    @SerializedName("quimbyMobile")
    var quimbyMobile: String, // /orchestra/api/tempo
    @SerializedName("shopwithme")
    var shopwithme: String, // /feeds
    @SerializedName("storeservices")
    var storeservices: String, // /graphql
    @SerializedName("typeahead")
    var typeahead: String, // /typeahead/v3/complete
    @SerializedName("warppaymentoptions")
    var warppaymentoptions: String // /orchestra/api/online/variantbasic/item
)