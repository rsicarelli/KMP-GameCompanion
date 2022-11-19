#import <Foundation/NSArray.h>
#import <Foundation/NSDictionary.h>
#import <Foundation/NSError.h>
#import <Foundation/NSObject.h>
#import <Foundation/NSSet.h>
#import <Foundation/NSString.h>
#import <Foundation/NSValue.h>

@class Api_sharedScope, Api_sharedParametersHolder, Api_sharedKotlinLazyThreadSafetyMode, Api_sharedModule, Api_sharedLogger, Api_sharedInstanceRegistry, Api_sharedPropertyRegistry, Api_sharedScopeRegistry, Api_sharedKoinApplicationCompanion, Api_sharedKoinApplication, Api_sharedKotlinArray<T>, Api_sharedLevel, Api_sharedKoin, Api_sharedLockable, Api_sharedInstanceFactory<T>, Api_sharedScopeRegistryCompanion, Api_sharedKotlinPair<__covariant A, __covariant B>, Api_sharedScopeDSL, Api_sharedSingleInstanceFactory<T>, Api_sharedStringQualifier, Api_sharedKotlinThrowable, Api_sharedKotlinException, Api_sharedKind, Api_sharedBeanDefinition<T>, Api_sharedCallbacks<T>, Api_sharedKotlinEnumCompanion, Api_sharedKotlinEnum<E>, Api_sharedInstanceFactoryCompanion, Api_sharedInstanceContext, Api_sharedParametersHolderCompanion, Api_sharedKoinPlatformTimeTools, Api_sharedKoinPlatformTools, Api_sharedTypeQualifier, Api_sharedFactoryInstanceFactory<T>, Api_sharedScopedInstanceFactory<T>;

@protocol Api_sharedKoinScopeComponent, Api_sharedQualifier, Api_sharedKotlinKClass, Api_sharedKotlinLazy, Api_sharedScopeCallback, Api_sharedKoinComponent, Api_sharedKotlinComparable, Api_sharedKoinContext, Api_sharedKotlinKDeclarationContainer, Api_sharedKotlinKAnnotatedElement, Api_sharedKotlinKClassifier, Api_sharedKotlinIterator;

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
@interface Api_sharedBase : NSObject
- (instancetype)init __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
+ (void)initialize __attribute__((objc_requires_super));
@end

@interface Api_sharedBase (Api_sharedBaseCopying) <NSCopying>
@end

__attribute__((swift_name("KotlinMutableSet")))
@interface Api_sharedMutableSet<ObjectType> : NSMutableSet<ObjectType>
@end

__attribute__((swift_name("KotlinMutableDictionary")))
@interface Api_sharedMutableDictionary<KeyType, ObjectType> : NSMutableDictionary<KeyType, ObjectType>
@end

@interface NSError (NSErrorApi_sharedKotlinException)
@property (readonly) id _Nullable kotlinException;
@end

__attribute__((swift_name("KotlinNumber")))
@interface Api_sharedNumber : NSNumber
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
@interface Api_sharedByte : Api_sharedNumber
- (instancetype)initWithChar:(char)value;
+ (instancetype)numberWithChar:(char)value;
@end

__attribute__((swift_name("KotlinUByte")))
@interface Api_sharedUByte : Api_sharedNumber
- (instancetype)initWithUnsignedChar:(unsigned char)value;
+ (instancetype)numberWithUnsignedChar:(unsigned char)value;
@end

__attribute__((swift_name("KotlinShort")))
@interface Api_sharedShort : Api_sharedNumber
- (instancetype)initWithShort:(short)value;
+ (instancetype)numberWithShort:(short)value;
@end

__attribute__((swift_name("KotlinUShort")))
@interface Api_sharedUShort : Api_sharedNumber
- (instancetype)initWithUnsignedShort:(unsigned short)value;
+ (instancetype)numberWithUnsignedShort:(unsigned short)value;
@end

__attribute__((swift_name("KotlinInt")))
@interface Api_sharedInt : Api_sharedNumber
- (instancetype)initWithInt:(int)value;
+ (instancetype)numberWithInt:(int)value;
@end

__attribute__((swift_name("KotlinUInt")))
@interface Api_sharedUInt : Api_sharedNumber
- (instancetype)initWithUnsignedInt:(unsigned int)value;
+ (instancetype)numberWithUnsignedInt:(unsigned int)value;
@end

__attribute__((swift_name("KotlinLong")))
@interface Api_sharedLong : Api_sharedNumber
- (instancetype)initWithLongLong:(long long)value;
+ (instancetype)numberWithLongLong:(long long)value;
@end

__attribute__((swift_name("KotlinULong")))
@interface Api_sharedULong : Api_sharedNumber
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value;
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value;
@end

__attribute__((swift_name("KotlinFloat")))
@interface Api_sharedFloat : Api_sharedNumber
- (instancetype)initWithFloat:(float)value;
+ (instancetype)numberWithFloat:(float)value;
@end

__attribute__((swift_name("KotlinDouble")))
@interface Api_sharedDouble : Api_sharedNumber
- (instancetype)initWithDouble:(double)value;
+ (instancetype)numberWithDouble:(double)value;
@end

