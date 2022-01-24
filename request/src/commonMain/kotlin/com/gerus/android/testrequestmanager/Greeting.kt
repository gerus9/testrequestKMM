package com.gerus.android.testrequestmanager

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Greeting {
    private val httpClient = HttpClient()

    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun newFunction(): String {
        return "Hello CM!"
    }

    suspend fun request(): String {
        val response : HttpResponse = httpClient.get("https://mocki.io/v1/73341bab-d7ea-45bc-b41e-d7b76e54aad8")
        return response.toString()
    }
}