#import <Foundation/NSArray.h>
#import <Foundation/NSDictionary.h>
#import <Foundation/NSError.h>
#import <Foundation/NSObject.h>
#import <Foundation/NSSet.h>
#import <Foundation/NSString.h>
#import <Foundation/NSValue.h>

@class Collection_impl_sharedCollectionItem, Collection_impl_sharedCollection, Collection_impl_sharedCollectionType, Collection_impl_sharedKotlinEnumCompanion, Collection_impl_sharedKotlinEnum<E>, Collection_impl_sharedKotlinArray<T>;

@protocol Collection_impl_sharedKotlinComparable, Collection_impl_sharedKotlinIterator;

NS_ASSUME_NONNULL_BEGIN
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wunknown-warning-option"
#pragma clang diagnostic ignored "-Wincompatible-property-type"
#pragma clang diagnostic ignored "-Wnullability"

#pragma push_macro("_Nullable_result")
#if !__has_feature(nullability_nullable_result)
#undef _Nullable_result
#define _Nullable_result _Nullable
#endif

__attribute__((swift_name("KotlinBase")))
@interface Collection_impl_sharedBase : NSObject
- (instancetype)init __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
+ (void)initialize __attribute__((objc_requires_super));
@end

@interface Collection_impl_sharedBase (Collection_impl_sharedBaseCopying) <NSCopying>
@end

__attribute__((swift_name("KotlinMutableSet")))
@interface Collection_impl_sharedMutableSet<ObjectType> : NSMutableSet<ObjectType>
@end

__attribute__((swift_name("KotlinMutableDictionary")))
@interface Collection_impl_sharedMutableDictionary<KeyType, ObjectType> : NSMutableDictionary<KeyType, ObjectType>
@end

@interface NSError (NSErrorCollection_impl_sharedKotlinException)
@property (readonly) id _Nullable kotlinException;
@end