__attribute__((swift_name("KotlinBoolean")))
@interface Api_sharedBoolean : Api_sharedNumber
- (instancetype)initWithBool:(BOOL)value;
+ (instancetype)numberWithBool:(BOOL)value;
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin")))
@interface Api_sharedKoin : Api_sharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)close __attribute__((swift_name("close()")));
- (void)createEagerInstances __attribute__((swift_name("createEagerInstances()")));
- (Api_sharedScope *)createScopeT:(id<Api_sharedKoinScopeComponent>)t __attribute__((swift_name("createScope(t:)")));
- (Api_sharedScope *)createScopeScopeId:(NSString *)scopeId __attribute__((swift_name("createScope(scopeId:)")));
- (Api_sharedScope *)createScopeScopeId:(NSString *)scopeId source:(id _Nullable)source __attribute__((swift_name("createScope(scopeId:source:)")));
- (Api_sharedScope *)createScopeScopeId:(NSString *)scopeId qualifier:(id<Api_sharedQualifier>)qualifier source:(id _Nullable)source __attribute__((swift_name("createScope(scopeId:qualifier:source:)")));
- (void)declareInstance:(id _Nullable)instance qualifier:(id<Api_sharedQualifier> _Nullable)qualifier secondaryTypes:(NSArray<id<Api_sharedKotlinKClass>> *)secondaryTypes allowOverride:(BOOL)allowOverride __attribute__((swift_name("declare(instance:qualifier:secondaryTypes:allowOverride:)")));
- (void)deletePropertyKey:(NSString *)key __attribute__((swift_name("deleteProperty(key:)")));
- (void)deleteScopeScopeId:(NSString *)scopeId __attribute__((swift_name("deleteScope(scopeId:)")));
- (id _Nullable)getClazz:(id<Api_sharedKotlinKClass>)clazz qualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(clazz:qualifier:parameters:)")));
- (id)getQualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(qualifier:parameters:)")));
- (NSArray<id> *)getAll __attribute__((swift_name("getAll()")));
- (Api_sharedScope *)getOrCreateScopeScopeId:(NSString *)scopeId __attribute__((swift_name("getOrCreateScope(scopeId:)")));
- (Api_sharedScope *)getOrCreateScopeScopeId:(NSString *)scopeId qualifier:(id<Api_sharedQualifier>)qualifier source:(id _Nullable)source __attribute__((swift_name("getOrCreateScope(scopeId:qualifier:source:)")));
- (id _Nullable)getOrNullClazz:(id<Api_sharedKotlinKClass>)clazz qualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("getOrNull(clazz:qualifier:parameters:)")));
- (id _Nullable)getOrNullQualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("getOrNull(qualifier:parameters:)")));
- (id _Nullable)getPropertyKey:(NSString *)key __attribute__((swift_name("getProperty(key:)")));
- (id)getPropertyKey:(NSString *)key defaultValue:(id)defaultValue __attribute__((swift_name("getProperty(key:defaultValue:)")));
- (Api_sharedScope *)getScopeScopeId:(NSString *)scopeId __attribute__((swift_name("getScope(scopeId:)")));
- (Api_sharedScope * _Nullable)getScopeOrNullScopeId:(NSString *)scopeId __attribute__((swift_name("getScopeOrNull(scopeId:)")));
- (id<Api_sharedKotlinLazy>)injectQualifier:(id<Api_sharedQualifier> _Nullable)qualifier mode:(Api_sharedKotlinLazyThreadSafetyMode *)mode parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("inject(qualifier:mode:parameters:)")));
- (id<Api_sharedKotlinLazy>)injectOrNullQualifier:(id<Api_sharedQualifier> _Nullable)qualifier mode:(Api_sharedKotlinLazyThreadSafetyMode *)mode parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("injectOrNull(qualifier:mode:parameters:)")));
- (void)loadModulesModules:(NSArray<Api_sharedModule *> *)modules allowOverride:(BOOL)allowOverride __attribute__((swift_name("loadModules(modules:allowOverride:)")));
- (void)setPropertyKey:(NSString *)key value:(id)value __attribute__((swift_name("setProperty(key:value:)")));
- (void)setupLoggerLogger:(Api_sharedLogger *)logger __attribute__((swift_name("setupLogger(logger:)")));
- (void)unloadModulesModules:(NSArray<Api_sharedModule *> *)modules __attribute__((swift_name("unloadModules(modules:)")));
@property (readonly) Api_sharedInstanceRegistry *instanceRegistry __attribute__((swift_name("instanceRegistry")));
@property (readonly) Api_sharedLogger *logger __attribute__((swift_name("logger")));
@property (readonly) Api_sharedPropertyRegistry *propertyRegistry __attribute__((swift_name("propertyRegistry")));
@property (readonly) Api_sharedScopeRegistry *scopeRegistry __attribute__((swift_name("scopeRegistry")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KoinApplication")))
@interface Api_sharedKoinApplication : Api_sharedBase
@property (class, readonly, getter=companion) Api_sharedKoinApplicationCompanion *companion __attribute__((swift_name("companion")));
- (void)allowOverrideOverride:(BOOL)override __attribute__((swift_name("allowOverride(override:)")));
- (void)close __attribute__((swift_name("close()")));
- (void)createEagerInstances __attribute__((swift_name("createEagerInstances()")));
- (Api_sharedKoinApplication *)loggerLogger:(Api_sharedLogger *)logger __attribute__((swift_name("logger(logger:)")));
- (Api_sharedKoinApplication *)modulesModules:(Api_sharedKotlinArray<Api_sharedModule *> *)modules __attribute__((swift_name("modules(modules:)")));
- (Api_sharedKoinApplication *)modulesModules_:(NSArray<Api_sharedModule *> *)modules __attribute__((swift_name("modules(modules_:)")));
- (Api_sharedKoinApplication *)modulesModules__:(Api_sharedModule *)modules __attribute__((swift_name("modules(modules__:)")));
- (Api_sharedKoinApplication *)printLoggerLevel:(Api_sharedLevel *)level __attribute__((swift_name("printLogger(level:)")));
- (Api_sharedKoinApplication *)propertiesValues:(NSDictionary<NSString *, id> *)values __attribute__((swift_name("properties(values:)")));
- (void)unloadModulesModules:(NSArray<Api_sharedModule *> *)modules __attribute__((swift_name("unloadModules(modules:)")));
- (void)unloadModulesModule:(Api_sharedModule *)module __attribute__((swift_name("unloadModules(module:)")));
@property (readonly) Api_sharedKoin *koin __attribute__((swift_name("koin")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KoinApplication.Companion")))
@interface Api_sharedKoinApplicationCompanion : Api_sharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) Api_sharedKoinApplicationCompanion *shared __attribute__((swift_name("shared")));
- (Api_sharedKoinApplication *)doInit __attribute__((swift_name("doInit()")));
@end

__attribute__((swift_name("KoinContext")))
@protocol Api_sharedKoinContext
@required
- (Api_sharedKoin *)get __attribute__((swift_name("get()")));
- (Api_sharedKoin * _Nullable)getOrNull __attribute__((swift_name("getOrNull()")));
- (void)loadKoinModulesModules:(NSArray<Api_sharedModule *> *)modules __attribute__((swift_name("loadKoinModules(modules:)")));
- (void)loadKoinModulesModule:(Api_sharedModule *)module __attribute__((swift_name("loadKoinModules(module:)")));
- (Api_sharedKoinApplication *)startKoinKoinApplication:(Api_sharedKoinApplication *)koinApplication __attribute__((swift_name("startKoin(koinApplication:)")));
- (Api_sharedKoinApplication *)startKoinAppDeclaration:(void (^)(Api_sharedKoinApplication *))appDeclaration __attribute__((swift_name("startKoin(appDeclaration:)")));
- (void)stopKoin __attribute__((swift_name("stopKoin()")));
- (void)unloadKoinModulesModules:(NSArray<Api_sharedModule *> *)modules __attribute__((swift_name("unloadKoinModules(modules:)")));
- (void)unloadKoinModulesModule:(Api_sharedModule *)module __attribute__((swift_name("unloadKoinModules(module:)")));
@end

__attribute__((swift_name("Lockable")))
@interface Api_sharedLockable : Api_sharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Scope")))
@interface Api_sharedScope : Api_sharedLockable
- (instancetype)initWithScopeQualifier:(id<Api_sharedQualifier>)scopeQualifier id:(NSString *)id isRoot:(BOOL)isRoot _koin:(Api_sharedKoin *)_koin __attribute__((swift_name("init(scopeQualifier:id:isRoot:_koin:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)close __attribute__((swift_name("close()")));
- (id<Api_sharedQualifier>)component1 __attribute__((swift_name("component1()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSString *)component2 __attribute__((swift_name("component2()"))) __attribute__((deprecated("use corresponding property instead")));
- (BOOL)component3 __attribute__((swift_name("component3()"))) __attribute__((deprecated("use corresponding property instead")));
- (Api_sharedScope *)doCopyScopeQualifier:(id<Api_sharedQualifier>)scopeQualifier id:(NSString *)id isRoot:(BOOL)isRoot _koin:(Api_sharedKoin *)_koin __attribute__((swift_name("doCopy(scopeQualifier:id:isRoot:_koin:)")));
- (void)declareInstance:(id _Nullable)instance qualifier:(id<Api_sharedQualifier> _Nullable)qualifier secondaryTypes:(NSArray<id<Api_sharedKotlinKClass>> *)secondaryTypes allowOverride:(BOOL)allowOverride __attribute__((swift_name("declare(instance:qualifier:secondaryTypes:allowOverride:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (id _Nullable)getClazz:(id<Api_sharedKotlinKClass>)clazz qualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(clazz:qualifier:parameters:)")));
- (id)getQualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(qualifier:parameters:)")));
- (NSArray<id> *)getAll __attribute__((swift_name("getAll()")));
- (NSArray<id> *)getAllClazz:(id<Api_sharedKotlinKClass>)clazz __attribute__((swift_name("getAll(clazz:)")));
- (Api_sharedKoin *)getKoin __attribute__((swift_name("getKoin()")));
- (id _Nullable)getOrNullClazz:(id<Api_sharedKotlinKClass>)clazz qualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("getOrNull(clazz:qualifier:parameters:)")));
- (id _Nullable)getOrNullQualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("getOrNull(qualifier:parameters:)")));
- (id)getPropertyKey:(NSString *)key __attribute__((swift_name("getProperty(key:)")));
- (id)getPropertyKey:(NSString *)key defaultValue:(id)defaultValue __attribute__((swift_name("getProperty(key:defaultValue:)")));
- (id _Nullable)getPropertyOrNullKey:(NSString *)key __attribute__((swift_name("getPropertyOrNull(key:)")));
- (Api_sharedScope *)getScopeScopeID:(NSString *)scopeID __attribute__((swift_name("getScope(scopeID:)")));
- (id _Nullable)getSource __attribute__((swift_name("getSource()"))) __attribute__((deprecated("No need to use getSource(). You can an use get() directly.")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (id<Api_sharedKotlinLazy>)injectQualifier:(id<Api_sharedQualifier> _Nullable)qualifier mode:(Api_sharedKotlinLazyThreadSafetyMode *)mode parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("inject(qualifier:mode:parameters:)")));
- (id<Api_sharedKotlinLazy>)injectOrNullQualifier:(id<Api_sharedQualifier> _Nullable)qualifier mode:(Api_sharedKotlinLazyThreadSafetyMode *)mode parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("injectOrNull(qualifier:mode:parameters:)")));
- (BOOL)isNotClosed __attribute__((swift_name("isNotClosed()")));
- (void)linkToScopes:(Api_sharedKotlinArray<Api_sharedScope *> *)scopes __attribute__((swift_name("linkTo(scopes:)")));
- (void)registerCallbackCallback:(id<Api_sharedScopeCallback>)callback __attribute__((swift_name("registerCallback(callback:)")));
- (NSString *)description __attribute__((swift_name("description()")));
- (void)unlinkScopes:(Api_sharedKotlinArray<Api_sharedScope *> *)scopes __attribute__((swift_name("unlink(scopes:)")));
@property (readonly) NSMutableArray<Api_sharedParametersHolder *> *_parameterStack __attribute__((swift_name("_parameterStack")));
@property id _Nullable _source __attribute__((swift_name("_source")));
@property (readonly) BOOL closed __attribute__((swift_name("closed")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) BOOL isRoot __attribute__((swift_name("isRoot")));
@property (readonly) Api_sharedLogger *logger __attribute__((swift_name("logger")));
@property (readonly) id<Api_sharedQualifier> scopeQualifier __attribute__((swift_name("scopeQualifier")));
@end

__attribute__((swift_name("ScopeCallback")))
@protocol Api_sharedScopeCallback
@required
- (void)onScopeCloseScope:(Api_sharedScope *)scope __attribute__((swift_name("onScopeClose(scope:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InstanceRegistry")))
@interface Api_sharedInstanceRegistry : Api_sharedBase
- (instancetype)initWith_koin:(Api_sharedKoin *)_koin __attribute__((swift_name("init(_koin:)"))) __attribute__((objc_designated_initializer));
- (void)saveMappingAllowOverride:(BOOL)allowOverride mapping:(NSString *)mapping factory:(Api_sharedInstanceFactory<id> *)factory logWarning:(BOOL)logWarning __attribute__((swift_name("saveMapping(allowOverride:mapping:factory:logWarning:)")));
- (int32_t)size __attribute__((swift_name("size()")));
@property (readonly) Api_sharedKoin *_koin __attribute__((swift_name("_koin")));
@property (readonly) NSDictionary<NSString *, Api_sharedInstanceFactory<id> *> *instances __attribute__((swift_name("instances")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PropertyRegistry")))
@interface Api_sharedPropertyRegistry : Api_sharedBase
- (instancetype)initWith_koin:(Api_sharedKoin *)_koin __attribute__((swift_name("init(_koin:)"))) __attribute__((objc_designated_initializer));
- (void)close __attribute__((swift_name("close()")));
- (void)deletePropertyKey:(NSString *)key __attribute__((swift_name("deleteProperty(key:)")));
- (id _Nullable)getPropertyKey:(NSString *)key __attribute__((swift_name("getProperty(key:)")));
- (void)savePropertiesProperties:(NSDictionary<NSString *, id> *)properties __attribute__((swift_name("saveProperties(properties:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ScopeRegistry")))
@interface Api_sharedScopeRegistry : Api_sharedBase
- (instancetype)initWith_koin:(Api_sharedKoin *)_koin __attribute__((swift_name("init(_koin:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) Api_sharedScopeRegistryCompanion *companion __attribute__((swift_name("companion")));
- (void)loadScopesModules:(NSSet<Api_sharedModule *> *)modules __attribute__((swift_name("loadScopes(modules:)")));
@property (readonly) Api_sharedScope *rootScope __attribute__((swift_name("rootScope")));
@property (readonly) NSSet<id<Api_sharedQualifier>> *scopeDefinitions __attribute__((swift_name("scopeDefinitions")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ScopeRegistry.Companion")))
@interface Api_sharedScopeRegistryCompanion : Api_sharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) Api_sharedScopeRegistryCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((swift_name("KoinComponent")))
@protocol Api_sharedKoinComponent
@required
- (Api_sharedKoin *)getKoin __attribute__((swift_name("getKoin()")));
@end

__attribute__((swift_name("KoinScopeComponent")))
@protocol Api_sharedKoinScopeComponent <Api_sharedKoinComponent>
@required
- (void)closeScope __attribute__((swift_name("closeScope()")));
@property (readonly) Api_sharedScope *scope __attribute__((swift_name("scope")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Module")))
@interface Api_sharedModule : Api_sharedBase
- (instancetype)initWith_createdAtStart:(BOOL)_createdAtStart __attribute__((swift_name("init(_createdAtStart:)"))) __attribute__((objc_designated_initializer));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryQualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition __attribute__((swift_name("factory(qualifier:definition:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (void)includesModule:(Api_sharedKotlinArray<Api_sharedModule *> *)module __attribute__((swift_name("includes(module:)")));
- (void)includesModule_:(NSArray<Api_sharedModule *> *)module __attribute__((swift_name("includes(module_:)")));
- (NSArray<Api_sharedModule *> *)plusModules:(NSArray<Api_sharedModule *> *)modules __attribute__((swift_name("plus(modules:)")));
- (NSArray<Api_sharedModule *> *)plusModule:(Api_sharedModule *)module __attribute__((swift_name("plus(module:)")));
- (void)scopeQualifier:(id<Api_sharedQualifier>)qualifier scopeSet:(void (^)(Api_sharedScopeDSL *))scopeSet __attribute__((swift_name("scope(qualifier:scopeSet:)")));
- (void)scopeScopeSet:(void (^)(Api_sharedScopeDSL *))scopeSet __attribute__((swift_name("scope(scopeSet:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleQualifier:(id<Api_sharedQualifier> _Nullable)qualifier createdAtStart:(BOOL)createdAtStart definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition __attribute__((swift_name("single(qualifier:createdAtStart:definition:)")));
@property (readonly) Api_sharedMutableSet<Api_sharedSingleInstanceFactory<id> *> *eagerInstances __attribute__((swift_name("eagerInstances")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) BOOL isLoaded __attribute__((swift_name("isLoaded")));
@end

__attribute__((swift_name("Qualifier")))
@protocol Api_sharedQualifier
@required
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StringQualifier")))
@interface Api_sharedStringQualifier : Api_sharedBase <Api_sharedQualifier>
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()"))) __attribute__((deprecated("use corresponding property instead")));
- (Api_sharedStringQualifier *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TypeQualifier")))
@interface Api_sharedTypeQualifier : Api_sharedBase <Api_sharedQualifier>
- (instancetype)initWithType:(id<Api_sharedKotlinKClass>)type __attribute__((swift_name("init(type:)"))) __attribute__((objc_designated_initializer));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) id<Api_sharedKotlinKClass> type __attribute__((swift_name("type")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((swift_name("KotlinThrowable")))
@interface Api_sharedKotlinThrowable : Api_sharedBase
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (Api_sharedKotlinArray<NSString *> *)getStackTrace __attribute__((swift_name("getStackTrace()")));
- (void)printStackTrace __attribute__((swift_name("printStackTrace()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) Api_sharedKotlinThrowable * _Nullable cause __attribute__((swift_name("cause")));
@property (readonly) NSString * _Nullable message __attribute__((swift_name("message")));
- (NSError *)asError __attribute__((swift_name("asError()")));
@end

__attribute__((swift_name("KotlinException")))
@interface Api_sharedKotlinException : Api_sharedKotlinThrowable
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("BrokenDefinitionException")))
@interface Api_sharedBrokenDefinitionException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ClosedScopeException")))
@interface Api_sharedClosedScopeException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DefinitionOverrideException")))
@interface Api_sharedDefinitionOverrideException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DefinitionParameterException")))
@interface Api_sharedDefinitionParameterException : Api_sharedKotlinException
- (instancetype)initWithStr:(NSString *)str __attribute__((swift_name("init(str:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InstanceCreationException")))
@interface Api_sharedInstanceCreationException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg parent:(Api_sharedKotlinException *)parent __attribute__((swift_name("init(msg:parent:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KoinAppAlreadyStartedException")))
@interface Api_sharedKoinAppAlreadyStartedException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MissingPropertyException")))
@interface Api_sharedMissingPropertyException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NoBeanDefFoundException")))
@interface Api_sharedNoBeanDefFoundException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NoParameterFoundException")))
@interface Api_sharedNoParameterFoundException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NoPropertyFileFoundException")))
@interface Api_sharedNoPropertyFileFoundException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NoScopeDefFoundException")))
@interface Api_sharedNoScopeDefFoundException : Api_sharedKotlinException
- (instancetype)initWithS:(NSString *)s __attribute__((swift_name("init(s:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ScopeAlreadyCreatedException")))
@interface Api_sharedScopeAlreadyCreatedException : Api_sharedKotlinException
- (instancetype)initWithS:(NSString *)s __attribute__((swift_name("init(s:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ScopeNotCreatedException")))
@interface Api_sharedScopeNotCreatedException : Api_sharedKotlinException
- (instancetype)initWithMsg:(NSString *)msg __attribute__((swift_name("init(msg:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(Api_sharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("BeanDefinition")))
@interface Api_sharedBeanDefinition<T> : Api_sharedBase
- (instancetype)initWithScopeQualifier:(id<Api_sharedQualifier>)scopeQualifier primaryType:(id<Api_sharedKotlinKClass>)primaryType qualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(T _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition kind:(Api_sharedKind *)kind secondaryTypes:(NSArray<id<Api_sharedKotlinKClass>> *)secondaryTypes __attribute__((swift_name("init(scopeQualifier:primaryType:qualifier:definition:kind:secondaryTypes:)"))) __attribute__((objc_designated_initializer));
- (id<Api_sharedQualifier>)component1 __attribute__((swift_name("component1()"))) __attribute__((deprecated("use corresponding property instead")));
- (id<Api_sharedKotlinKClass>)component2 __attribute__((swift_name("component2()"))) __attribute__((deprecated("use corresponding property instead")));
- (id<Api_sharedQualifier> _Nullable)component3 __attribute__((swift_name("component3()"))) __attribute__((deprecated("use corresponding property instead")));
- (T _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))component4 __attribute__((swift_name("component4()"))) __attribute__((deprecated("use corresponding property instead")));
- (Api_sharedKind *)component5 __attribute__((swift_name("component5()"))) __attribute__((deprecated("use corresponding property instead")));
- (NSArray<id<Api_sharedKotlinKClass>> *)component6 __attribute__((swift_name("component6()"))) __attribute__((deprecated("use corresponding property instead")));
- (Api_sharedBeanDefinition<T> *)doCopyScopeQualifier:(id<Api_sharedQualifier>)scopeQualifier primaryType:(id<Api_sharedKotlinKClass>)primaryType qualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(T _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition kind:(Api_sharedKind *)kind secondaryTypes:(NSArray<id<Api_sharedKotlinKClass>> *)secondaryTypes __attribute__((swift_name("doCopy(scopeQualifier:primaryType:qualifier:definition:kind:secondaryTypes:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (BOOL)hasTypeClazz:(id<Api_sharedKotlinKClass>)clazz __attribute__((swift_name("hasType(clazz:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (BOOL)isClazz:(id<Api_sharedKotlinKClass>)clazz qualifier:(id<Api_sharedQualifier> _Nullable)qualifier scopeDefinition:(id<Api_sharedQualifier>)scopeDefinition __attribute__((swift_name("is(clazz:qualifier:scopeDefinition:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@property Api_sharedCallbacks<T> *callbacks __attribute__((swift_name("callbacks")));
@property (readonly) T _Nullable (^definition)(Api_sharedScope *, Api_sharedParametersHolder *) __attribute__((swift_name("definition")));
@property (readonly) Api_sharedKind *kind __attribute__((swift_name("kind")));
@property (readonly) id<Api_sharedKotlinKClass> primaryType __attribute__((swift_name("primaryType")));
@property id<Api_sharedQualifier> _Nullable qualifier __attribute__((swift_name("qualifier")));
@property (readonly) id<Api_sharedQualifier> scopeQualifier __attribute__((swift_name("scopeQualifier")));
@property NSArray<id<Api_sharedKotlinKClass>> *secondaryTypes __attribute__((swift_name("secondaryTypes")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Callbacks")))
@interface Api_sharedCallbacks<T> : Api_sharedBase
- (instancetype)initWithOnClose:(void (^ _Nullable)(T _Nullable))onClose __attribute__((swift_name("init(onClose:)"))) __attribute__((objc_designated_initializer));
- (void (^ _Nullable)(T _Nullable))component1 __attribute__((swift_name("component1()"))) __attribute__((deprecated("use corresponding property instead")));
- (Api_sharedCallbacks<T> *)doCopyOnClose:(void (^ _Nullable)(T _Nullable))onClose __attribute__((swift_name("doCopy(onClose:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) void (^ _Nullable onClose)(T _Nullable) __attribute__((swift_name("onClose")));
@end

__attribute__((swift_name("KotlinComparable")))
@protocol Api_sharedKotlinComparable
@required
- (int32_t)compareToOther:(id _Nullable)other __attribute__((swift_name("compareTo(other:)")));
@end

__attribute__((swift_name("KotlinEnum")))
@interface Api_sharedKotlinEnum<E> : Api_sharedBase <Api_sharedKotlinComparable>
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) Api_sharedKotlinEnumCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(E)other __attribute__((swift_name("compareTo(other:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@property (readonly) int32_t ordinal __attribute__((swift_name("ordinal")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kind")))
@interface Api_sharedKind : Api_sharedKotlinEnum<Api_sharedKind *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) Api_sharedKind *singleton __attribute__((swift_name("singleton")));
@property (class, readonly) Api_sharedKind *factory __attribute__((swift_name("factory")));
@property (class, readonly) Api_sharedKind *scoped __attribute__((swift_name("scoped")));
+ (Api_sharedKotlinArray<Api_sharedKind *> *)values __attribute__((swift_name("values()")));
@end

__attribute__((swift_name("InstanceFactory")))
@interface Api_sharedInstanceFactory<T> : Api_sharedLockable
- (instancetype)initWithBeanDefinition:(Api_sharedBeanDefinition<T> *)beanDefinition __attribute__((swift_name("init(beanDefinition:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
@property (class, readonly, getter=companion) Api_sharedInstanceFactoryCompanion *companion __attribute__((swift_name("companion")));
- (T _Nullable)createContext:(Api_sharedInstanceContext *)context __attribute__((swift_name("create(context:)")));
- (void)dropScope:(Api_sharedScope * _Nullable)scope __attribute__((swift_name("drop(scope:)")));
- (void)dropAll __attribute__((swift_name("dropAll()")));
- (T _Nullable)getContext:(Api_sharedInstanceContext *)context __attribute__((swift_name("get(context:)")));
- (BOOL)isCreatedContext:(Api_sharedInstanceContext * _Nullable)context __attribute__((swift_name("isCreated(context:)")));
@property (readonly) Api_sharedBeanDefinition<T> *beanDefinition __attribute__((swift_name("beanDefinition")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FactoryInstanceFactory")))
@interface Api_sharedFactoryInstanceFactory<T> : Api_sharedInstanceFactory<T>
- (instancetype)initWithBeanDefinition:(Api_sharedBeanDefinition<T> *)beanDefinition __attribute__((swift_name("init(beanDefinition:)"))) __attribute__((objc_designated_initializer));
- (void)dropScope:(Api_sharedScope * _Nullable)scope __attribute__((swift_name("drop(scope:)")));
- (void)dropAll __attribute__((swift_name("dropAll()")));
- (T _Nullable)getContext:(Api_sharedInstanceContext *)context __attribute__((swift_name("get(context:)")));
- (BOOL)isCreatedContext:(Api_sharedInstanceContext * _Nullable)context __attribute__((swift_name("isCreated(context:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InstanceContext")))
@interface Api_sharedInstanceContext : Api_sharedBase
- (instancetype)initWithKoin:(Api_sharedKoin *)koin scope:(Api_sharedScope *)scope parameters:(Api_sharedParametersHolder * _Nullable)parameters __attribute__((swift_name("init(koin:scope:parameters:)"))) __attribute__((objc_designated_initializer));
@property (readonly) Api_sharedKoin *koin __attribute__((swift_name("koin")));
@property (readonly) Api_sharedParametersHolder * _Nullable parameters __attribute__((swift_name("parameters")));
@property (readonly) Api_sharedScope *scope __attribute__((swift_name("scope")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InstanceFactoryCompanion")))
@interface Api_sharedInstanceFactoryCompanion : Api_sharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) Api_sharedInstanceFactoryCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) NSString *ERROR_SEPARATOR __attribute__((swift_name("ERROR_SEPARATOR")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ScopedInstanceFactory")))
@interface Api_sharedScopedInstanceFactory<T> : Api_sharedInstanceFactory<T>
- (instancetype)initWithBeanDefinition:(Api_sharedBeanDefinition<T> *)beanDefinition __attribute__((swift_name("init(beanDefinition:)"))) __attribute__((objc_designated_initializer));
- (T _Nullable)createContext:(Api_sharedInstanceContext *)context __attribute__((swift_name("create(context:)")));
- (void)dropScope:(Api_sharedScope * _Nullable)scope __attribute__((swift_name("drop(scope:)")));
- (void)dropAll __attribute__((swift_name("dropAll()")));
- (T _Nullable)getContext:(Api_sharedInstanceContext *)context __attribute__((swift_name("get(context:)")));
- (BOOL)isCreatedContext:(Api_sharedInstanceContext * _Nullable)context __attribute__((swift_name("isCreated(context:)")));
- (void)refreshInstanceScopeID:(NSString *)scopeID instance:(id)instance __attribute__((swift_name("refreshInstance(scopeID:instance:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SingleInstanceFactory")))
@interface Api_sharedSingleInstanceFactory<T> : Api_sharedInstanceFactory<T>
- (instancetype)initWithBeanDefinition:(Api_sharedBeanDefinition<T> *)beanDefinition __attribute__((swift_name("init(beanDefinition:)"))) __attribute__((objc_designated_initializer));
- (T _Nullable)createContext:(Api_sharedInstanceContext *)context __attribute__((swift_name("create(context:)")));
- (void)dropScope:(Api_sharedScope * _Nullable)scope __attribute__((swift_name("drop(scope:)")));
- (void)dropAll __attribute__((swift_name("dropAll()")));
- (T _Nullable)getContext:(Api_sharedInstanceContext *)context __attribute__((swift_name("get(context:)")));
- (BOOL)isCreatedContext:(Api_sharedInstanceContext * _Nullable)context __attribute__((swift_name("isCreated(context:)")));
@end

__attribute__((swift_name("Logger")))
@interface Api_sharedLogger : Api_sharedBase
- (instancetype)initWithLevel:(Api_sharedLevel *)level __attribute__((swift_name("init(level:)"))) __attribute__((objc_designated_initializer));
- (void)debugMsg:(NSString *)msg __attribute__((swift_name("debug(msg:)")));
- (void)errorMsg:(NSString *)msg __attribute__((swift_name("error(msg:)")));
- (void)infoMsg:(NSString *)msg __attribute__((swift_name("info(msg:)")));
- (BOOL)isAtLvl:(Api_sharedLevel *)lvl __attribute__((swift_name("isAt(lvl:)")));
- (void)logLvl:(Api_sharedLevel *)lvl msg:(NSString *(^)(void))msg __attribute__((swift_name("log(lvl:msg:)")));
- (void)logLevel:(Api_sharedLevel *)level msg:(NSString *)msg __attribute__((swift_name("log(level:msg:)")));
@property Api_sharedLevel *level __attribute__((swift_name("level")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("EmptyLogger")))
@interface Api_sharedEmptyLogger : Api_sharedLogger
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithLevel:(Api_sharedLevel *)level __attribute__((swift_name("init(level:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (void)logLevel:(Api_sharedLevel *)level msg:(NSString *)msg __attribute__((swift_name("log(level:msg:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Level")))
@interface Api_sharedLevel : Api_sharedKotlinEnum<Api_sharedLevel *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) Api_sharedLevel *debug __attribute__((swift_name("debug")));
@property (class, readonly) Api_sharedLevel *info __attribute__((swift_name("info")));
@property (class, readonly) Api_sharedLevel *error __attribute__((swift_name("error")));
@property (class, readonly) Api_sharedLevel *none __attribute__((swift_name("none")));
+ (Api_sharedKotlinArray<Api_sharedLevel *> *)values __attribute__((swift_name("values()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PrintLogger")))
@interface Api_sharedPrintLogger : Api_sharedLogger
- (instancetype)initWithLevel:(Api_sharedLevel *)level __attribute__((swift_name("init(level:)"))) __attribute__((objc_designated_initializer));
- (void)logLevel:(Api_sharedLevel *)level msg:(NSString *)msg __attribute__((swift_name("log(level:msg:)")));
@end

__attribute__((swift_name("ParametersHolder")))
@interface Api_sharedParametersHolder : Api_sharedBase
- (instancetype)initWith_values:(NSMutableArray<id> *)_values __attribute__((swift_name("init(_values:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) Api_sharedParametersHolderCompanion *companion __attribute__((swift_name("companion")));
- (Api_sharedParametersHolder *)addValue:(id)value __attribute__((swift_name("add(value:)")));
- (id _Nullable)component1 __attribute__((swift_name("component1()")));
- (id _Nullable)component2 __attribute__((swift_name("component2()")));
- (id _Nullable)component3 __attribute__((swift_name("component3()")));
- (id _Nullable)component4 __attribute__((swift_name("component4()")));
- (id _Nullable)component5 __attribute__((swift_name("component5()")));
- (id _Nullable)elementAtI:(int32_t)i clazz:(id<Api_sharedKotlinKClass>)clazz __attribute__((swift_name("elementAt(i:clazz:)")));
- (id)get __attribute__((swift_name("get()")));
- (id _Nullable)getI:(int32_t)i __attribute__((swift_name("get(i:)")));
- (id _Nullable)getOrNull __attribute__((swift_name("getOrNull()")));
- (id _Nullable)getOrNullClazz:(id<Api_sharedKotlinKClass>)clazz __attribute__((swift_name("getOrNull(clazz:)")));
- (Api_sharedParametersHolder *)insertIndex:(int32_t)index value:(id)value __attribute__((swift_name("insert(index:value:)")));
- (BOOL)isEmpty __attribute__((swift_name("isEmpty()")));
- (BOOL)isNotEmpty __attribute__((swift_name("isNotEmpty()")));
- (void)setI:(int32_t)i t:(id _Nullable)t __attribute__((swift_name("set(i:t:)")));
- (int32_t)size __attribute__((swift_name("size()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<id> *values __attribute__((swift_name("values")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ParametersHolder.Companion")))
@interface Api_sharedParametersHolderCompanion : Api_sharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) Api_sharedParametersHolderCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) int32_t MAX_PARAMS __attribute__((swift_name("MAX_PARAMS")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KoinPlatformTimeTools")))
@interface Api_sharedKoinPlatformTimeTools : Api_sharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)koinPlatformTimeTools __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) Api_sharedKoinPlatformTimeTools *shared __attribute__((swift_name("shared")));
- (int64_t)getTimeInNanoSeconds __attribute__((swift_name("getTimeInNanoSeconds()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KoinPlatformTools")))
@interface Api_sharedKoinPlatformTools : Api_sharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)koinPlatformTools __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) Api_sharedKoinPlatformTools *shared __attribute__((swift_name("shared")));
- (id<Api_sharedKoinContext>)defaultContext __attribute__((swift_name("defaultContext()")));
- (Api_sharedKotlinLazyThreadSafetyMode *)defaultLazyMode __attribute__((swift_name("defaultLazyMode()")));
- (Api_sharedLogger *)defaultLoggerLevel:(Api_sharedLevel *)level __attribute__((swift_name("defaultLogger(level:)")));
- (NSString *)generateId __attribute__((swift_name("generateId()")));
- (NSString *)getClassNameKClass:(id<Api_sharedKotlinKClass>)kClass __attribute__((swift_name("getClassName(kClass:)")));
- (NSString *)getStackTraceE:(Api_sharedKotlinException *)e __attribute__((swift_name("getStackTrace(e:)")));
- (Api_sharedMutableDictionary<id, id> *)safeHashMap __attribute__((swift_name("safeHashMap()")));
- (id _Nullable)synchronizedLock:(Api_sharedLockable *)lock block:(id _Nullable (^)(void))block __attribute__((swift_name("synchronized(lock:block:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MainThreadValue")))
@interface Api_sharedMainThreadValue<T> : Api_sharedBase
- (instancetype)initWithStartVal:(T)startVal __attribute__((swift_name("init(startVal:)"))) __attribute__((objc_designated_initializer));
- (T)get __attribute__((swift_name("get()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ScopeDSL")))
@interface Api_sharedScopeDSL : Api_sharedBase
- (instancetype)initWithScopeQualifier:(id<Api_sharedQualifier>)scopeQualifier module:(Api_sharedModule *)module __attribute__((swift_name("init(scopeQualifier:module:)"))) __attribute__((objc_designated_initializer));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryQualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition __attribute__((swift_name("factory(qualifier:definition:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedQualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition __attribute__((swift_name("scoped(qualifier:definition:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleQualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition __attribute__((swift_name("single(qualifier:definition:)"))) __attribute__((unavailable("Can't use Single in a scope. Use Scoped instead")));
@property (readonly) Api_sharedModule *module __attribute__((swift_name("module")));
@property (readonly) id<Api_sharedQualifier> scopeQualifier __attribute__((swift_name("scopeQualifier")));
@end

__attribute__((swift_name("ModuleProvider")))
@protocol Api_sharedModuleProvider
@required
- (Api_sharedModule *)get __attribute__((swift_name("get()")));
@end

@interface Api_sharedBeanDefinition (Extensions)
- (void)bind __attribute__((swift_name("bind()")));
- (void)bindsClasses:(NSArray<id<Api_sharedKotlinKClass>> *)classes __attribute__((swift_name("binds(classes:)")));
- (void)createdAtStart __attribute__((swift_name("createdAtStart()")));
- (void)named __attribute__((swift_name("named()")));
- (void)namedName:(NSString *)name __attribute__((swift_name("named(name:)")));
- (void)onCloseOnClose:(void (^)(id _Nullable))onClose __attribute__((swift_name("onClose(onClose:)")));
@end

@interface Api_sharedModule (Extensions)
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(void))constructor __attribute__((swift_name("factoryOf(constructor:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(void))constructor options:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor_:(id _Nullable (^)(id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor_:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable))constructor options_:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options_:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor__:(id _Nullable (^)(id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor__:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable))constructor options__:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options__:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor___:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor___:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable))constructor options___:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options___:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor____:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options____:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor_____:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor_____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_____:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options_____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor______:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options______:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor_______:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor_______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_______:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options_______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor_________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor_________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options_________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor__________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("factoryOf(constructor__________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)factoryOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options__________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("factoryOf(constructor:options__________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)setupInstanceFactory:(Api_sharedInstanceFactory<id> *)factory options:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("setupInstance(factory:options:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(void))constructor __attribute__((swift_name("singleOf(constructor:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(void))constructor options:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor_:(id _Nullable (^)(id _Nullable))constructor __attribute__((swift_name("singleOf(constructor_:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable))constructor options_:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options_:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor__:(id _Nullable (^)(id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor__:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable))constructor options__:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options__:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor___:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor___:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable))constructor options___:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options___:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor____:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options____:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor_____:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor_____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_____:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options_____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor______:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options______:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor_______:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor_______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_______:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options_______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor_________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor_________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options_________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor__________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("singleOf(constructor__________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)singleOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options__________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("singleOf(constructor:options__________:)")));
@end

@interface Api_sharedScope (Extensions)
- (id _Nullable)doNewConstructor:(id _Nullable (^)(void))constructor __attribute__((swift_name("doNew(constructor:)")));
- (id _Nullable)doNewConstructor_:(id _Nullable (^)(id _Nullable))constructor __attribute__((swift_name("doNew(constructor_:)")));
- (id _Nullable)doNewConstructor__:(id _Nullable (^)(id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor__:)")));
- (id _Nullable)doNewConstructor___:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor___:)")));
- (id _Nullable)doNewConstructor____:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor____:)")));
- (id _Nullable)doNewConstructor_____:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor_____:)")));
- (id _Nullable)doNewConstructor______:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor______:)")));
- (id _Nullable)doNewConstructor_______:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor_______:)")));
- (id _Nullable)doNewConstructor________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor________:)")));
- (id _Nullable)doNewConstructor_________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor_________:)")));
- (id _Nullable)doNewConstructor__________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("doNew(constructor__________:)")));
@end

@interface Api_sharedScopeDSL (Extensions)
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(void))constructor __attribute__((swift_name("scopedOf(constructor:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(void))constructor options:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor_:(id _Nullable (^)(id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor_:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable))constructor options_:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options_:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor__:(id _Nullable (^)(id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor__:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable))constructor options__:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options__:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor___:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor___:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable))constructor options___:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options___:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor____:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options____:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor_____:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor_____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_____:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options_____:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor______:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options______:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor_______:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor_______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_______:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options_______:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor_________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor_________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options_________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options_________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor__________:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor __attribute__((swift_name("scopedOf(constructor__________:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)scopedOfConstructor:(id _Nullable (^)(id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable, id _Nullable))constructor options__________:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("scopedOf(constructor:options__________:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinPair")))
@interface Api_sharedKotlinPair<__covariant A, __covariant B> : Api_sharedBase
- (instancetype)initWithFirst:(A _Nullable)first second:(B _Nullable)second __attribute__((swift_name("init(first:second:)"))) __attribute__((objc_designated_initializer));
- (A _Nullable)component1 __attribute__((swift_name("component1()"))) __attribute__((deprecated("use corresponding property instead")));
- (B _Nullable)component2 __attribute__((swift_name("component2()"))) __attribute__((deprecated("use corresponding property instead")));
- (Api_sharedKotlinPair<A, B> *)doCopyFirst:(A _Nullable)first second:(B _Nullable)second __attribute__((swift_name("doCopy(first:second:)")));
- (BOOL)equalsOther:(id _Nullable)other __attribute__((swift_name("equals(other:)")));
- (int32_t)hashCode __attribute__((swift_name("hashCode()")));
- (NSString *)toString __attribute__((swift_name("toString()")));
@property (readonly) A _Nullable first __attribute__((swift_name("first")));
@property (readonly) B _Nullable second __attribute__((swift_name("second")));
@end

@interface Api_sharedKotlinPair (Extensions)
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)withOptionsOptions:(void (^)(Api_sharedBeanDefinition<id> *))options __attribute__((swift_name("withOptions(options:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)bind __attribute__((swift_name("bind()")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)bindClazz:(id<Api_sharedKotlinKClass>)clazz __attribute__((swift_name("bind(clazz:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)bindsClasses:(Api_sharedKotlinArray<id<Api_sharedKotlinKClass>> *)classes __attribute__((swift_name("binds(classes:)")));
- (Api_sharedKotlinPair<Api_sharedModule *, Api_sharedInstanceFactory<id> *> *)onCloseOnClose:(void (^)(id _Nullable))onClose __attribute__((swift_name("onClose(onClose:)")));
@end

@interface Api_sharedKotlinEnum (Extensions)
@property (readonly) id<Api_sharedQualifier> qualifier __attribute__((swift_name("qualifier")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DefaultContextExtKt")))
@interface Api_sharedDefaultContextExtKt : Api_sharedBase
+ (void)loadKoinModulesModules:(NSArray<Api_sharedModule *> *)modules __attribute__((swift_name("loadKoinModules(modules:)")));
+ (void)loadKoinModulesModule:(Api_sharedModule *)module __attribute__((swift_name("loadKoinModules(module:)")));
+ (Api_sharedKoinApplication *)startKoinKoinApplication:(Api_sharedKoinApplication *)koinApplication __attribute__((swift_name("startKoin(koinApplication:)")));
+ (Api_sharedKoinApplication *)startKoinAppDeclaration:(void (^)(Api_sharedKoinApplication *))appDeclaration __attribute__((swift_name("startKoin(appDeclaration:)")));
+ (void)stopKoin __attribute__((swift_name("stopKoin()")));
+ (void)unloadKoinModulesModules:(NSArray<Api_sharedModule *> *)modules __attribute__((swift_name("unloadKoinModules(modules:)")));
+ (void)unloadKoinModulesModule:(Api_sharedModule *)module __attribute__((swift_name("unloadKoinModules(module:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KoinScopeComponentKt")))
@interface Api_sharedKoinScopeComponentKt : Api_sharedBase
+ (Api_sharedScope *)createScope:(id<Api_sharedKoinScopeComponent>)receiver source:(id _Nullable)source __attribute__((swift_name("createScope(_:source:)")));
+ (id<Api_sharedKotlinLazy>)getOrCreateScope:(id<Api_sharedKoinScopeComponent>)receiver __attribute__((swift_name("getOrCreateScope(_:)")));
+ (NSString *)getScopeId:(id)receiver __attribute__((swift_name("getScopeId(_:)")));
+ (Api_sharedTypeQualifier *)getScopeName:(id)receiver __attribute__((swift_name("getScopeName(_:)")));
+ (Api_sharedScope * _Nullable)getScopeOrNull:(id<Api_sharedKoinScopeComponent>)receiver __attribute__((swift_name("getScopeOrNull(_:)")));
+ (id<Api_sharedKotlinLazy>)doNewScope:(id<Api_sharedKoinScopeComponent>)receiver __attribute__((swift_name("doNewScope(_:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KoinComponentKt")))
@interface Api_sharedKoinComponentKt : Api_sharedBase
+ (id)get:(id<Api_sharedKoinComponent>)receiver qualifier:(id<Api_sharedQualifier> _Nullable)qualifier parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(_:qualifier:parameters:)")));
+ (id<Api_sharedKotlinLazy>)inject:(id<Api_sharedKoinComponent>)receiver qualifier:(id<Api_sharedQualifier> _Nullable)qualifier mode:(Api_sharedKotlinLazyThreadSafetyMode *)mode parameters:(Api_sharedParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("inject(_:qualifier:mode:parameters:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ModuleKt")))
@interface Api_sharedModuleKt : Api_sharedBase
+ (Api_sharedFactoryInstanceFactory<id> *)_factoryInstanceFactoryQualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition scopeQualifier:(id<Api_sharedQualifier>)scopeQualifier __attribute__((swift_name("_factoryInstanceFactory(qualifier:definition:scopeQualifier:)")));
+ (Api_sharedScopedInstanceFactory<id> *)_scopedInstanceFactoryQualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition scopeQualifier:(id<Api_sharedQualifier>)scopeQualifier __attribute__((swift_name("_scopedInstanceFactory(qualifier:definition:scopeQualifier:)")));
+ (Api_sharedSingleInstanceFactory<id> *)_singleInstanceFactoryQualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition scopeQualifier:(id<Api_sharedQualifier>)scopeQualifier __attribute__((swift_name("_singleInstanceFactory(qualifier:definition:scopeQualifier:)")));
+ (NSArray<Api_sharedModule *> *)plus:(NSArray<Api_sharedModule *> *)receiver module:(Api_sharedModule *)module __attribute__((swift_name("plus(_:module:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("QualifierKt")))
@interface Api_sharedQualifierKt : Api_sharedBase
+ (Api_sharedTypeQualifier *)_q __attribute__((swift_name("_q()")));
+ (Api_sharedStringQualifier *)_qName:(NSString *)name __attribute__((swift_name("_q(name:)")));
+ (Api_sharedTypeQualifier *)named __attribute__((swift_name("named()")));
+ (id<Api_sharedQualifier>)namedEnum:(Api_sharedKotlinEnum<Api_sharedKotlinEnum *> *)enum_ __attribute__((swift_name("named(enum:)")));
+ (Api_sharedStringQualifier *)namedName:(NSString *)name __attribute__((swift_name("named(name:)")));
+ (Api_sharedTypeQualifier *)qualifier __attribute__((swift_name("qualifier()")));
+ (id<Api_sharedQualifier>)qualifierEnum:(Api_sharedKotlinEnum<Api_sharedKotlinEnum *> *)enum_ __attribute__((swift_name("qualifier(enum:)")));
+ (Api_sharedStringQualifier *)qualifierName:(NSString *)name __attribute__((swift_name("qualifier(name:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MeasureKt")))
@interface Api_sharedMeasureKt : Api_sharedBase
+ (double)measureDurationCode:(void (^)(void))code __attribute__((swift_name("measureDuration(code:)")));
+ (Api_sharedKotlinPair<id, Api_sharedDouble *> *)measureDurationForResultCode:(id _Nullable (^)(void))code __attribute__((swift_name("measureDurationForResult(code:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("BeanDefinitionKt")))
@interface Api_sharedBeanDefinitionKt : Api_sharedBase
+ (Api_sharedBeanDefinition<id> *)_createDefinitionKind:(Api_sharedKind *)kind qualifier:(id<Api_sharedQualifier> _Nullable)qualifier definition:(id _Nullable (^)(Api_sharedScope *, Api_sharedParametersHolder *))definition secondaryTypes:(NSArray<id<Api_sharedKotlinKClass>> *)secondaryTypes scopeQualifier:(id<Api_sharedQualifier>)scopeQualifier __attribute__((swift_name("_createDefinition(kind:qualifier:definition:secondaryTypes:scopeQualifier:)")));
+ (NSString *)indexKeyClazz:(id<Api_sharedKotlinKClass>)clazz typeQualifier:(id<Api_sharedQualifier> _Nullable)typeQualifier scopeQualifier:(id<Api_sharedQualifier>)scopeQualifier __attribute__((swift_name("indexKey(clazz:typeQualifier:scopeQualifier:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LoggerKt")))
@interface Api_sharedLoggerKt : Api_sharedBase
@property (class, readonly) NSString *KOIN_TAG __attribute__((swift_name("KOIN_TAG")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ParametersHolderKt")))
@interface Api_sharedParametersHolderKt : Api_sharedBase
+ (Api_sharedParametersHolder *)emptyParametersHolder __attribute__((swift_name("emptyParametersHolder()")));
+ (Api_sharedParametersHolder *)parametersOfParameters:(Api_sharedKotlinArray<id> *)parameters __attribute__((swift_name("parametersOf(parameters:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MainThreadSafetyKt")))
@interface Api_sharedMainThreadSafetyKt : Api_sharedBase
@property (class, readonly) BOOL isMainThread __attribute__((swift_name("isMainThread")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KoinApplicationKt")))
@interface Api_sharedKoinApplicationKt : Api_sharedBase
+ (Api_sharedKoinApplication *)koinApplicationAppDeclaration:(void (^ _Nullable)(Api_sharedKoinApplication *))appDeclaration __attribute__((swift_name("koinApplication(appDeclaration:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ModuleDSLKt")))
@interface Api_sharedModuleDSLKt : Api_sharedBase
+ (Api_sharedModule *)moduleCreatedAtStart:(BOOL)createdAtStart override:(BOOL)override moduleDeclaration:(void (^)(Api_sharedModule *))moduleDeclaration __attribute__((swift_name("module(createdAtStart:override:moduleDeclaration:)"))) __attribute__((deprecated("'override' parameter is not used anymore. See 'allowOverride' in KoinApplication")));
+ (Api_sharedModule *)moduleCreatedAtStart:(BOOL)createdAtStart moduleDeclaration:(void (^)(Api_sharedModule *))moduleDeclaration __attribute__((swift_name("module(createdAtStart:moduleDeclaration:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StringExtKt")))
@interface Api_sharedStringExtKt : Api_sharedBase
+ (NSString *)clearQuotes:(NSString *)receiver __attribute__((swift_name("clearQuotes(_:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KClassExtKt")))
@interface Api_sharedKClassExtKt : Api_sharedBase
+ (NSString *)getFullName:(id<Api_sharedKotlinKClass>)receiver __attribute__((swift_name("getFullName(_:)")));
+ (NSString *)saveCache:(id<Api_sharedKotlinKClass>)receiver __attribute__((swift_name("saveCache(_:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InjectPropertyKt")))
@interface Api_sharedInjectPropertyKt : Api_sharedBase
+ (void)inject:(id _Nullable (^)(void))receiver __attribute__((swift_name("inject(_:)")));
+ (void)inject:(id _Nullable (^)(void))receiver koin:(Api_sharedKoin *)koin __attribute__((swift_name("inject(_:koin:)")));
+ (void)inject:(id _Nullable (^)(void))receiver scope:(Api_sharedScope *)scope __attribute__((swift_name("inject(_:scope:)")));
@end

__attribute__((swift_name("KotlinKDeclarationContainer")))
@protocol Api_sharedKotlinKDeclarationContainer
@required
@end

__attribute__((swift_name("KotlinKAnnotatedElement")))
@protocol Api_sharedKotlinKAnnotatedElement
@required
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.1")
*/
__attribute__((swift_name("KotlinKClassifier")))
@protocol Api_sharedKotlinKClassifier
@required
@end

__attribute__((swift_name("KotlinKClass")))
@protocol Api_sharedKotlinKClass <Api_sharedKotlinKDeclarationContainer, Api_sharedKotlinKAnnotatedElement, Api_sharedKotlinKClassifier>
@required

/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.1")
*/
- (BOOL)isInstanceValue:(id _Nullable)value __attribute__((swift_name("isInstance(value:)")));
@property (readonly) NSString * _Nullable qualifiedName __attribute__((swift_name("qualifiedName")));
@property (readonly) NSString * _Nullable simpleName __attribute__((swift_name("simpleName")));
@end

__attribute__((swift_name("KotlinLazy")))
@protocol Api_sharedKotlinLazy
@required
- (BOOL)isInitialized __attribute__((swift_name("isInitialized()")));
@property (readonly) id _Nullable value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinLazyThreadSafetyMode")))
@interface Api_sharedKotlinLazyThreadSafetyMode : Api_sharedKotlinEnum<Api_sharedKotlinLazyThreadSafetyMode *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) Api_sharedKotlinLazyThreadSafetyMode *synchronized __attribute__((swift_name("synchronized")));
@property (class, readonly) Api_sharedKotlinLazyThreadSafetyMode *publication __attribute__((swift_name("publication")));
@property (class, readonly) Api_sharedKotlinLazyThreadSafetyMode *none __attribute__((swift_name("none")));
+ (Api_sharedKotlinArray<Api_sharedKotlinLazyThreadSafetyMode *> *)values __attribute__((swift_name("values()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinArray")))
@interface Api_sharedKotlinArray<T> : Api_sharedBase
+ (instancetype)arrayWithSize:(int32_t)size init:(T _Nullable (^)(Api_sharedInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (T _Nullable)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (id<Api_sharedKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(T _Nullable)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size __attribute__((swift_name("size")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinEnumCompanion")))
@interface Api_sharedKotlinEnumCompanion : Api_sharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) Api_sharedKotlinEnumCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((swift_name("KotlinIterator")))
@protocol Api_sharedKotlinIterator
@required
- (BOOL)hasNext __attribute__((swift_name("hasNext()")));
- (id _Nullable)next __attribute__((swift_name("next()")));
@end

#pragma pop_macro("_Nullable_result")
#pragma clang diagnostic pop
NS_ASSUME_NONNULL_END
