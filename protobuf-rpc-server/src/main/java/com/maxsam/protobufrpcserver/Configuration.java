package com.maxsam.protobufrpcserver;

import com.google.protobuf.Service;
import com.maxsam.pingpong.proto.PingPongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@org.springframework.context.annotation.Configuration
@EnableWebSocket
public class Configuration implements WebSocketConfigurer {
    @Autowired
    PingPongHandler handler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(handler, "/ping-pong").setAllowedOrigins("*");
    }

    @Bean(initMethod="init")
    public PingPongServiceImp pingPongServiceImp() {
        return new PingPongServiceImp();
    }

    @Bean
    public Service pingPongService(){
        return PingPongService.newReflectiveService(pingPongServiceImp());
    }
}
