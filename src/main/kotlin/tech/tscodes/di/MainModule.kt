package tech.tscodes.di

import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import tech.tscodes.data.MessageDataSource
import tech.tscodes.data.MessageDataSourceImpl
import tech.tscodes.room.RoomController

val mainModule = module {
    single {
        KMongo.createClient().coroutine.getDatabase("message_db")
    }

    single<MessageDataSource> {
        MessageDataSourceImpl(get())
    }
    single {
        RoomController(get())
    }
}