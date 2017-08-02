package cn.jingzhuan.lib.chart.demo;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.airbnb.epoxy.AutoModel;
import com.airbnb.epoxy.EpoxyController;

/**
 * Created by Donglua on 17/7/26.
 */

public class DemoAdapterController extends EpoxyController {

    @AutoModel LineChartModel_ lineChartModel;
    @AutoModel MinuteChartModel_ minuteChartModel;
    @AutoModel BarChartModel_ barChartModel_;

    @Override
    protected void buildModels() {

        new LayoutDescTextBindingModel_().id("LineDataSet").text("LineDataSet Chart").addTo(this);

        lineChartModel.addTo(this);

        new LayoutDescTextBindingModel_().id("Minute").text("Minute Chart").addTo(this);

        minuteChartModel.onClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Click", Toast.LENGTH_SHORT).show();
            }
        }).addTo(this);

        new LayoutDescTextBindingModel_().id("Bar").text("Bar Chart").addTo(this);

        barChartModel_.addTo(this);
    }
}
