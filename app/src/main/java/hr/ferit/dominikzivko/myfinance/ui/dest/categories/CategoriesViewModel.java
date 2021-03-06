package hr.ferit.dominikzivko.myfinance.ui.dest.categories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import hr.ferit.dominikzivko.myfinance.data.BillRepository;
import hr.ferit.dominikzivko.myfinance.data.CategoryDetails;

public class CategoriesViewModel extends ViewModel {

    private final BillRepository billRepository;

    private LiveData<List<CategoryDetails>> categories;

    public CategoriesViewModel(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public LiveData<List<CategoryDetails>> getCategories() {
        if (categories == null) {
            categories = billRepository.getCategories();
        }
        return categories;
    }
}