__attribute__((swift_name("KotlinNumber")))
@interface Collection_impl_sharedNumber : NSNumber
- (instancetype)initWithChar:(char)value __attribute__((unavailable));
- (instancetype)initWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
- (instancetype)initWithShort:(short)value __attribute__((unavailable));
- (instancetype)initWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
- (instancetype)initWithInt:(int)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
- (instancetype)initWithLong:(long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
- (instancetype)initWithLongLong:(long long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
- (instancetype)initWithFloat:(float)value __attribute__((unavailable));
- (instancetype)initWithDouble:(double)value __attribute__((unavailable));
- (instancetype)initWithBool:(BOOL)value __attribute__((unavailable));
- (instancetype)initWithInteger:(NSInteger)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
+ (instancetype)numberWithChar:(char)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
+ (instancetype)numberWithShort:(short)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
+ (instancetype)numberWithInt:(int)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
+ (instancetype)numberWithLong:(long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
+ (instancetype)numberWithLongLong:(long long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
+ (instancetype)numberWithFloat:(float)value __attribute__((unavailable));
+ (instancetype)numberWithDouble:(double)value __attribute__((unavailable));
+ (instancetype)numberWithBool:(BOOL)value __attribute__((unavailable));
+ (instancetype)numberWithInteger:(NSInteger)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
@end

__attribute__((swift_name("KotlinByte")))
@interface Collection_impl_sharedByte : Collection_impl_sharedNumber
- (instancetype)initWithChar:(char)value;
+ (instancetype)numberWithChar:(char)value;
@end

__attribute__((swift_name("KotlinUByte")))
@interface Collection_impl_sharedUByte : Collection_impl_sharedNumber
- (instancetype)initWithUnsignedChar:(unsigned char)value;
+ (instancetype)numberWithUnsignedChar:(unsigned char)value;
@end

__attribute__((swift_name("KotlinShort")))
@interface Collection_impl_sharedShort : Collection_impl_sharedNumber
- (instancetype)initWithShort:(short)value;
+ (instancetype)numberWithShort:(short)value;
@end

__attribute__((swift_name("KotlinUShort")))
@interface Collection_impl_sharedUShort : Collection_impl_sharedNumber
- (instancetype)initWithUnsignedShort:(unsigned short)value;
+ (instancetype)numberWithUnsignedShort:(unsigned short)value;
@end

__attribute__((swift_name("KotlinInt")))
@interface Collection_impl_sharedInt : Collection_impl_sharedNumber
- (instancetype)initWithInt:(int)value;
+ (instancetype)numberWithInt:(int)value;
@end

__attribute__((swift_name("KotlinUInt")))
@interface Collection_impl_sharedUInt : Collection_impl_sharedNumber
- (instancetype)initWithUnsignedInt:(unsigned int)value;
+ (instancetype)numberWithUnsignedInt:(unsigned int)value;
@end

__attribute__((swift_name("KotlinLong")))
@interface Collection_impl_sharedLong : Collection_impl_sharedNumber
- (instancetype)initWithLongLong:(long long)value;
+ (instancetype)numberWithLongLong:(long long)value;
@end

__attribute__((swift_name("KotlinULong")))
@interface Collection_impl_sharedULong : Collection_impl_sharedNumber
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value;
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value;
@end

__attribute__((swift_name("KotlinFloat")))
@interface Collection_impl_sharedFloat : Collection_impl_sharedNumber
- (instancetype)initWithFloat:(float)value;
+ (instancetype)numberWithFloat:(float)value;
@end

__attribute__((swift_name("KotlinDouble")))
@interface Collection_impl_sharedDouble : Collection_impl_sharedNumber
- (instancetype)initWithDouble:(double)value;
+ (instancetype)numberWithDouble:(double)value;
@end

__attribute__((swift_name("KotlinBoolean")))
@interface Collection_impl_sharedBoolean : Collection_impl_sharedNumber
- (instancetype)initWithBool:(BOOL)value;
+ (instancetype)numberWithBool:(BOOL)value;
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Collection")))
@interface Collection_impl_sharedCollection : Collection_impl_sharedBase
- (instancetype)initWithTotal:(int32_t)total items:(NSArray<Collection_impl_sharedCollectionItem *> *)items __attribute__((swift_name("init(total:items:)"))) __attribute__((objc_designated_initializer));
- (int32_t)component1 __attribute__((swift_name("component1()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSArray<Collection_impl_sharedCollectionItem *> *)component2 __attribute__((swift_name("component2()"))) __attribute__((deprecated("use corresponding property instead")));
- (Collection_impl_sharedCollection *)doCopyTotal:(int32_t)total items:(NSArray<Collection_impl_sharedCollectionItem *> *)items __attribute__((swift_name("doCopy(total:items:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<Collection_impl_sharedCollectionItem *> *items __attribute__((swift_name("items")));
@property (readonly) int32_t total __attribute__((swift_name("total")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CollectionItem")))
@interface Collection_impl_sharedCollectionItem : Collection_impl_sharedBase
- (instancetype)initWithItemId:(NSString *)itemId parentGroupId:(NSString *)parentGroupId parentGroupIndex:(NSString *)parentGroupIndex localizedNameKey:(NSString *)localizedNameKey localizedDescriptionKey:(NSString *)localizedDescriptionKey imageUrl:(NSString *)imageUrl locationIds:(NSArray<NSString *> *)locationIds types:(NSArray<Collection_impl_sharedCollectionType *> *)types externalTypeRefId:(NSArray<NSString *> *)externalTypeRefId activityIds:(NSArray<NSString *> *)activityIds collectionRecipeIds:(NSArray<NSString *> *)collectionRecipeIds starCount:(int32_t)starCount energyValue:(int32_t)energyValue buyPrice:(int32_t)buyPrice sellPrice:(int32_t)sellPrice __attribute__((swift_name("init(itemId:parentGroupId:parentGroupIndex:localizedNameKey:localizedDescriptionKey:imageUrl:locationIds:types:externalTypeRefId:activityIds:collectionRecipeIds:starCount:energyValue:buyPrice:sellPrice:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSArray<NSString *> *)component10 __attribute__((swift_name("component10()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSArray<NSString *> *)component11 __attribute__((swift_name("component11()"))) __attribute__((deprecated("use corresponding property instead")));
- (int32_t)component12 __attribute__((swift_name("component12()"))) __attribute__((deprecated("use corresponding property instead")));
- (int32_t)component13 __attribute__((swift_name("component13()"))) __attribute__((deprecated("use corresponding property instead")));
- (int32_t)component14 __attribute__((swift_name("component14()"))) __attribute__((deprecated("use corresponding property instead")));
- (int32_t)component15 __attribute__((swift_name("component15()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSString *)component2 __attribute__((swift_name("component2()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSString *)component3 __attribute__((swift_name("component3()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSString *)component4 __attribute__((swift_name("component4()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSString *)component5 __attribute__((swift_name("component5()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSString *)component6 __attribute__((swift_name("component6()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSArray<NSString *> *)component7 __attribute__((swift_name("component7()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSArray<Collection_impl_sharedCollectionType *> *)component8 __attribute__((swift_name("component8()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSArray<NSString *> *)component9 __attribute__((swift_name("component9()"))) __attribute__((deprecated("use corresponding property instead")));
- (Collection_impl_sharedCollectionItem *)doCopyItemId:(NSString *)itemId parentGroupId:(NSString *)parentGroupId parentGroupIndex:(NSString *)parentGroupIndex localizedNameKey:(NSString *)localizedNameKey localizedDescriptionKey:(NSString *)localizedDescriptionKey imageUrl:(NSString *)imageUrl locationIds:(NSArray<NSString *> *)locationIds types:(NSArray<Collection_impl_sharedCollectionType *> *)types externalTypeRefId:(NSArray<NSString *> *)externalTypeRefId activityIds:(NSArray<NSString *> *)activityIds collectionRecipeIds:(NSArray<NSString *> *)collectionRecipeIds starCount:(int32_t)starCount energyValue:(int32_t)energyValue buyPrice:(int32_t)buyPrice sellPrice:(int32_t)sellPrice __attribute__((swift_name("doCopy(itemId:parentGroupId:parentGroupIndex:localizedNameKey:localizedDescriptionKey:imageUrl:locationIds:types:externalTypeRefId:activityIds:collectionRecipeIds:starCount:energyValue:buyPrice:sellPrice:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<NSString *> *activityIds __attribute__((swift_name("activityIds")));
@property (readonly) int32_t buyPrice __attribute__((swift_name("buyPrice")));
@property (readonly) NSArray<NSString *> *collectionRecipeIds __attribute__((swift_name("collectionRecipeIds")));
@property (readonly) int32_t energyValue __attribute__((swift_name("energyValue")));
@property (readonly) NSArray<NSString *> *externalTypeRefId __attribute__((swift_name("externalTypeRefId")));
@property (readonly) NSString *imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) NSString *itemId __attribute__((swift_name("itemId")));
@property (readonly) NSString *localizedDescriptionKey __attribute__((swift_name("localizedDescriptionKey")));
@property (readonly) NSString *localizedNameKey __attribute__((swift_name("localizedNameKey")));
@property (readonly) NSArray<NSString *> *locationIds __attribute__((swift_name("locationIds")));
@property (readonly) NSString *parentGroupId __attribute__((swift_name("parentGroupId")));
@property (readonly) NSString *parentGroupIndex __attribute__((swift_name("parentGroupIndex")));
@property (readonly) int32_t sellPrice __attribute__((swift_name("sellPrice")));
@property (readonly) int32_t starCount __attribute__((swift_name("starCount")));
@property (readonly) NSArray<Collection_impl_sharedCollectionType *> *types __attribute__((swift_name("types")));
@end

__attribute__((swift_name("KotlinComparable")))
@protocol Collection_impl_sharedKotlinComparable
@required
- (int32_t)compareToOther:(id _Nullable)other __attribute__((swift_name("compareTo(other:)")));
@end

__attribute__((swift_name("KotlinEnum")))
@interface Collection_impl_sharedKotlinEnum<E> : Collection_impl_sharedBase <Collection_impl_sharedKotlinComparable>
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) Collection_impl_sharedKotlinEnumCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(E)other __attribute__((swift_name("compareTo(other:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@property (readonly) int32_t ordinal __attribute__((swift_name("ordinal")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CollectionType")))
@interface Collection_impl_sharedCollectionType : Collection_impl_sharedKotlinEnum<Collection_impl_sharedCollectionType *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) Collection_impl_sharedCollectionType *memory __attribute__((swift_name("memory")));
@property (class, readonly) Collection_impl_sharedCollectionType *character __attribute__((swift_name("character")));
@property (class, readonly) Collection_impl_sharedCollectionType *crafting __attribute__((swift_name("crafting")));
@property (class, readonly) Collection_impl_sharedCollectionType *critter __attribute__((swift_name("critter")));
@property (class, readonly) Collection_impl_sharedCollectionType *fish __attribute__((swift_name("fish")));
@property (class, readonly) Collection_impl_sharedCollectionType *foraging __attribute__((swift_name("foraging")));
@property (class, readonly) Collection_impl_sharedCollectionType *ingredient __attribute__((swift_name("ingredient")));
@property (class, readonly) Collection_impl_sharedCollectionType *meal __attribute__((swift_name("meal")));
@property (class, readonly) Collection_impl_sharedCollectionType *gem __attribute__((swift_name("gem")));
@property (class, readonly) Collection_impl_sharedCollectionType *clothing __attribute__((swift_name("clothing")));
@property (class, readonly) Collection_impl_sharedCollectionType *furniture __attribute__((swift_name("furniture")));
+ (Collection_impl_sharedKotlinArray<Collection_impl_sharedCollectionType *> *)values __attribute__((swift_name("values()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Hi")))
@interface Collection_impl_sharedHi : Collection_impl_sharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinEnumCompanion")))
@interface Collection_impl_sharedKotlinEnumCompanion : Collection_impl_sharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) Collection_impl_sharedKotlinEnumCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinArray")))
@interface Collection_impl_sharedKotlinArray<T> : Collection_impl_sharedBase
+ (instancetype)arrayWithSize:(int32_t)size init:(T _Nullable (^)(Collection_impl_sharedInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (T _Nullable)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (id<Collection_impl_sharedKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(T _Nullable)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size __attribute__((swift_name("size")));
@end

__attribute__((swift_name("KotlinIterator")))
@protocol Collection_impl_sharedKotlinIterator
@required
- (BOOL)hasNext __attribute__((swift_name("hasNext()")));
- (id _Nullable)next __attribute__((swift_name("next()")));
@end

#pragma pop_macro("_Nullable_result")
#pragma clang diagnostic pop
NS_ASSUME_NONNULL_END
