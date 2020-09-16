// Generated by Dagger (https://dagger.dev).
package com.github.owlruslan.rider.services.map.mapbox;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapboxService_MembersInjector implements MembersInjector<MapboxService> {
  private final Provider<Context> contextProvider;

  public MapboxService_MembersInjector(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<MapboxService> create(Provider<Context> contextProvider) {
    return new MapboxService_MembersInjector(contextProvider);
  }

  @Override
  public void injectMembers(MapboxService instance) {
    injectContext(instance, contextProvider.get());
  }

  @InjectedFieldSignature("com.github.owlruslan.rider.services.map.mapbox.MapboxService.context")
  public static void injectContext(MapboxService instance, Context context) {
    instance.context = context;
  }
}
