package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bg */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bg.class */
final class C1446bg extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1446bg f3753a = new C1446bg();


    C1446bg() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(18);
        return receiver.getEmModelSource().getEmDrawOrderGroupSources().getDrawOrderGroupObjectSourcesCount();
    }
}
