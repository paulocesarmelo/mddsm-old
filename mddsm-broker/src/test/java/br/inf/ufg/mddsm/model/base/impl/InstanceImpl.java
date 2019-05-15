/**
 */
package base.impl;

import base.Instance;

import base.common.Interface;

import base.metadata.Feature;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link base.impl.InstanceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link base.impl.InstanceImpl#getImpl <em>Impl</em>}</li>
 *   <li>{@link base.impl.InstanceImpl#getIface <em>Iface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends EObjectImpl implements Instance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The default value of the '{@link #getImpl() <em>Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpl() <em>Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected String impl = IMPL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIface() <em>Iface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIface()
	 * @generated
	 * @ordered
	 */
	protected Interface iface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackageImpl.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackageImpl.INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, BasePackageImpl.INSTANCE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpl() {
		return impl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpl(String newImpl) {
		String oldImpl = impl;
		impl = newImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackageImpl.INSTANCE__IMPL, oldImpl, impl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getIface() {
		if (iface != null && iface.eIsProxy()) {
			InternalEObject oldIface = (InternalEObject) iface;
			iface = (Interface) eResolveProxy(oldIface);
			if (iface != oldIface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackageImpl.INSTANCE__IFACE, oldIface,
							iface));
			}
		}
		return iface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetIface() {
		return iface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIface(Interface newIface) {
		Interface oldIface = iface;
		iface = newIface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackageImpl.INSTANCE__IFACE, oldIface, iface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasePackageImpl.INSTANCE__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasePackageImpl.INSTANCE__NAME:
			return getName();
		case BasePackageImpl.INSTANCE__FEATURES:
			return getFeatures();
		case BasePackageImpl.INSTANCE__IMPL:
			return getImpl();
		case BasePackageImpl.INSTANCE__IFACE:
			if (resolve)
				return getIface();
			return basicGetIface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasePackageImpl.INSTANCE__NAME:
			setName((String) newValue);
			return;
		case BasePackageImpl.INSTANCE__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends Feature>) newValue);
			return;
		case BasePackageImpl.INSTANCE__IMPL:
			setImpl((String) newValue);
			return;
		case BasePackageImpl.INSTANCE__IFACE:
			setIface((Interface) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BasePackageImpl.INSTANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasePackageImpl.INSTANCE__FEATURES:
			getFeatures().clear();
			return;
		case BasePackageImpl.INSTANCE__IMPL:
			setImpl(IMPL_EDEFAULT);
			return;
		case BasePackageImpl.INSTANCE__IFACE:
			setIface((Interface) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BasePackageImpl.INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasePackageImpl.INSTANCE__FEATURES:
			return features != null && !features.isEmpty();
		case BasePackageImpl.INSTANCE__IMPL:
			return IMPL_EDEFAULT == null ? impl != null : !IMPL_EDEFAULT.equals(impl);
		case BasePackageImpl.INSTANCE__IFACE:
			return iface != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", impl: ");
		result.append(impl);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
