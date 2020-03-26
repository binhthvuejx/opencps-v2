<template>
	<div>
		<v-tabs v-model="tabActive">
			<v-tabs-bar class="cyan" dark>
				<v-tabs-item v-for="tab in tabs" :key="tab.value"	:href="'#' + tab.value" ripple @click="menuTabChange(tab, $event)">
					<v-menu offset-y v-if="tab.value === 'tab2'">
						<span slot="activator">{{tab.text}}</span>
						<v-list style="width: 250px;">
							<v-list-tile v-for="(item, index) in listgroupHoSoFilterItems"	:key="index" @click="groupHoSoFilter(item, index)" :class="{active: index === indexListStatus}">
								<#-- <v-list-tile-action>
									<i aria-hidden="true" class="material-icons icon">folder</i>
								</v-list-tile-action> -->

								<v-list-tile-content>
									<v-list-tile-title>{{item.title}}</v-list-tile-title>
								</v-list-tile-content>

								<v-list-tile-action>
									<span class="px-3" style="background-color: #ccc;">{{item.count}}</span>
								</v-list-tile-action>
							</v-list-tile>
						</v-list>
						<#-- <div style="width: 250px; height: 220px; background: #fff;" class="center-all" v-else>
							<v-progress-circular indeterminate v-bind:size="20" color="purple"></v-progress-circular>
						</div> -->
					</v-menu>
					<span v-else>{{tab.text}}</span>
				</v-tabs-item>
				<v-tabs-item v-if="isAdminUser === 'true'" key="qltk"	href="#quanlytaikhoan" ripple @click="menuTabChange('qltk', $event)">
					<span>Quản lý tài khoản</span>
				</v-tabs-item>
				<v-tabs-slider color="blue"></v-tabs-slider>
			</v-tabs-bar>
			<v-tabs-items>
				<v-tabs-content v-for="tab in tabs"	:key="tab.value" :id="tab.value">
					<div></div>
				</v-tabs-content>
				<v-tabs-content v-if="isAdminUser === 'true'"	key="qltk" id="quanlytaikhoan">
					<div></div>
				</v-tabs-content>
			</v-tabs-items>
		</v-tabs>
	</div>
</template>