@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package cast

import org.khronos.webgl.*

typealias EventHandler = (event: Event) -> Unit

typealias Id3EventHandler = (event: Id3Event) -> Unit

typealias ErrorEventHandler = (event: ErrorEvent) -> Unit

typealias MediaElementEventHandler = (event: MediaElementEvent) -> Unit

typealias PauseEventHandler = (event: MediaPauseEvent) -> Unit

typealias BitrateChangedEventHandler = (event: BitrateChangedEvent) -> Unit

typealias BreaksEventHandler = (event: BreaksEvent) -> Unit

typealias BufferingEventHandler = (event: BufferingEvent) -> Unit

typealias CacheLoadedEventHandler = (event: CacheLoadedEvent) -> Unit

typealias CacheItemEventHandler = (event: CacheItemEvent) -> Unit

typealias ClipEndedEventHandler = (event: ClipEndedEvent) -> Unit

typealias EmsgEventHandler = (event: EmsgEvent) -> Unit

typealias MediaStatusEventHandler = (event: MediaStatusEvent) -> Unit

typealias CustomStateEventHandler = (event: CustomStateEvent) -> Unit

typealias MediaInformationChangedEventHandler = (event: MediaInformationChangedEvent) -> Unit

typealias MediaFinishedEventHandler = (event: MediaFinishedEvent) -> Unit

typealias LoadEventHandler = (event: LoadEvent) -> Unit

typealias SegmentDownloadedEventHandler = (event: SegmentDownloadedEvent) -> Unit

typealias RequestEventHandler = (event: RequestEvent) -> Unit

typealias LiveStatusEventHandler = (event: LiveStatusEvent) -> Unit

typealias PlayerDataChangedEventHandler = (event: PlayerDataChangedEvent) -> Unit

typealias RequestHandler = (request: NetworkRequestInfo) -> Unit

typealias BinaryHandler = (data: Uint8Array) -> Uint8Array